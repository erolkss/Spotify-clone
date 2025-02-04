package br.com.ero.spotify_clone_back.usercontext.presentation;

import br.com.ero.spotify_clone_back.usercontext.ReadUserDTO;
import br.com.ero.spotify_clone_back.usercontext.application.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthResource {

    private final UserService userService;
    private final ClientRegistration registration;


    @GetMapping("/get-authenticated-user")
    public ResponseEntity<ReadUserDTO> getAuthenticatedUser(@AuthenticationPrincipal OAuth2User user) {
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            userService.syncWithIdp(user);
            ReadUserDTO userFromAuthentication = userService.getAuthenticatedUserFromSecurityContext();
            return ResponseEntity.ok().body(userFromAuthentication);
        }
    }

}
