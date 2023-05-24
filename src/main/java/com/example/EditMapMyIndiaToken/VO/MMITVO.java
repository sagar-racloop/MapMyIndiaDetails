package com.example.EditMapMyIndiaToken.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class MMITVO {

    private String sno;
    private String accessToken;
    private String activeYn;
    private String crtUsr;
    private String lstUpdUsr;
}
