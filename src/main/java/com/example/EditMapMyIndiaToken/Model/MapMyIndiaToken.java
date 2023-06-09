package com.example.EditMapMyIndiaToken.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;



@Entity
@Table(name="map_my_india_token")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapMyIndiaToken implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String sno;
    private String accessToken;
    private String activeYn;
    private Date crtDt;
    private String crtUsr;
    private Date lstUpdDt;
    private String lstUpdUsr;






}
