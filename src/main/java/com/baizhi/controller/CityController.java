package com.baizhi.controller;


import com.baizhi.entity.City;
import com.baizhi.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("city")
public class CityController {

    @Autowired
    private CityMapper cityMapper;

    @RequestMapping("/user")
    public List<City> test(){
        List<City> cities = cityMapper.selectAll();
        for (City city : cities) {
            System.out.println(city);
        }
        return cities;
    }


}
