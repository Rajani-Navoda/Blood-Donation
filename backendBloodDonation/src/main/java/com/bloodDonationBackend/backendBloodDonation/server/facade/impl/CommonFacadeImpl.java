package com.bloodDonationBackend.backendBloodDonation.server.facade.impl;

import com.bloodDonationBackend.backendBloodDonation.server.entity.Role;
import com.bloodDonationBackend.backendBloodDonation.server.facade.CommonFacade;
import com.bloodDonationBackend.backendBloodDonation.server.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonFacadeImpl implements CommonFacade {

    @Autowired
    private CommonRepository commonRepository;

    @Override
    public Role createNewRole(Role role) {
        return commonRepository.save(role);
    }
}
