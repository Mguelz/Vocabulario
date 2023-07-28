package br.com.vocabulario.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.vocabulario.dao.VocabularioDAO;
import br.com.vocabulario.model.VocabularioModel;

public class VocabularioController {
	private VocabularioDAO vocabularioDAO;

	public VocabularioController() {
		try {
			vocabularioDAO = new VocabularioDAO();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void cadastrar(VocabularioModel vocabulario) {
		vocabularioDAO.insert(vocabulario);
	}

	public void atualizar(VocabularioModel vocabulario) {
		vocabularioDAO.update(vocabulario);
	}

	public void excluir(int cd_id) {
		vocabularioDAO.delete(cd_id);
	}

	public List<VocabularioModel> listarTudo() {
		return vocabularioDAO.selectAll();
	}

	/**
	 * ira pegar a traducao da palavra em ingles passada no parametro
	 * 
	 * @param nm_valor
	 * @return
	 */
	public String obtemTraducao(String nm_valor) {
		return vocabularioDAO.obtemTraducaoDaPalavra(nm_valor);
	}

	public List<VocabularioModel> obtemTodosValores() {
		return vocabularioDAO.obtemTodosValores();
	}

	public VocabularioModel buscarPorId(int cd_id) {
		return vocabularioDAO.selectById(cd_id);
	}
}
