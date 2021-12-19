package io.github.developerheart.quarkussocial.dto;

import io.github.developerheart.quarkussocial.enums.Status;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

public class UserResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	private String sobrenome;

	private Integer idade;

	private Date birthDate;

	private Character sexo;

	private Status perfil;

	public UserResponse() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Status getPerfil() {
		return perfil;
	}

	public void setPerfil(Status perfil) {
		this.perfil = perfil;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UserResponse that = (UserResponse) o;
		return Objects.equals(name, that.name) && Objects.equals(sobrenome, that.sobrenome) && Objects.equals(idade, that.idade) && Objects.equals(birthDate, that.birthDate) && Objects.equals(sexo, that.sexo) && perfil == that.perfil;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sobrenome, idade, birthDate, sexo, perfil);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", UserResponse.class.getSimpleName() + "[", "]")
			.add("name='" + name + "'")
			.add("sobrenome='" + sobrenome + "'")
			.add("idade=" + idade)
			.add("birthDate=" + birthDate)
			.add("sexo=" + sexo)
			.add("perfil=" + perfil)
			.toString();
	}
}
