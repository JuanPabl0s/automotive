package com.automotive.repository;

import com.automotive.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ICarRepository extends JpaRepository<Car,Long>, JpaSpecificationExecutor<Car> {


}
