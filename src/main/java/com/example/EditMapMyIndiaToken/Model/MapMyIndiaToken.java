package com.example.EditMapMyIndiaToken.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Entity
@Table(name="map_my_india_token")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapMyIndiaToken implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sno;
    private String accessToken;
    private String activeYn;
    private Date crtDt;
    private String crtUsr;
    private Date lstUpdDt;
    private String lstUpdUsr;

    @Id
    @Column(name="SNO")
    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    @Column(name="ACCESS_TOKEN")
    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    @Column(name="ACTIVE_YN")
    public String getActiveYn() {
        return activeYn;
    }
    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }


    @Column(name="CRT_USR")
    public String getCrtUsr() {
        return crtUsr;
    }
    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name="CRT_DT")
    public Date getCrtDt() {
        return crtDt;
    }
    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    @Column(name="LST_UPD_USR")
    public String getLstUpdUsr() {
        return lstUpdUsr;
    }
    public void setLstUpdUsr(String lstUpdUsr) {
        this.lstUpdUsr = lstUpdUsr;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name="LST_UPD_DT")
    public Date getLstUpdDt() {
        return lstUpdDt;
    }
    public void setLstUpdDt(Date lstUpdDt) {
        this.lstUpdDt = lstUpdDt;
    }


}
