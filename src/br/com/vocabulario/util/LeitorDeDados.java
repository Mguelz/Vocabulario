package br.com.vocabulario.util;

import java.util.Scanner;

/**
 * Esta classe tem como objetivo guardar alguns métodos do Scanner úteis neste
 * projeto para facilitar a reutilização de código e evitar alguns possiveis
 * problemas futuros
 * 
 * @author Miguel Arcanjo
 */
public class LeitorDeDados {
	private Scanner scanner;

	public LeitorDeDados() {
		scanner = new Scanner(System.in);
	}

	/**
	 * faz a leitura doque o usuario digitar até o "enter"
	 * 
	 * @return nextLine()
	 */
	public String pegarTextoCompleto() {
		return scanner.nextLine();
	}

	/**
	 * faz a leitura doque o usuario digitar até o primeiro "espaço"
	 * 
	 * @return next()
	 */
	public String pegarTextoCurto() {
		return scanner.next();
	}

	/**
	 * faz a leitura de um inteiro que o usuario digitar
	 * 
	 * @return nextInt()
	 */
	public int pegarNumeroInteiro() {
		return Integer.parseInt(scanner.nextLine());
	}

	/**
	 * faz a leitura de um inteiro que o usuario digitar
	 * 
	 * @return nextInt()
	 */
	public int pegarNumeroInteiroAntigo() {
		return scanner.nextInt();
	}

	/**
	 * fecha o Scanner
	 */
	public void fecharLeitor() {
		scanner.close();
	}
}
