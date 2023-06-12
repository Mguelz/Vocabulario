package vocabulario.V2_banco_de_dados;

/**
 * O usuario terá que acertar a tradução da palavra que o sistema apresentar para ele
 * Sempre aparecerá uma palavra em ingles, só  é prciso acertar a tradução para o português
 * 
 * @author Miguel Arcanjo
 */
public class Application {

	public static void main(String[] args) {
		ApresentaNome apresentaNome = new ApresentaNome();
		apresentaNome.apresentaNomes();
	}

}

/**
---------------------------------------------------------------------------------------------------
ESSA É A VERSÃO 2

ONDE SERA CONECTADA A UM BANCO DE DADOS

O OBJETIVO DESTA VERSÃO É EXCLUIR O MAP DO PROJETO E SUBSTITUIR PELO BANCO DE DADOS
---------------------------------------------------------------------------------------------------
*/