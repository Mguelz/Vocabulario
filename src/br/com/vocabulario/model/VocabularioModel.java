package br.com.vocabulario.model;

public class VocabularioModel {
	private int cd_id;
	private String nome_Chave;
	private String nome_valor;

	public VocabularioModel() {
	}

	public VocabularioModel(int cd_id, String nome_Chave, String nome_valor) {
		this.cd_id = cd_id;
		this.nome_Chave = nome_Chave;
		this.nome_valor = nome_valor;
	}

	public int getCd_id() {
		return cd_id;
	}

	public void setCd_id(int cd_id) {
		this.cd_id = cd_id;
	}

	public String getNome_chave() {
		return nome_Chave;
	}

	public void setNome_chave(String nome_Chave) {
		this.nome_Chave = nome_Chave;
	}

	public String getNome_valor() {
		return nome_valor;
	}

	public void setNome_valor(String nome_valor) {
		this.nome_valor = nome_valor;
	}

}
