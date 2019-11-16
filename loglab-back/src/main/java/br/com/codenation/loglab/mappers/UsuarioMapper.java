package br.com.codenation.loglab.mappers;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;

import br.com.codenation.loglab.dto.UsuarioDTO;
import br.com.codenation.loglab.entity.Usuario;

@Mapper
public class UsuarioMapper {

	public UsuarioDTO toUsuarioDTO(Usuario usuario){
		return new UsuarioDTO(usuario.getId(),
				usuario.getEmail(),
				usuario.getPassword(),
				usuario.getSourceIp());
	}
	
	public List<UsuarioDTO> toUsuarioDTOs(List<Usuario> users){
		List<UsuarioDTO>lista = new ArrayList<>();
		for (Usuario u : users) {
			lista.add(new UsuarioDTO(u.getId(),
					u.getEmail(),
					u.getPassword(),
					u.getSourceIp()));
		}
		return lista;
	}
	
	public Usuario toUsuario (UsuarioDTO usuarioDTO) {
		return new Usuario(usuarioDTO.getId(),
				usuarioDTO.getEmail(),
				usuarioDTO.getPassword(),
				usuarioDTO.getSourceIp());
	}
}
