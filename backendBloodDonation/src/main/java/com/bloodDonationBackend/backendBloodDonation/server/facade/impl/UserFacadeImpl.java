package com.bloodDonationBackend.backendBloodDonation.server.facade.impl;

import com.bloodDonationBackend.backendBloodDonation.server.entity.Role;
import com.bloodDonationBackend.backendBloodDonation.server.entity.User;
import com.bloodDonationBackend.backendBloodDonation.server.facade.UserFacade;
import com.bloodDonationBackend.backendBloodDonation.server.repository.CommonRepository;
import com.bloodDonationBackend.backendBloodDonation.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserFacadeImpl implements UserFacade {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommonRepository commonRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User registerNewUser(User user){
        Role role=  commonRepository.findById("User").get();

        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRole(roles);

        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
        return userRepository.save(user);
    }

    @Override
    public void initRolesAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin for the system. have all permissions for the system.");
        commonRepository.save(adminRole);

        Role donorRole = new Role();
        donorRole.setRoleName("donor");
        donorRole.setRoleDescription("donor for the system");
        commonRepository.save(donorRole);

        User adminUser = new User();
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setUserName("admin123");
        adminUser.setUserPassword(getEncodedPassword("admin@123"));
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userRepository.save(adminUser);

//        User donor = new User();
//        donor.setUserFirstName("defaultDonor");
//        donor.setUserLastName("defaultDonor");
//        donor.setUserName("donor123");
//        donor.setUserPassword(getEncodedPassword("donor@123"));
//        Set<Role> donorRoles = new HashSet<>();
//        donorRoles.add(donorRole);
//        donor.setRole(donorRoles);
//        userRepository.save(donor);
    }

    public String getEncodedPassword(String password){
        return passwordEncoder.encode(password);
    }
}
