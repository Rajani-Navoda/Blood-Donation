package com.bloodDonationBackend.backendBloodDonation.server.repository;

import com.bloodDonationBackend.backendBloodDonation.server.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CommonRepository extends JpaRepository<Role, String> {

}
