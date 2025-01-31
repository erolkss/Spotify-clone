package br.com.ero.spotify_clone_back.catalogcontext.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "favorite_song")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@IdClass(FavoriteId.class)
public class Favorite implements Serializable {

    @Id
    @Column(name = "song_public_id", nullable = false)
    private UUID songPublicId;

    @Id
    @Column(name = "user_email")
    private String userEmail;
}
