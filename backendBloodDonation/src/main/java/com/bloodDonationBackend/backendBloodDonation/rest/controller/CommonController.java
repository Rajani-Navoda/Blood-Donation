package com.bloodDonationBackend.backendBloodDonation.rest.controller;

import com.bloodDonationBackend.backendBloodDonation.server.entity.Role;
import com.bloodDonationBackend.backendBloodDonation.server.facade.CommonFacade;
import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CommonController  {
    @Autowired
    private CommonFacade commonFacade;
    @PostMapping({"/create-new-role"})
    public Role createNewRole(@RequestBody Role role){
       return commonFacade.createNewRole(role);

    }
}
