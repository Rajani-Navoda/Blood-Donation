package com.bloodDonationBackend.backendBloodDonation.rest.controller;

import com.bloodDonationBackend.backendBloodDonation.server.entity.User;
import com.bloodDonationBackend.backendBloodDonation.server.facade.UserFacade;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController  {
    @Autowired
    private UserFacade userFacade;

    @PostMapping({"/register-new-user"})
    public User registernewuser(@RequestBody User user){
        return userFacade.registerNewUser(user);
    }
    @PostConstruct
    public  void initRolesAndUsers(){
        userFacade.initRolesAndUser();
    }
    @GetMapping({"/for-admin"})
    public String forAdmin(){
        return "This URL is only accessible to admin";
    }
    @GetMapping({"/for-donor"})
    public String forUser(){
        return "This URL is only accessible to donor";
    }

}
