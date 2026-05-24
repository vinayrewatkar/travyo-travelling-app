package com.travyo.authService.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponse {

    private String accessToken;
    private String refreshToken;
    private String tokenType = "Bearer";
    private long accessTokenExpiresIn;
    private String userId;
    private String email;
    private String role;
}