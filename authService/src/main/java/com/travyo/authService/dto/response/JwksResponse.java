package com.travyo.authService.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwksResponse {

    private List<JwkKey> keys;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class JwkKey {
        private String kty;    // "RSA"
        private String use;    // "sig"
        private String alg;    // "RS256"
        private String kid;    // key ID
        private String n;      // base64url encoded modulus
        private String e;      // base64url encoded exponent
    }
}
