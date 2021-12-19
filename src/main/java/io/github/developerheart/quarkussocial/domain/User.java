package io.github.developerheart.quarkussocial.domain;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "usuario")
public class User extends PanacheEntityBase implements Serializable  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id")
	private Long  id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "sobrenome")
	private String sobrenome;

	@Column(name = "idade")
	private Integer idade;

	@Column(name = "sexo")
	private Character sexo;

	@Column(name = "data_nascimento")
	private Date dataNascimento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(id, user.id) && Objects.equals(nome, user.nome) && Objects.equals(sobrenome, user.sobrenome) && Objects.equals(idade, user.idade) && Objects.equals(sexo, user.sexo) && Objects.equals(dataNascimento, user.dataNascimento);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, sobrenome, idade, sexo, dataNascimento);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
			.add("id=" + id)
			.add("nome='" + nome + "'")
			.add("sobrenome='" + sobrenome + "'")
			.add("idade=" + idade)
			.add("sexo=" + sexo)
			.add("dataNascimento=" + dataNascimento)
			.toString();
	}
}
