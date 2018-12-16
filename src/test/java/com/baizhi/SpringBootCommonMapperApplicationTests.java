package com.baizhi;

import com.baizhi.entity.City;
import com.baizhi.mapper.CityMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootCommonMapperApplication.class)
public class SpringBootCommonMapperApplicationTests {

    @Autowired
    private CityMapper cityMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
        List<City> cities = cityMapper.selectAll();
        for (City city : cities) {
            System.out.println(city);
        }
    }
}

