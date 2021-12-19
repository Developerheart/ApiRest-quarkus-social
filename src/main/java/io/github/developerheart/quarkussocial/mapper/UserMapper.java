package io.github.developerheart.quarkussocial.mapper;

import io.github.developerheart.quarkussocial.domain.User;
import io.github.developerheart.quarkussocial.dto.UserRequest;
import io.github.developerheart.quarkussocial.dto.UserResponse;
import io.github.developerheart.quarkussocial.enums.Status;

public class UserMapper {

	public static UserResponse toResponse(User entidade){
		UserResponse userResponse = new UserResponse();
		merge(entidade, userResponse);
		return userResponse;
	}

	private  static void merge(User source, UserResponse target){
		target.setIdade(source.getIdade());
		target.setName(source.getNome());
		target.setSexo(source.getSexo());
		target.setBirthDate(source.getDataNascimento());
		target.setPerfil(Status.ATIVO);
		target.setSobrenome(source.getSobrenome());
	}

	public static User toEntity(UserRequest request){
		User user = new User();
		merge(request, user);
		return user;
	}

	private  static void merge(UserRequest request, User user) {
		user.setDataNascimento(request.getBirthDate());
		user.setNome(request.getName());
		user.setSexo(request.getSexo());
		user.setIdade(request.getIdade());
		user.setSobrenome(request.getSobrenome());

	}
}
