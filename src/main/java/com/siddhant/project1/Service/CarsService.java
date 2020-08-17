package com.siddhant.project1.Service;

import com.siddhant.project1.Enitity.Cars;
import com.siddhant.project1.Repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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

    public void updateCar(Cars car, int id) {
        Cars prev  = carsRepository.findById(id).get();
        if(prev==null) return;
        prev.setCar_make(car.getCar_make());
        prev.setCar_model(car.getCar_model());
        prev.setCar_type(car.getCar_type());
        prev.setColor(car.getColor());
        prev.setYear(car.getYear());
        carsRepository.save(prev);

    }

    public void deleteCar(int id) {
        try {
            carsRepository.deleteById(id);
        }
        catch (NoSuchElementException e) {
            return;
        }
        catch(EmptyResultDataAccessException e)
        {
            return;
        }
    }
    public Cars getCar(String make, String type) {
        try {
            List<Cars> cars = new ArrayList<>();
            carsRepository.findAll().forEach(c -> {
                if (c.getCar_make().contains(make)) cars.add(c);
            });
            return cars.stream().filter(c -> c.getCar_type().equals(type)).findFirst().get();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}
