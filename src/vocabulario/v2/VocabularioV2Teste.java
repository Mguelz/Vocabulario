package vocabulario.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class VocabularioV2Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VocabularioV2 vocabulario = new VocabularioV2();
		Random random = new Random();

		Map<String, String> map = new HashMap<>();
		map.put("oi", "hello");
		map.put("fundamental", "elementary");
		map.put("cada", "each");
		map.put("para", "for");
		map.put("se", "if");
		map.put("enquanto", "while");
		map.put("fez", "made");
		map.put("funciona", "works");
		map.put("deixar", "give");
		map.put("ativo", "active");
		map.put("promove", "promotes");
		map.put("formulario", "forms");

//		// apresentar uma palavra aleatorio para o usuario
//		for (int i = 0; i < map.size(); i++) {
//			String palavraEscolhida = map.get(aleatorio);
//			System.out.println(palavraEscolhida);

		boolean loop = true;
		String digitado = "";

		while (loop) {
			loop = true;
			for (String key : map.keySet()) {
				System.out.println("Qual a tradução da palavra - \"" + map.get(key) + "\"");
				digitado = scanner.next();
				if (digitado.toLowerCase().equals(key)) { // muda tudo para minusculo e compara com a chave do map
					System.out.println("---------------------------------------");
					System.out.println("Parabéns!!! você ACERTOU");
					System.out.println("---------------------------------------");
				} else if (digitado.toLowerCase().equals("close")) {
					System.out.println("O Programa Fechou!");
					loop = false; // mesmo o loop recebendo false o while continua rodando
				} else {
					System.out.println("---------------------------------------");
					System.out.println("ERROU, a resposta era \"" + key + "\" Você digitou \"" + digitado + "\" ");
					System.out.println("---------------------------------------");
				}
			} // for
		} // while
		
		scanner.close();
	} // main

} // classe
