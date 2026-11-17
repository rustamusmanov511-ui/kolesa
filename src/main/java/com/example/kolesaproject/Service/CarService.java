package com.example.kolesaproject.Service;

import com.example.kolesaproject.Entity.Car;
import com.example.kolesaproject.Repository.CarRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepo carRepo;

    public CarService(CarRepo carRepo){
        this.carRepo = carRepo;
    }
    public List<Car> getAllCars(){
        return carRepo.findAll();
    }
    public Car saveCar(Car car){
        return carRepo.save(car);
    }
    public List<Car> getCarsByBrand(String brand){
        return carRepo.findByBrandIgnoreCase(brand);
    }

    public List<Car> getCarsByCity(String city){
        return carRepo.findByCityIgnoreCase(city);
    }

}
