package vocabulario.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class VocabularioV2Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VocabularioV2 vocabulario = new VocabularioV2();

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

		map = misturarElementos(map);
		
		boolean loop = true;
		String digitado = "";

		while (loop) {
			loop = true;
			for (String key : map.keySet()) {
				System.out.println("Qual a tradução da palavra - \"" + map.get(key) + "\"");
				digitado = scanner.next();
				if (digitado.toLowerCase().equals(key)) { 
					mensagemAcertou();
				} else if (digitado.toLowerCase().equals("close")) {
					mensagemFecharPrograma();
					loop = false; 
					break;
				} else {
					System.out.println("---------------------------------------");
					System.out.println("ERROU, a resposta era \"" + key + "\" Você digitou \"" + digitado + "\" ");
					System.out.println("---------------------------------------");
				}
			} // for
		} // while

		scanner.close();
	} // main

	// reinbaralhando a sequencia do HashMap, tornando todas as vezes que rodar o
	// código ser aleatório
	private static Map<String, String> misturarElementos(Map<String, String> map) {
		Map<String, String> novoMap = new LinkedHashMap<String, String>();
		List<String> chaves = new ArrayList<String>(map.keySet());
		Collections.shuffle(chaves);
		chaves.forEach(e -> novoMap.put(e, map.get(e)));
		return novoMap;
	}
	
	private static void mensagemAcertou(){
		System.out.println("---------------------------------------");
		System.out.println("Parabéns!!! você ACERTOU");
		System.out.println("---------------------------------------");
	}
	
	public static void mensagemFecharPrograma() {
		System.out.println("\n---------------------------------------");
		System.out.println("O Programa Fechou!");
		System.out.println("---------------------------------------");
	}

} // classe
