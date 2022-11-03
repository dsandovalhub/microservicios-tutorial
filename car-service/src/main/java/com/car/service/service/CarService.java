package com.car.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.service.entity.Car;
import com.car.service.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public List<Car> getAll() {
		return carRepository.findAll();		
	}
	
	public Car getCarById(int id) {
		return carRepository.findById(id).orElse(null);
	}	
	
	public Car save(Car car) {
		Car nuevoCarro = carRepository.save(car);
		return nuevoCarro;
	}
	
	public List<Car> byUsuarioId(int usuarioId){
		return carRepository.findByUsuarioId(usuarioId);
		
	}

}
