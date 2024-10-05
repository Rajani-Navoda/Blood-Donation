package com.bloodDonationBackend.backendBloodDonation.server.facade;

import com.bloodDonationBackend.backendBloodDonation.server.entity.Role;
import com.bloodDonationBackend.backendBloodDonation.server.repository.CommonRepository;


public interface CommonFacade  {
    public Role createNewRole(Role role);

}
