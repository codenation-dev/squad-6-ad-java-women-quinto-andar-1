package br.com.codenation.loglab.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codenation.loglab.dto.UsuarioDTO;
import br.com.codenation.loglab.entity.Usuario;
import br.com.codenation.loglab.mappers.UsuarioMapper;
import br.com.codenation.loglab.service.UsuarioServiceInterface;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioServiceInterface usuarioService;
	private UsuarioMapper usuarioMapper = new UsuarioMapper();
	
	@PostMapping
	public ResponseEntity<UsuarioDTO> createUser(@RequestBody UsuarioDTO usuarioDTO) {
		Usuario usuario = usuarioService.save(usuarioMapper.toUsuario(usuarioDTO));
		return new ResponseEntity<>(usuarioMapper.toUsuarioDTO(usuario), HttpStatus.CREATED);

	}

	@GetMapping("/{id}")
	public ResponseEntity<UsuarioDTO> findById(@PathVariable Integer id) {
		Optional<Usuario> user = usuarioService.findById(id);
		return ResponseEntity.ok(usuarioMapper.toUsuarioDTO(user.get()));
	}
}