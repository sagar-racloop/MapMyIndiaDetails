package com.example.EditMapMyIndiaToken.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "t_facility_transfer_request_dtls")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacilityTransferRequest {
    @Id
    @Column(name="SERIAL_NO")
    private String serialNo;
    private String facilityId;
    private String alternateId;
    private String facilityName;
    private String requestFrom;
    private String requestTo;
    private String status;
    private String activeYn ;
    private Date crtDt;
    private String crtUsr;
    private String lstUpdUsr;
    private Date lstUpdDt;
}
