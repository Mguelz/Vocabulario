package br.com.vocabulario.view;

import java.util.List;

import br.com.vocabulario.controller.VocabularioController;
import br.com.vocabulario.model.VocabularioModel;

/**
 * O usuario terá que acertar a tradução da palavra que o sistema apresentar
 * para ele
 * 
 * @author Miguel Arcanjo
 */
public class ApresentaNome {
	private boolean continuar = true;
	private boolean close = false;

	public void apresentaNomes() {
		VocabularioController vc = new VocabularioController();
		do {
			List<VocabularioModel> todasAsPalavras = vc.listarTudo();
			
			
			// obtem a traducao da palavra que foi exibida para o usuario
			vc.obtemTraducao(null);
			
			
			
			// digitando "close" o  usuario irá parar o programa
			if (close == true) {
				continuar = false;
			}
		} while (continuar);
	}

}
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