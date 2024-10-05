package com.bloodDonationBackend.backendBloodDonation.server.repository;

import com.bloodDonationBackend.backendBloodDonation.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
