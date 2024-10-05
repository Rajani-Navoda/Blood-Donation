package com.bloodDonationBackend.backendBloodDonation.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
@Getter
@Setter
public class JwtResponse {
    private User user;
    private String jwtToken;
}
