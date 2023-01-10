package vocabulario.v1;

import java.util.Random;
import java.util.Scanner;

public class VocabularioTeste {
	/*
	 * problema a ser resolvido por enquanto: estou tentando fazer com que printe o
	 * array, depois pensar como eu vou printar somente oque esta antes da virgula(a
	 * palavra em ingles)
	 */

	public static void main(String[] args) {
		Vocabulario vocabulario = new Vocabulario();
		Random random = new Random(); // classe para gerar numeros aleatorios
		Scanner scanner = new Scanner(System.in);

		// escolher uma palavra aleatoria no limite do array
		int aleatorio = 0;

// 		// apresentar uma palavra aleatorio do array words
//		for (int i = 0; i < vocabulario.words.length; i++) {
//			String palavraEscolhida = vocabulario.words[aleatorio];
//			System.out.println(palavraEscolhida);
//			
//		}
		int pararLoop = 0;
		String tentativa = "";
		String traducao = "";
		while (true) {
			pararLoop = 1;
			// escolher uma palavra aleatoria no limite do array
			aleatorio = random.nextInt(vocabulario.words.length);
			String palavraEscolhida = vocabulario.words[aleatorio];
			System.out.println("Como se diz a palavra \"" + palavraEscolhida + "\" em portugues?");
			tentativa = scanner.next();
			
			if(palavraEscolhida.equals("elementary") && tentativa.equals("fundamental")) {
				System.out.println("Voce acertou");
			} else if(palavraEscolhida.equals("each") && tentativa.equals("cada")) {
				System.out.println("Voce acetou");
			} else if(palavraEscolhida.equals("horse") && tentativa.equals("cavalo")) {
				System.out.println("Voce acetou");
			} else if(palavraEscolhida.equals("glasses") && tentativa.equals("oculos")) {
				System.out.println("Voce acetou");
			} else {
				System.out.println("Voce errou");
			}
			
		} // while 

	} // main

} // classe
