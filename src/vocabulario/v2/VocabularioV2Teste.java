package vocabulario.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * O usuario terá que acertar a tradução da palavra que o sistema apresentar para ele
 * 
 * @author Miguel Arcanjo
 */
public class VocabularioV2Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VocabularioV2 vocabulario = new VocabularioV2();
		
		boolean loop = true;
		String digitado = "";

		while (loop) {
			loop = true;
			for (String key : vocabulario.allWords().keySet()) {
				System.out.println("Qual a tradução da palavra - \"" + vocabulario.allWords().get(key) + "\"");
				digitado = scanner.next();
				if (digitado.toLowerCase().equals(key)) {
					vocabulario.mensagemAcertou();
				} else if (digitado.toLowerCase().equals("close")) {
					vocabulario.mensagemFecharPrograma();
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

	/**
	 * Reinbaralhando a sequencia do HashMap, tornando todas as vezes que rodar o código ser aleatório
	 * 
	 * @param map
	 * @return novoMap
	 * @author Miguel com a ajuda do Wiu
	 */
	
} // classe
