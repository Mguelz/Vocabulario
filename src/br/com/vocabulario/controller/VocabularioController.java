package br.com.vocabulario.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

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

	/**
	 * Inclui um dado em cada coluna do banco de dados
	 * 
	 * @param vocabulario
	 */
	public void cadastrar(VocabularioModel vocabulario) {
		vocabularioDAO.insert(vocabulario);
	}

	/**
	 * É capaz de atualizar os dados de uma linha do banco de dados, de acordo com o
	 * id que for passado
	 * 
	 * @param vocabulario
	 */
	public void atualizar(VocabularioModel vocabulario) {
		vocabularioDAO.update(vocabulario);
	}

	/**
	 * É capaz de excluir um dado do banco de dados
	 * 
	 * @param cd_id
	 */
	public void excluir(int cd_id) {
		vocabularioDAO.delete(cd_id);
	}

	/**
	 * Obtem todos dados do banco de dados (todas as colunas), ou seja, é um select
	 * all
	 * 
	 * @return List<VocabularioModel>
	 */
	public List<VocabularioModel> listarTudo() {
		return vocabularioDAO.selectAll();
	}

	/**
	 * ira pegar a traducao da palavra em ingles passada no parametro
	 * 
	 * @param nm_valor
	 * @return
	 */
	public String obtemTraducao(int cd_id) {
		return vocabularioDAO.obtemTraducaoDaPalavra(cd_id);
	}

	/**
	 * Obtem todos os dados da tabela nm_valor no banco de dados
	 * 
	 * @return List<VocabularioModel>
	 */
	public List<VocabularioModel> obtemTodosValores() {
		return vocabularioDAO.obtemTodosValores();
	}

	/**
	 * Obtem uma palavra em inglês a partir do id que for passado
	 * 
	 * @param cd_id
	 * @return VocabularioModel
	 */
	public String obtemPalavraIngles(int cd_id) {
		return vocabularioDAO.obtemPalavraIngles(cd_id);
	}

	/**
	 * Gera um numero aleatório onde será usado posteriormente para puxar o id do
	 * banco de dados
	 * 
	 * @return int
	 */
	public int aleatorizaSequencia() {
		VocabularioController vc = new VocabularioController();
		int qtdElementos = vocabularioDAO.selectQtdElementosColuna();
		return vc.aleatorizacao(qtdElementos);
	}

	/**
	 * Este método retorna a quantidade de dados que existe dentro da tabela
	 * nm_valor no banco de dados
	 * 
	 * @return int
	 */
	public int selectQtdElementosTabela() {
		return vocabularioDAO.selectQtdElementosColuna();
	}

	/**
	 * Será recebido um numero como parametro <br>
	 * o algoritimo gerara um numero aleatorio entre 1 e o valor passado (incluindo
	 * o valor)<br>
	 * 
	 * @param qtdDados
	 * @return int
	 */
	public int aleatorizacao(int qtdDados) {
		Random random = new Random();
		return random.nextInt(qtdDados) + 1;
	}

}
