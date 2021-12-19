package io.github.developerheart.quarkussocial.enums;

public enum Status {

	ATIVO("ADULTO", "ACESSO TOTAL LIBERADO"),
	PEDENTE("PRÉ-ADULTO", "ACESSO PARCIAL"),
	RECUSADO("MENOR DE IDADE", "NÃO É POSSÍVEL FAZER SEU CADASTRO");

	private String perfil;
	private String descricao;

	Status(String perfil, String descricao) {
		this.perfil = perfil;
		this.descricao = descricao;
	}

	public String getPerfil() {
		return perfil;
	}

	public String getDescricao() {
		return descricao;
	}
}
