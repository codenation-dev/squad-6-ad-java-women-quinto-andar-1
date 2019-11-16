package br.com.codenation.loglab.service;

import java.util.Optional;

import br.com.codenation.loglab.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codenation.loglab.repository.UsuarioRepository;

@Service
public class UsuarioService implements UsuarioServiceInterface {

	private UsuarioRepository usuarioRepository;

	@Autowired
	UsuarioService(UsuarioRepository repository) {
		this.usuarioRepository = repository;
	}

//precisa instanciar a repository
	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
