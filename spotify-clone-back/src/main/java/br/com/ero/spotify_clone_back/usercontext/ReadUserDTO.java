package br.com.ero.spotify_clone_back.usercontext;

public record ReadUserDTO(String firstName,
                          String lastName,
                          String email,
                          String imageUrl) {
}
