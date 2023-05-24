package com.example.EditMapMyIndiaToken.Converter;

import com.example.EditMapMyIndiaToken.Model.MapMyIndiaToken;
import com.example.EditMapMyIndiaToken.VO.MMITVO;

import java.time.LocalDate;

public class MMITConverter {

    public static MapMyIndiaToken convertMmitEntrytoDto(MMITVO mmitvo) {
        MapMyIndiaToken mapMyIndiaToken = MapMyIndiaToken.builder()
                .sno(mmitvo.getSno())
                .accessToken(mmitvo.getAccessToken())
                .activeYn(mmitvo.getActiveYn())
                .crtDt(DateConverter.convertLocalDateToDate(LocalDate.now()))
                .crtUsr(mmitvo.getCrtUsr())
                .lstUpdDt(DateConverter.convertLocalDateToDate(LocalDate.now()))
                .lstUpdUsr(mmitvo.getLstUpdUsr())
                .build();
        return mapMyIndiaToken;
    }

    public static MapMyIndiaToken updateMmitEntrytoDto(MapMyIndiaToken mapMyIndiaToken, MMITVO mmitvo) throws Exception {
                if(!mmitvo.getAccessToken().equals("")) mapMyIndiaToken.setAccessToken(mmitvo.getAccessToken());
                if(!mmitvo.getActiveYn().equals("")) mapMyIndiaToken.setActiveYn(mmitvo.getActiveYn());
                if(!mmitvo.getCrtUsr().equals("")) mapMyIndiaToken.setCrtUsr(mmitvo.getCrtUsr());
                mapMyIndiaToken.setLstUpdDt(DateConverter.convertLocalDateToDate(LocalDate.now()));
                if (!mmitvo.getLstUpdUsr().equals("")) mapMyIndiaToken.setLstUpdUsr(mmitvo.getLstUpdUsr());
        return mapMyIndiaToken;
    }
}
