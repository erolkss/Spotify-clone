package br.com.ero.spotify_clone_back.catalogcontext.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "song_content")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SongContent implements Serializable {

    @Id
    @Column(name = "song_id")
    private Long songId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "song_id", referencedColumnName = "id")
    private Song song;

    @Lob
    @Column(name = "file", nullable = false)
    private byte[] file;

    @Column(name = "file_content_type")
    private String fileContentType;
}
