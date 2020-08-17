package com.siddhant.project1.Enitity;

import javax.persistence.*;
import java.time.Year;

@Entity
@Table(name="CARS")
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CAR_ID")
    private int car_id;
    @Column(name="CAR_MAKE")
    private String car_make;
    @Column(name="CAR_MODEL")
    private String car_model;
    @Column(name="CAR_TYPE")
    private String car_type;
    @Column(name="MFYEAR")
    private int year;
    @Column(name="COLOR")
    private String color;

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_make() {
        return car_make;
    }

    public void setCar_make(String car_make) {
        this.car_make = car_make;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
