package vocabulario;

import java.util.Random;
import java.util.Scanner;

public class VocabularioTeste {
	/*
	 * problema a ser resolvido por enquanto:
	 * estou tentando fazer com que printe o array, 
	 * depois pensar como eu vou printar somente oque esta antes da virgula(a palavra em ingles)
	 */

	public static void main(String[] args) {
		Vocabulario vocabulario = new Vocabulario();
		Random random = new Random(); // classe para gerar numeros aleatorios
		Scanner scanner = new Scanner(System.in);
		
		// escolher uma palavra aleatoria no limite do array
		int aleatorio = random.nextInt(vocabulario.words.length); 
		
// 		// escolher uma palavra aleatorio do array words
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
			String palavraEscolhida = vocabulario.words[aleatorio];
			System.out.println("Como se diz a palavra \"" + palavraEscolhida + "\" em portugues?");
			tentativa = scanner.next();
			if (tentativa.equals(traducao)) {
				System.out.println("Voce acertou");
			} else {
				System.out.println("Voce errou");
			}
			
			pararLoop = 10;	// talvze tenha que deletar isto
		}
		

	} //  main

} // classe
