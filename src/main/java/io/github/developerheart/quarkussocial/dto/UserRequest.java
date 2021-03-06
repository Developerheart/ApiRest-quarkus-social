package io.github.developerheart.quarkussocial.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.json.bind.annotation.JsonbDateFormat;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

public class UserRequest {

    private String name;
    private String sobrenome;
    private Integer idade;
//    @JsonbDateFormat(value = "yyyy-MM-dd")
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-dd-MM")
    private Date birthDate;
    private Character sexo;

    public UserRequest() {
    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }
    public UserRequest(String name, String sobrenome, Integer idade, Timestamp birthDate, Character sexo) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.birthDate = birthDate;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public UserRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public UserRequest setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public Integer getIdade() {
        return idade;
    }

    public UserRequest setIdade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public UserRequest setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Character getSexo() {
        return sexo;
    }

    public UserRequest setSexo(Character sexo) {
        this.sexo = sexo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRequest that = (UserRequest) o;
        return Objects.equals(name, that.name) && Objects.equals(sobrenome, that.sobrenome) && Objects.equals(idade, that.idade) && Objects.equals(birthDate, that.birthDate) && Objects.equals(sexo, that.sexo);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sobrenome != null ? sobrenome.hashCode() : 0);
        result = 31 * result + (idade != null ? idade.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserRequest.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("sobrenome='" + sobrenome + "'")
                .add("idade=" + idade)
                .add("birthDate=" + birthDate)
                .add("sexo=" + sexo)
                .toString();
    }
}
