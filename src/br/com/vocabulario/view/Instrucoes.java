package br.com.vocabulario.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Instrucoes {

	public void instrucoesIniciais() {
		System.out.println("----------------------------- INSTRUCOES INICIAIS -------------------------------------------");
		System.out.println("1. JOGAR");
		System.out.println("   Sera apresentado para você uma palavra em inglês e você terá apenas 1 chance para acertar!");
		System.out.println("2. ADICIONAR");
		System.out.println("   Adiciona dados ao banco de dados");
		System.out.println("   OBS: apenas pessoas autorizadas conseguem utilizar esta opcao!");
		System.out.println("3. VIZUALIZAR");
		System.out.println("   Visualizar algumas predefinições de dados do banco de dados");
		System.out.println("   OBS: apenas pessoas autorizadas conseguem utilizar esta opcao!");
		System.out.println("4. ATUALIZAR");
		System.out.println("   Altera os dados do banco de dados");
		System.out.println("   OBS: apenas pessoas autorizadas conseguem utilizar esta opcao!");
		System.out.println("5. EXCLUIR");
		System.out.println("   Exclui dados do banco de dados");
		System.out.println("   OBS: apenas pessoas autorizadas conseguem utilizar esta opcao!");
		System.out.println("6. SAIR");
		System.out.println("   Fechara o sistema");
		System.out.println("-------------------------------------------------------------------------------------------\n");
	}

	/**
	 * instruções iniciais após escolher a opcao de jogar.<br>
	 * Ele apresenta orientação de como escrever as palavras e outras orientações
	 * de: como parar o programa e ver a quantidade de palavras acertadas e erradas
	 * 
	 */
	public void instrucoesJogar() {
		System.out.println(
				"----------------------------- INSTRUCOES PARA JOGAR -------------------------------------------\n");
		System.out.println("1. TODAS AS PALAVRAS TERAO QUE SER DIGITADAS EM CAIXA BAIXA");
		System.out.println("   EXEMPLO: for --> para");
		System.out.println("2. A SEPARACAO ENTRE AS PALAVRAS EH \"_\" E NÃO UM \"espaco\"");
		System.out.println("   EXEMPLO: around --> em_torno_de");
		System.out.println("3. A ACENTUACAO DAS PALAVRAS SERAO IGNORADAS, ENTAO DIGITE COMO SE NAO TIVESSE ACENTUACAO");
		System.out.println("   EXEMPLO: bread --> pao");
		System.out.println("4. PARA PARAR O PROGRAMA DIGITE: \"close\"");
		System.out.println("5. DIGITE \"close\" QUANDO VOCE QUISER SABER QUANTAS PALAVRAS VOCE ACERTOU E ERROU");
		System.out.println("   APOS ESSE COMANDO VOCE IRA PARAR DE JOGAR");
		System.out.println(
				"-------------------------------------------------------------------------------------------\n");
	}

	/**
	 * Apresenta ao usuario uma mensagem de acerto
	 */
	public void mensagemAcertou() {
		System.out.println("---------------------------------------");
		System.out.println("Parabéns!!! você ACERTOU");
		System.out.println("---------------------------------------");
	}

	/**
	 * Apresenta ao usuario uma mensagem que o programa fechou
	 */
	public void mensagemFecharPrograma() {
		System.out.println("\n---------------------------------------");
		System.out.println("O Programa Fechou!");
		System.out.println("---------------------------------------");
	}

	/*
	 * TODO pegar todos os elementos do banco e puxar aleatoriamente toda vez que
	 * for chamado obs: sempre chamar apenas uma palavra aleatoria do banco, ou
	 * seja, toda vez que for chamado, retornará apenas uma palavra
	 */
	public void aleatorizarBanco() {

	}

	/**
	 * Reinbaralhando a sequencia do HashMap, tornando todas as vezes que rodar o
	 * código, a sequencia das palavras iram ser aleatorias
	 * 
	 * @param Map<String, String> map
	 * @return novoMap
	 * @author Miguel com a ajuda do Wiu
	 */
	private static Map<String, String> aleatorizarElementos(Map<String, String> map) {
		Map<String, String> novoMap = new LinkedHashMap<String, String>();
		List<String> chaves = new ArrayList<String>(map.keySet());
		Collections.shuffle(chaves);
		chaves.forEach(e -> novoMap.put(e, map.get(e)));
		return novoMap;
	}
}
