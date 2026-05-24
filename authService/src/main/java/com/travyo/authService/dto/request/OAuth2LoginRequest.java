package com.travyo.authService.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class OAuth2LoginRequest {

    @NotBlank(message = "Authorization code is required")
    private String code;

    // "google" or "apple" — comes from path variable
    // but we carry provider here for service layer convenience
    private String provider;
}
