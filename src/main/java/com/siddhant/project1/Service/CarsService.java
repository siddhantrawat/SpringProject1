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

    public void addCar(Cars car) {
        carsRepository.save(car);
    }

    public void updateCar(Cars car) {
        carsRepository.save(car);

    }

    public void deleteCar(int id) {
        carsRepository.deleteById(id);
    }

    public Cars getCar(String make, String type) {
        List<Cars> cars = new ArrayList<>();
        carsRepository.findAll().forEach(c-> {if(c.getCar_make().contains(make)) cars.add(c);});
        return cars.stream().filter(c->c.getCar_type().equals(type)).findFirst().get();
    }
}
