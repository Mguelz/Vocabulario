package br.com.vocabulario.teste;

import br.com.vocabulario.view.ApresentaNome;

/**
 * O usuario terá que acertar a tradução da palavra que o sistema apresentar para ele
 * Sempre aparecerá uma palavra em ingles, só  é prciso acertar a tradução para o português
 * 
 * @author Miguel Arcanjo  
 */
public class ApresentaNomeTest {

	public static void main(String[] args) {
		ApresentaNome apresentaNome = new ApresentaNome();
		apresentaNome.apresentaNomes();
	}

}
/**
---------------------------------------------------------------------------------------------------
ESSA É A VERSÃO 1

ONDE A ALEATORIZAÇÃO DAS PALAVRAS É ATRAVEZ DE UM MAP

POSTERIORMENTE SERÁ SUBSTITUIDA POR UM BANCO DE DADOS
---------------------------------------------------------------------------------------------------
*/