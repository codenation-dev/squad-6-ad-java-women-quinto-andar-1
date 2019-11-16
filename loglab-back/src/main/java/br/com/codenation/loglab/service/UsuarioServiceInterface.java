package br.com.codenation.loglab.service;

import br.com.codenation.loglab.entity.Usuario;

import java.util.Optional;

public interface UsuarioServiceInterface {
	public Optional<Usuario> findById(Integer id);

	public Usuario save(Usuario usuario);
}
