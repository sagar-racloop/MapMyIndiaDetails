package com.example.EditMapMyIndiaToken.Controller;

import com.example.EditMapMyIndiaToken.Model.MapMyIndiaToken;
import com.example.EditMapMyIndiaToken.Service.DetailsService;
import com.example.EditMapMyIndiaToken.VO.MMITVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DetailsController {

    @Autowired
    private DetailsService detailsService;

    @PostMapping("/addMapMyIndiaDetails")
    public ResponseEntity<String> addMapMyIndiaDetails(@RequestBody MMITVO mmitvo) {
        try {
            String response = detailsService.addMapMyIndiaDetails(mmitvo);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/updateMapMyIndiaDetails")
    public ResponseEntity<String> updateMapMyIndiaDetails(@RequestBody MMITVO mmitvo) {
        try {
            String response = detailsService.updateMapMyIndiaDetails(mmitvo);
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping("/deleteMapMyIndiaDetails")
    public ResponseEntity<String> deleteMapMyIndiaDetails(@RequestParam String id) {
        try {
            String response = detailsService.deleteMapMyIndiaDetails(id);
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/getMapMyIndiaDetails")
    public ResponseEntity<String> getMapMyIndiaDetails(@RequestParam String id) {
        try {
            String response = detailsService.getMapMyIndiaDetails(id);
            return new ResponseEntity<>(response, HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
