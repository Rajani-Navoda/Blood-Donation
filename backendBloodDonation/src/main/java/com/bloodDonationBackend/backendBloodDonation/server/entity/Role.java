package com.bloodDonationBackend.backendBloodDonation.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Role")
public class Role {
    @Id
    @Column(name = "role_name")
    private String roleName;
    @Column(name="role_description")
    private String roleDescription;
}
