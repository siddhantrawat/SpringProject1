package com.siddhant.project1.Service;

import com.siddhant.project1.Enitity.Cars;
import com.siddhant.project1.Repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsService {
    @Autowired
    private CarsRepository carsRepository;
    public List<Cars> getAll()
    {
        List<Cars> cars = new ArrayList<>();
        carsRepository.findAll().forEach(cars::add);
        return cars;
    }
}
