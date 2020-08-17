package com.siddhant.project1.Controller;

import com.siddhant.project1.Enitity.Cars;
import com.siddhant.project1.Service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarsController {
    @Autowired
    private CarsService carsService;

    @RequestMapping("/cars")
    public List<Cars> getAll()
    {
        return carsService.getAll();
    }
}
