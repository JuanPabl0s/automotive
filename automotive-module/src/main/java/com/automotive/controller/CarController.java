package com.automotive.controller;

import com.automotive.domain.Car;
import com.automotive.repository.ICarRepository;
import com.automotive.request.CarRequest;
import com.automotive.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/car")
public class CarController {

    private final CarService carService;

    @Autowired
    private ICarRepository iCarRepository;


    List<Car> listCars = new ArrayList<>();

    public CarController(CarService carService) {
        this.carService = carService;
    }
    //Implementar ConcurrentMap

    @GetMapping("/cars")
    public List<Car> getCars(){
       return List.of(new Car (1L,"BMW","120I","2020"));
    }

    @PostMapping
    public void createCar(CarRequest carRequest){
        log.info("Creating Car with request [{}]", carRequest);
         carService.saveCar(carRequest);
    }

}
