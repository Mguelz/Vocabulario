package vocabulario.final_v1;

/**
 * O usuario terá que acertar a tradução da palavra que o sistema apresentar para ele
 * 
 * @author Miguel Arcanjo
 */
public class ApresentaNome {
	
	public void apresentaNomes() {
		LeitorDeDados scanner = new LeitorDeDados();
		Vocabulario vocabulario = new Vocabulario();

		boolean loop = true;
		String digitado = "";

		while (loop) {
			loop = true;
			for (String key : vocabulario.allWords().keySet()) {
				System.out.println("Qual a tradução da palavra - \"" + vocabulario.allWords().get(key) + "\"");
				digitado = scanner.pegarTextoCurto();
				if (digitado.toLowerCase().equals(key)) {
					vocabulario.mensagemAcertou();
				} else if (digitado.toLowerCase().equals("close")) {
					vocabulario.mensagemFecharPrograma();
					loop = false;
					break;
				} else {
					System.out.println("---------------------------------------");
					System.err.println("ERROU, a resposta era \"" + key + "\" Você digitou \"" + digitado + "\" ");
					System.out.println("---------------------------------------");
				}
			}
		}
		scanner.fecharLeitor();
	}

}
