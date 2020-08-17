package com.siddhant.project1.Controller;

import com.siddhant.project1.Enitity.Cars;
import com.siddhant.project1.Service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/cars/")
    @RequestMapping(method = RequestMethod.POST , value ="/cars")
    public void addCar(@RequestBody Cars car)
    {
        carsService.addCar(car);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/cars/{id}")
    public void updateCar(@RequestBody Cars car)
    {
        carsService.updateCar(car);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/cars/{id}")
    public void deleteCar(@PathVariable int id)
    {
        carsService.deleteCar(id);
    }
}
