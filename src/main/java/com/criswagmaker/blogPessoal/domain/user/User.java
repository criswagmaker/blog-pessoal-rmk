package com.criswagmaker.blogPessoal.domain.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Table(name="user")
@Entity(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @NotNull(message = "O atributo Email é Obrigatório!")
    @Email(message = "O atributo Email deve ser um email válido!")
    private String email;

    @NotNull
    private String password;

    @Size (max = 5000)
    private String photo;

    private String type;

    public User(RequestUser requestUser){
        this.name = requestUser.name();
        this.email = requestUser.email();
        this.password = requestUser.password();
    }
}
