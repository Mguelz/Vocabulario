package vocabulario.v2;

import java.util.HashMap;
import java.util.Map;

public class VocabularioV2 {
	// nao estou usando
	public void allWords() {
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
	}

	public void mensagemAcertou() {
		System.out.println("---------------------------------------");
		System.out.println("Parabéns!!! você ACERTOU");
		System.out.println("---------------------------------------");
	}

	public void mensagemFecharPrograma() {
		System.out.println("\n---------------------------------------");
		System.out.println("O Programa Fechou!");
		System.out.println("---------------------------------------");
	}

}
