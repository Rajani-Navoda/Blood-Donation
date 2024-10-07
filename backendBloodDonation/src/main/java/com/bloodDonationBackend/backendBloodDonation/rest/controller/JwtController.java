package com.bloodDonationBackend.backendBloodDonation.rest.controller;

import com.bloodDonationBackend.backendBloodDonation.server.entity.JwtRequest;
import com.bloodDonationBackend.backendBloodDonation.server.entity.JwtResponse;
import com.bloodDonationBackend.backendBloodDonation.server.facade.JwtImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtImpl jwtImpl;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception{
        return jwtImpl.createJwtToken(jwtRequest);
    }
}
