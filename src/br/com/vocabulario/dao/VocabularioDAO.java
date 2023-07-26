package br.com.vocabulario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.vocabulario.connection.ConnectionFactory;
import br.com.vocabulario.model.VocabularioModel;

public class VocabularioDAO {

	private Connection conexao;

	public VocabularioDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

	public void insert(VocabularioModel vocabulario) {
		String sql = "insert into t_voc_dictionary (cd_id, nm_chave, nm_valor) values (?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, vocabulario.getCd_id());
			stmt.setString(2, vocabulario.getNome_chave());
			stmt.setString(3, vocabulario.getNome_valor());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<VocabularioModel> selectAll() {
		List<VocabularioModel> vocabularioCompleto = new ArrayList<VocabularioModel>();
		String sql = "select * from t_voc_dictionary order by cd_id";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				VocabularioModel vocabulario = new VocabularioModel();
				vocabulario.setCd_id(rs.getInt("cd_id"));
				vocabulario.setNome_chave(rs.getString("nm_chave"));
				vocabulario.setNome_valor(rs.getString("nm_valor"));
				vocabularioCompleto.add(vocabulario);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vocabularioCompleto;
	}

	public VocabularioModel selectById(int cd_id) {
		VocabularioModel vocabulario = null;
		String sql = "select * from t_voc_dictionary where cd_id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, cd_id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				vocabulario = new VocabularioModel();
				vocabulario.setNome_chave(rs.getString("nm_chave"));
				vocabulario.setNome_valor(rs.getString("nm_valor"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vocabulario;
	}

	/**
	 * obtem o a tradução da palavra passada no parametro 
	 * (essa palavra passada no parametro sera de acordo com as palavras registradas no banco)
	 * 
	 * @param nm_valor
	 * @return List<VocabularioModel>
	 */
	public String obtemTraducaoDaPalavra(String nm_valor) {
//		List<VocabularioModel> vocabularioCompleto = new ArrayList<VocabularioModel>();
		String sql = "select nm_chave from t_voc_dictionary where nm_valor = ?";
		VocabularioModel vocabulario = new VocabularioModel();
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nm_valor);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
//				vocabulario.setCd_id(rs.getInt("cd_id"));
				vocabulario.setNome_chave(rs.getString("nm_chave"));
//				vocabulario.setNome_valor(rs.getString("nm_valor"));
//				vocabularioCompleto.add(vocabulario);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vocabulario.getNome_chave();
	}

	public void delete(int cd_id) {
		String sql = "delete from t_voc_dictionary where cd_id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, cd_id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(VocabularioModel vocabulario) {
		String sql = "update t_voc_dictionary set nm_chave = ?, nm_valor = ? where cd_id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, vocabulario.getNome_chave());
			stmt.setString(2, vocabulario.getNome_valor());
			stmt.setInt(3, vocabulario.getCd_id());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
