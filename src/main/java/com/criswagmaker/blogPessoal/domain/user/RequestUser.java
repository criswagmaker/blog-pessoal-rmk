package com.criswagmaker.blogPessoal.domain.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestUser(
        @NotBlank
        String name,
        @NotBlank
        @NotNull
        String email,
        @NotNull
        String password) {
}
