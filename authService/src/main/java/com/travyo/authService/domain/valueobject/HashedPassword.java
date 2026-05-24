package com.travyo.authService.domain.valueobject;

import java.util.Objects;

public record HashedPassword(String value) {

    public HashedPassword {
        Objects.requireNonNull(value, "HashedPassword must not be null");
        if (value.isBlank()) {
            throw new IllegalArgumentException("HashedPassword must not be blank");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}