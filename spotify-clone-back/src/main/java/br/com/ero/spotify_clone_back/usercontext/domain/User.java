package br.com.ero.spotify_clone_back.usercontext.domain;

import br.com.ero.spotify_clone_back.sharedkernel.domain.AbstractAuditingEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "spotify_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends AbstractAuditingEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSequenceGenerator")
    @SequenceGenerator(
            name = "userSequenceGenerator",
            sequenceName = "user_generator",
            allocationSize = 1

    )
    @Column(name = "id")
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "email")
    private String email;

    private Subscription subscription = Subscription.FREE;

    @Column(name = "image_url")
    private String imageUrl;
}

