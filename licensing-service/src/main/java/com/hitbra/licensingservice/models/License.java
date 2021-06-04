package com.hitbra.licensingservice.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

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


    @Transient
	private String organizationName = "" ;

	@Transient
	private String contactName = "" ;

	@Transient
	private String contactPhone = "" ;

	@Transient
	private String contactEmail = "" ;


	@Column( name = "product_name", nullable = false )
	private String productName ;

	@Column( name = "license_type", nullable = false )
	private String licenseType ;

	@Column( name = "license_max", nullable = false )
	private Integer licenseMax ;

	@Column( name = "license_allocated", nullable = false )
	private Integer licenseAllocated ;

    public License(String organizationId, String productName, String licenseType, Integer licenseMax,
            Integer licenseAllocated) {
        this.id = UUID.randomUUID().toString();
        this.organizationId = organizationId;
        this.productName = productName;
        this.licenseType = licenseType;
        this.licenseMax = licenseMax;
        this.licenseAllocated = licenseAllocated;
    }

    

    

}
