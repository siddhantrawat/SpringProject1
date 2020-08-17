package com.siddhant.project1.Repository;

import com.siddhant.project1.Enitity.Cars;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends CrudRepository <Cars, Integer>{
}
