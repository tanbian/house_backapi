package com.team.house.house_backapi.controller;

import com.team.house.house_backapi.entity.District;
import com.team.house.house_backapi.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @RequestMapping("/getAllDistrict")
    @CrossOrigin(value = "*",allowCredentials ="true" )
    public List<District> getAllDistrict(){
        return districtService.getAllDistrict();
    }
}
