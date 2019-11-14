package br.com.codenation.loglab.mappers;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;

import br.com.codenation.loglab.dto.UserDTO;
import br.com.codenation.loglab.entity.User;

@Mapper
public class UserMapper {

	public UserDTO toUserDTO(User user){
		return new UserDTO(user.getEmail(),
				user.getPassword(),
				user.getSourceIp());
	}
	
	public List<UserDTO> toUserDTOs(List<User> users){
		List<UserDTO>lista = new ArrayList<>();
		for (User u : users) {
			lista.add(new UserDTO(u.getEmail(),
					u.getPassword(),
					u.getSourceIp()));
		}
		return lista;
	}
	
	public User toUser (UserDTO userDTO) {
		return new User(userDTO.getEmail(),
				userDTO.getPassword(),
				userDTO.getSourceIp());
	}
}
