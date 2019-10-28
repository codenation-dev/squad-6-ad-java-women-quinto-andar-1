package br.com.codenation.loglab.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.codenation.loglab.dto.UserDTO;
import br.com.codenation.loglab.entity.User;

@Mapper
public interface UserMapper {

	public UserDTO toUserDTO(User user);
	
	public List<UserDTO> toUserDTOs(List<User> users);
	
	public User toUser (UserDTO userDTO);
}
