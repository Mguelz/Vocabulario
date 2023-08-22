package br.com.vocabulario.view;

import java.util.Scanner;

import br.com.vocabulario.controller.VocabularioController;
import br.com.vocabulario.model.VocabularioModel;
import br.com.vocabulario.util.LeitorDeDados;

public class CrudUsuario {
	public static final String VOLTAR_MENU = "sair";
	private static final String SENHA_CORRETA = "miguel123";

	VocabularioController vc = new VocabularioController();
	VocabularioModel vocabulario = new VocabularioModel();
	LeitorDeDados scanner = new LeitorDeDados();
	Scanner scannerr = new Scanner(System.in);

	public void adicionar() {
		boolean loop = true;
		String digitado; // TODO lógica para puxar senha do banco de dados
		int id = 0;
		String chave, valor;
		do {
			System.out.println("Se desejar voltar para o menu digite: \"sair\"");
			System.out.print("Insira a senha: ");
			digitado = scanner.pegarTextoCurto();
			if (digitado.equals(VOLTAR_MENU)) {
				loop = false;
			} else if (digitado.equals(SENHA_CORRETA)) {
				System.out.print("Insira o ID: ");
				id = scanner.pegarNumeroInteiroAntigo();
				System.out.print("Insira a CHAVE (português): ");
				chave = scanner.pegarTextoCurto();
				System.out.print("Insira o VALOR (inglês): ");
				valor = scanner.pegarTextoCurto();
				vocabulario.setCd_id(id);
				vocabulario.setNome_chave(chave);
				vocabulario.setNome_valor(valor);
				vc.cadastrar(vocabulario);
				System.out.println("\nPalavras \"" + chave + "\" e \"" + valor + "\" cadastradas!");
				System.out.println("---------------------------------------------------------\n");
				loop = false;
			}

		} while (loop);
	}

	public void visualizar() {

	}

	public void atualizar() {
		boolean loop = true;
		String digitado;
		String chaveAntiga, valorAntigo;
		do {
			System.out.println("Se desejar voltar para o menu digite: \"sair\"");
			System.out.print("Insira a senha: ");
			digitado = scanner.pegarTextoCurto();
			if (digitado.equals(VOLTAR_MENU)) {
				loop = false;
			} else if (digitado.equals(SENHA_CORRETA)) {
				System.out.print("Insira o ID: ");
				int id = scanner.pegarNumeroInteiroAntigo();
				System.out.print("Insira a CHAVE (portugês): ");
				chaveAntiga = vc.obtemTraducao(id);
				String chave = scanner.pegarTextoCurto();
				System.out.print("Insira o VALOR (inglês): ");
				valorAntigo = vc.obtemPalavraIngles(id);
				String valor = scanner.pegarTextoCurto();

				vocabulario.setCd_id(id);
				vocabulario.setNome_chave(chave);
				vocabulario.setNome_valor(valor);
				vc.atualizar(vocabulario);

				System.out.println("\nPalavras atualizadas!");
				System.out.println("ANTIGO: " + chaveAntiga + " e " + valorAntigo);
				System.out.println("NOVO: \"" + chave + "\"" + " e " + "\"" + valor + "\"\n");
				loop = false;
			}

		} while (loop);

	}

	public void excluir() {
		boolean loop = true;
		String digitado;
//		String verificarChave, verificarValor;
		do {
			System.out.println("Se desejar voltar para o menu digite: \"sair\"");
			System.out.print("Insira a senha: ");
			digitado = scanner.pegarTextoCurto();
			if (digitado.equals(VOLTAR_MENU)) {
				loop = false;
			} else if (digitado.equals(SENHA_CORRETA)) {
				System.out.print("Insira o ID: ");
				int id = scanner.pegarNumeroInteiroAntigo();
				vc.excluir(id);
				System.out.println("Excluido com sucesso!");
				loop = false;

				// TODO validar a exclusão (nao esta funcionando)
//				verificarChave = vc.obtemTraducao(id);
//				if (verificarChave.equals(null)) {
//					System.out.println("nao existe");
//				}
//				
//				verificarValor = vc.obtemPalavraIngles(id);
//				if (verificarValor.equals(null)) {
//					System.out.println("nao existe");
//				}
//				if (verificarChave == true && verificarValor == true) {
//					System.out.println("Excluido com sucesso!");
//				} else {
//					System.out.println("Não foi possível excluir");
//				}
			}
		} while (loop);

	}
}
