package vocabulario.final_v1;

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
			}
		}
		scanner.close();
	}

}
