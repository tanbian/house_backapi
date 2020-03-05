package com.team.house.house_backapi.controller;

import com.team.house.house_backapi.entity.Type;
import com.team.house.house_backapi.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {
    @Autowired
    private TypeService typeService;

    @CrossOrigin(value = "*",allowCredentials ="true" )
    @RequestMapping("/getTypes")
    public List<Type> getTypes(){
        return  typeService.getAllType();
    }
}
