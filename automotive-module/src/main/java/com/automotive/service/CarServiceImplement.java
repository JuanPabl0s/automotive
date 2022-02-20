package com.automotive.service;

import antlr.StringUtils;
import com.automotive.domain.Car;
import com.automotive.repository.ICarRepository;
import com.automotive.request.CarRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Slf4j
@Service
public class CarServiceImplement implements CarService{

    @Autowired
    private  ICarRepository iCarRepository;

    @Override
    public void saveCar(CarRequest carRequest) {
    log.info("Creating car with request [{}]", carRequest);

    Car car = Car.builder()
            .brand(carRequest.getBrand())
            .model(carRequest.getModel())
            .date(carRequest.getDate())
            .build();
        // crear metodo de busqueda si es que existeOptional<Car>

        iCarRepository.saveAndFlush(car);

    }
}
