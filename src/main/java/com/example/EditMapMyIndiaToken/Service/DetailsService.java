package com.example.EditMapMyIndiaToken.Service;

import com.example.EditMapMyIndiaToken.Converter.MMITConverter;
import com.example.EditMapMyIndiaToken.Model.MapMyIndiaToken;
import com.example.EditMapMyIndiaToken.Repository.DetailsRepository;
import com.example.EditMapMyIndiaToken.VO.MMITVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsService {

    @Autowired
    private DetailsRepository detailsRepository;

    public String addMapMyIndiaDetails(MMITVO mmitvo) throws Exception {
        try {
            if (detailsRepository.existsById(mmitvo.getSno())) throw new Exception("AlreadyExists");
            MapMyIndiaToken mapMyIndiaToken = MMITConverter.convertMmitEntrytoDto(mmitvo);
            detailsRepository.save(mapMyIndiaToken);
            return "Success";
        } catch (Exception e) {
            throw e;
        }
    }

    public String updateMapMyIndiaDetails(MMITVO mmitvo) throws Exception {
        try {
            if (!detailsRepository.existsById(mmitvo.getSno())) throw new Exception("Doesn't Exist");
            if (mmitvo.getSno().equals("")) throw new Exception("Error");
            MapMyIndiaToken mapMyIndiaToken = detailsRepository.findById(mmitvo.getSno()).get();
            System.out.println(mapMyIndiaToken.toString());
            mapMyIndiaToken = MMITConverter.updateMmitEntrytoDto(mapMyIndiaToken, mmitvo);
            System.out.println(mapMyIndiaToken.toString());
            detailsRepository.save(mapMyIndiaToken);
            return "Updated Successfully";
        } catch (Exception e) {
            throw e;
        }
    }

    public String deleteMapMyIndiaDetails(String id) throws Exception {
        try {
            if (!detailsRepository.existsById(id)) throw new Exception("Doesn't Exist");
            detailsRepository.deleteById(id);
            return "Deleted Successfully";
        } catch (Exception e) {
            throw e;
        }
    }

    public String getMapMyIndiaDetails(String id) throws Exception {
        try {
            if (!detailsRepository.existsById(id)) throw new Exception("Doesn't Exist");
            MapMyIndiaToken mapMyIndiaToken = detailsRepository.findById(id).get();
            return mapMyIndiaToken.toString();
        } catch (Exception e) {
            throw e;
        }
    }
}
