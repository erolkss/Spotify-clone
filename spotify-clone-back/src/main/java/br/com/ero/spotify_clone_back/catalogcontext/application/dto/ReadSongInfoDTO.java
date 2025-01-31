package br.com.ero.spotify_clone_back.catalogcontext.application.dto;

import br.com.ero.spotify_clone_back.catalogcontext.application.vo.SongAuthorVO;
import br.com.ero.spotify_clone_back.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class ReadSongInfoDTO {

    private SongTitleVO title;

    private SongAuthorVO author;

    @NotNull
    private byte[] cover;

    @NotNull
    private String contentType;

    @NotNull
    private boolean isFavorite;

    private UUID publicId;

}
