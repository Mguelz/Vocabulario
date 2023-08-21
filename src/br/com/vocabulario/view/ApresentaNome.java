package br.com.vocabulario.view;

import br.com.vocabulario.controller.VocabularioController;
import br.com.vocabulario.util.LeitorDeDados;

/**
 * O usuario terá que acertar a tradução da palavra que o sistema apresentar
 * para ele
 * 
 * @author Miguel Arcanjo
 */
public class ApresentaNome {
	/**
	 * Principal lógica onde o usuario estará o tempo inteiro interagindo
	 */
	public void apresentaNomes() {
		VocabularioController vc = new VocabularioController();
		LeitorDeDados scanner = new LeitorDeDados();

		boolean loop = true;
		int idGerado = -1, acertos = 0, erros = 0;
		String palavraEmIngles, traducao, digitado;

		
		while (loop) {
			idGerado = vc.aleatorizaSequencia(); // aleatoriza a sequencia
			palavraEmIngles = vc.obtemPalavraIngles(idGerado); // retorna uma palavra em ingles
			traducao = vc.obtemTraducao(idGerado); // obtem a traducao da palavra

			System.out.println("Qual a tradução da palavra - \"" + palavraEmIngles + "\""); // pergunta qual a traducao
																							// desta palavra
			digitado = scanner.pegarTextoCurto(); // pega o que o user digitar
			if (digitado.toLowerCase().equals(traducao)) { // se acertar
				mensagemAcerto();
				acertos++;
			} else if (digitado.toLowerCase().equals("close")) { // fecha o programa
				System.out.println("\n---------------------------------------");
				System.out.println("Voce parou de jogar!!");
				System.out.println("\nVoce acertou " + acertos + " e errou " + erros);
				loop = false;
				break;
			} else { // errou
				System.out.println("---------------------------------------");
				System.err.println("ERROU, a resposta era \"" + traducao + "\" Você digitou \"" + digitado + "\" ");
				System.out.println("---------------------------------------");
				erros++;
			}
		}
	}

	public static void mensagemAcerto() {
		System.out.println("---------------------------------------");
		System.out.println("Parabéns!!! você ACERTOU");
		System.out.println("---------------------------------------");
	}

	public static void mensagemFecharPrograma() {
		System.out.println("\n---------------------------------------");
		System.out.println("O Programa Fechou!");
		System.out.println("---------------------------------------");
	}

}

// versão 1.0
//public void apresentaNomes() {
//	LeitorDeDados scanner = new LeitorDeDados();
//	Instrucoes vocabulario = new Instrucoes();
//
//	vocabulario.instrucoes();
//	
//	boolean loop = true;
//	String digitado = "";
//	int acertos = 0, erros = 0;
//
//	while (loop) {
//		loop = true;
//		for (String key : vocabulario.allWords().keySet()) {
//			System.out.println("Qual a tradução da palavra - \"" + vocabulario.allWords().get(key) + "\"");
//			digitado = scanner.pegarTextoCurto();
//			if (digitado.toLowerCase().equals(key)) {
//				vocabulario.mensagemAcertou();
//				acertos++;
//			} else if (digitado.toLowerCase().equals("close")) {
//				System.out.println("\n---------------------------------------");
//				System.out.println("\nVoce acertou " + acertos + " e errou " + erros);
//				vocabulario.mensagemFecharPrograma();
//				loop = false;
//				break;
//			} else {
//				System.out.println("---------------------------------------");
//				System.err.println("ERROU, a resposta era \"" + key + "\" Você digitou \"" + digitado + "\" ");
//				System.out.println("---------------------------------------");
//				erros++;
//			}
//		}
//	}
//	scanner.fecharLeitor();
//}