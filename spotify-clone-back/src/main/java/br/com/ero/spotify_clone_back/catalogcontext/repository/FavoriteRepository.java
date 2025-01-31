package br.com.ero.spotify_clone_back.catalogcontext.repository;

import br.com.ero.spotify_clone_back.catalogcontext.domain.Favorite;
import br.com.ero.spotify_clone_back.catalogcontext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}
