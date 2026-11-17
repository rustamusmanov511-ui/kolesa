package com.example.kolesaproject.Controller;

import com.example.kolesaproject.Entity.Car;
import com.example.kolesaproject.Service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }
    @GetMapping
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }
    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        Car savedCar = carService.saveCar(car);
        return ResponseEntity.ok(savedCar);
    }
    @GetMapping("/brand")
    public List<Car> getCarsByBrand(@RequestParam String name){
        return carService.getCarsByBrand(name);
    }
    @GetMapping("/city")
    public List<Car> getCarsByCity(@RequestParam String name){
        return carService.getCarsByCity(name);
    }

}
