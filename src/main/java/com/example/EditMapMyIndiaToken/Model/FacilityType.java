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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "m_facility_type")
public class FacilityType {
    private static final long serialVersionUID = 1L;

    @Id
    @Column( name = "ID")
    private String id;
    private String description;
    private String redirectForm;
    private String activeYn;
    private Date crtDt;
    private String crtUsr;
    private Date lstUpdDt;
    private String lstUpdUsr;
}
