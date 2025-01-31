package br.com.ero.spotify_clone_back.usercontext.repository;

import br.com.ero.spotify_clone_back.usercontext.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
