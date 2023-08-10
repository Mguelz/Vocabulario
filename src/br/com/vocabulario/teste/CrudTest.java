package br.com.vocabulario.teste;

import java.util.List;

import br.com.vocabulario.controller.VocabularioController;
import br.com.vocabulario.model.VocabularioModel;

public class CrudTest {
	public static void main(String[] args) {

//		testandoSelectById();
//		testandoSelectAll();
//		testandoInsert();
//		testandoUpdate();
//		testandoDelete();
//		testandoObtemTraducao();
//		testandoObtemTodosValores();
//		testandoObtemQtdElementosColuna();

//		VocabularioController vc = new VocabularioController();
//		System.out.println(vc.aleatorizacao(2));

//		testandoAleatorizaSequencia();

		// puxando da controller
		VocabularioController vc = new VocabularioController();
		int idGerado = 0;
		System.out.println(idGerado = vc.aleatorizaSequencia());
		System.out.println(vc.obtemPalavraIngles(idGerado));
		System.out.println(vc.obtemTraducao(idGerado));
	}

	private static void testandoSelectById(int cd_id) {
		// Buscar por ID
		VocabularioController vc = new VocabularioController();
		VocabularioModel vocabularioEncontrado = null;
		try {
//			vocabularioEncontrado = vc.obtemPalavraIngles(cd_id); // depois que troquei o parametro nao esta mais funcionando
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (vc != null) {
			System.out.println("Palavras encontrada:");
			System.out.println("   - Português: " + vocabularioEncontrado.getNome_chave());
			System.out.println("   - Inglês: " + vocabularioEncontrado.getNome_valor());
		}
	}

	private static void testandoObtemTraducao() {
		VocabularioController vc = new VocabularioController();
//		VocabularioModel vocabularioEncontrado = null;
//		String traducao = vocabularioEncontrado.getNome_chave();
		String traducao = "nenhuma palavra encontrada";
		String nm_valor = "usage";
		try {
//			traducao = vc.obtemTraducao(nm_valor); // agora este metodo esta puxando um int ao invés de uma String
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (vc != null) {
			System.out.println("Traducao da palavra \"" + nm_valor + "\": \"" + traducao + "\"");
		}
	}

	private static void testandoObtemTodosValores() {
		VocabularioController vc = new VocabularioController();
		List<VocabularioModel> colunaInteira = vc.obtemTodosValores();
		System.out.println("Listando todos os valores\n");
		for (VocabularioModel i : colunaInteira) {
			System.out.println(i.getNome_valor());
		}
	}

	private static void testandoSelectAll() {
		// Listar todas as especialidades
		VocabularioController vc = new VocabularioController();
		List<VocabularioModel> todasAsPalavras = vc.listarTudo();
		System.out.println("Lista de palavras:");
		for (VocabularioModel e : todasAsPalavras) {
			System.out.print("ID: " + e.getCd_id() + "    Portugues: " + e.getNome_chave() + "\n           Inglês:   "
					+ e.getNome_valor());
			System.out.println(" ");
			System.out.println(" ");
		}
	}

	private static void testandoObtemQtdElementosColuna() {
		// Listar todas as especialidades
		VocabularioController vc = new VocabularioController();
		int qtdDadosColuna = vc.selectQtdElementosTabela();
		System.out.println("Quantidade de palavras dentro da tabela nm_valor: " + qtdDadosColuna);
	}

	private static void testandoAleatorizaSequencia() {
		VocabularioController vc = new VocabularioController();
		int qtd = vc.aleatorizaSequencia();
		System.out.println("numero gerado aleatorio: " + qtd);
	}

	private static void testandoInsert() {
		// testando o cadastro de palavras
		VocabularioController vc = new VocabularioController();
		VocabularioModel vocabulario = new VocabularioModel();
		int id = 160;
		String chave = "despedido";
		String valor = "fired";
		vocabulario.setCd_id(id);
		vocabulario.setNome_chave(chave);
		vocabulario.setNome_valor(valor);
		vc.cadastrar(vocabulario);
		System.out.println("\nPalavras \"" + chave + "\" e \"" + valor + "\" cadastradas!");
		System.out.println(" --------------------------------------------------------- ");
		testandoSelectById(id);
	}

	private static void testandoUpdate() {
		// testar o update
		VocabularioController vc = new VocabularioController();
		VocabularioModel vocabulario = new VocabularioModel();
		int id = 159;
		String chave = "curspir";
		String valor = "spit";
		vocabulario.setCd_id(id);
		vocabulario.setNome_chave(chave);
		vocabulario.setNome_valor(valor);
		vc.atualizar(vocabulario);
		System.out.println("Palavras atualizadas!");
		System.out.println("\"" + chave + "\"" + " e " + "\"" + valor + "\"");
	}

	private static void testandoDelete() {
		// testar o delete
		VocabularioController vc = new VocabularioController();
		VocabularioModel vocabulario = new VocabularioModel();
		int id = 159;
		vc.excluir(id);
		System.out.println("Excluido com sucesso!");
	}

}
