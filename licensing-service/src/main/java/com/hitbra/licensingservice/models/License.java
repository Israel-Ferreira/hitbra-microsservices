package com.hitbra.licensingservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class License {
    
    @Id
    @Column(name = "license_id")
    private String id;

    @Column(name = "organization_id")
    private String organizationId;

    

}
