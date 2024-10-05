package com.bloodDonationBackend.backendBloodDonation.rest.dto.role;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RoleDetailDto implements Serializable {
    private String roleName;
    private String roleDescription;
}
