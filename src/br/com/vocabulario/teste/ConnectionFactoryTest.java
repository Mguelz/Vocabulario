package br.com.vocabulario.teste;

import java.util.List;

import br.com.vocabulario.controller.VocabularioController;
import br.com.vocabulario.model.VocabularioModel;

public class ConnectionFactoryTest {
	public static void main(String[] args) {

//		testandoSelectById();
//		testandoSelectAll();
		testandoInsert();
//		testandoUpdate();
//		testandoDelete();

	}

	private static void testandoSelectById(int cd_id) {
		// Buscar por ID
		VocabularioController vc = new VocabularioController();
		VocabularioModel vocabularioEncontrado = null;
		try {
			vocabularioEncontrado = vc.buscarPorId(cd_id);
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

	private static void testandoInsert() {
		// testando o cadastro de palavras
		VocabularioController vc = new VocabularioController();
		VocabularioModel vocabulario = new VocabularioModel();
		int id = 159;
		String chave = "cuspir";
		String valor = "spit";
		vocabulario.setCd_id(id);
		vocabulario.setNome_chave(chave);
		vocabulario.setNome_valor(valor);
		vc.cadastrar(vocabulario);
		System.out.println("Palavras \"" + chave + "\" e \"" + valor + "\" cadastradas!");
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
