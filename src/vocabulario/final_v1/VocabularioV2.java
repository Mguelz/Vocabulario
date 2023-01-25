package vocabulario.final_v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VocabularioV2 {
	/**
	 * Criando um map que contem tanto a tradução da palavra quanto a palavra em ingles
	 * 
	 * @return
	 * @author Miguel Arcanjo
	 */
	public Map<String, String> allWords() {
		Map<String, String> map = new HashMap<>();
		map.put("fundamental", "elementary");
		map.put("cada", "each");
		map.put("inicio", "beginnig");
		map.put("conteudo", "contents");
		map.put("escolher", "choose");
		map.put("fazer", "made");
		map.put("destinado", "intended");
		map.put("medir", "measure");
		map.put("utilizacao", "usage");
		map.put("quais", "which");
		map.put("guia", "guide");
		map.put("funciona", "works");
		map.put("deixar", "give");
		map.put("ativo", "active");
		map.put("promove", "promotes");
		map.put("formulario", "forms");
		map.put("recursos", "features");
		map.put("variar", "differ");
		map.put("acordo", "deal");
		map.put("ensinou", "taught");
		map.put("dirigido", "addressed");
		map.put("perto", "near");
		map.put("bem", "well");
		map.put("chuveiro", "shower");
		map.put("inverno", "winter");
		map.put("local", "site");
		map.put("significar", "mean");
		aleatorizarElementos(map);
		return map;
	}

	/**
	 * Apresenta ao usuario uma mensagem de acerto
	 */
	public void mensagemAcertou() {
		System.out.println("---------------------------------------");
		System.out.println("Parabéns!!! você ACERTOU");
		System.out.println("---------------------------------------");
	}

	/**
	 * Apresenta ao usuario uma mensagem que o programa fechou
	 */
	public void mensagemFecharPrograma() {
		System.out.println("\n---------------------------------------");
		System.out.println("O Programa Fechou!");
		System.out.println("---------------------------------------");
	}

	/**
	 * Reinbaralhando a sequencia do HashMap, tornando todas as vezes que rodar o
	 * código ser aleatório
	 * 
	 * @param map
	 * @return novoMap
	 * @author Miguel com a ajuda do Wiu
	 */
	private static Map<String, String> aleatorizarElementos(Map<String, String> map) {
		Map<String, String> novoMap = new LinkedHashMap<String, String>();
		List<String> chaves = new ArrayList<String>(map.keySet());
		Collections.shuffle(chaves);
		chaves.forEach(e -> novoMap.put(e, map.get(e)));
		return novoMap;
	}

}
