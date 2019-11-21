package br.com.codenation.loglab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.codenation.loglab.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//public interface UserRepository extends JpaRepository<User, Integer> {
		public User findByEmail(String email);
		//User findByEmail(String email);
}
