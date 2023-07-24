package br.com.vocabulario.teste;

import java.util.List;

import br.com.vocabulario.controller.VocabularioController;
import br.com.vocabulario.model.VocabularioModel;

public class ConnectionFactoryTest {
	public static void main(String[] args) {

//		testandoSelectById();
		testandoSelectAll();

	}

	private static void testandoSelectById() {
		// Buscar por ID
		VocabularioController vc = new VocabularioController();
		int cd_id = 1;
		VocabularioModel vocabularioEncontrado = null;
		try {
			vocabularioEncontrado = vc.buscarPorId(cd_id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (vc != null) {
			System.out.println("Palavras encontrada:");
			System.out.println("Português: " + vocabularioEncontrado.getNome_chave());
			System.out.println("Inglês: " + vocabularioEncontrado.getNome_valor());
		}

	}

	private static void testandoSelectAll() {
		// Listar todas as especialidades
		VocabularioController vc = new VocabularioController();
		List<VocabularioModel> todasAsPalavras = vc.listarTudo();
		System.out.println("Lista de palavras:");
		for (VocabularioModel e : todasAsPalavras) {
			System.out.print("ID: " + e.getCd_id() + "    Portugues: " + e.getNome_chave() + "\n           Inglês:   " + e.getNome_valor());
			System.out.println(" ");
			System.out.println(" ");
		}

	}
}
