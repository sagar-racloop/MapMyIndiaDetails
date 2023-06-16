package com.example.EditMapMyIndiaToken.Service;

import com.example.EditMapMyIndiaToken.Converter.MMITConverter;
import com.example.EditMapMyIndiaToken.Model.FacilityTransferRequest;
import com.example.EditMapMyIndiaToken.Model.FacilityType;
import com.example.EditMapMyIndiaToken.Model.MapMyIndiaToken;
import com.example.EditMapMyIndiaToken.Repository.DetailsRepository;
import com.example.EditMapMyIndiaToken.Repository.FacilityTransferRepository;
import com.example.EditMapMyIndiaToken.Repository.FacilityTypeRepository;
import com.example.EditMapMyIndiaToken.VO.MMITVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsService {

    @Autowired
    private DetailsRepository detailsRepository;

    @Autowired
    private FacilityTransferRepository facilityTransferRepository;

    @Autowired
    private FacilityTypeRepository facilityTypeRepository;

    public String addMapMyIndiaDetails(MMITVO mmitvo) throws Exception {
        if (detailsRepository.existsById(mmitvo.getSno())) throw new Exception("AlreadyExists");
        MapMyIndiaToken mapMyIndiaToken = MMITConverter.convertMmitEntrytoDto(mmitvo);
        detailsRepository.save(mapMyIndiaToken);
        return "Success";
    }

    public String updateMapMyIndiaDetails(MMITVO mmitvo) throws Exception {
        if (!detailsRepository.existsById(mmitvo.getSno())) throw new Exception("Doesn't Exist");
        if (mmitvo.getSno().equals("")) throw new Exception("Error");
        MapMyIndiaToken mapMyIndiaToken = detailsRepository.findById(mmitvo.getSno()).get();
        System.out.println(mapMyIndiaToken.toString());
        mapMyIndiaToken = MMITConverter.updateMmitEntrytoDto(mapMyIndiaToken, mmitvo);
        System.out.println(mapMyIndiaToken.toString());
        detailsRepository.save(mapMyIndiaToken);
        return "Updated Successfully";
    }

    public String deleteMapMyIndiaDetails(String id) throws Exception {
        if (!detailsRepository.existsById(id)) throw new Exception("Doesn't Exist");
        detailsRepository.deleteById(id);
        return "Deleted Successfully";
    }

    public String getMapMyIndiaDetails(String id) throws Exception {
        if (!detailsRepository.existsById(id)) throw new Exception("Doesn't Exist");
        MapMyIndiaToken mapMyIndiaToken = detailsRepository.findById(id).get();
        return mapMyIndiaToken.toString();
    }

    public List<FacilityTransferRequest> getAllFacilityTransferRequests() throws Exception {
        return facilityTransferRepository.findAll();
    }

    public FacilityType getFacilityTypeById(String id) throws Exception {
        return facilityTypeRepository.findById(id).orElse(null);
    }

    public List<FacilityType> getAllFacilitySubType() throws Exception {
        return facilityTypeRepository.findAll();
    }
}
