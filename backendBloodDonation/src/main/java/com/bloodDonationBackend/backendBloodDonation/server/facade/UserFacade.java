package com.bloodDonationBackend.backendBloodDonation.server.facade;

import com.bloodDonationBackend.backendBloodDonation.server.entity.User;

public interface UserFacade {

   public  User registerNewUser(User user);

   public void initRolesAndUser();
}
