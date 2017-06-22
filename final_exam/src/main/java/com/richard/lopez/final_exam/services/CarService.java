package com.richard.lopez.final_exam.services;

import com.richard.lopez.final_exam.domain.Car;
import com.richard.lopez.final_exam.repository.CarRepository;
import com.richard.lopez.final_exam.web.CarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rlopez on 21-06-17.
 */
@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public void addNewCar(CarController.CarRequestDTO carRequestDTO){
        Car ncar = new Car();
        ncar.setBrand(carRequestDTO.getBrand());
        ncar.setColor(carRequestDTO.getColor());
        ncar.setImage(carRequestDTO.getImage());
        ncar.setModel(carRequestDTO.getModel());
        ncar.setYear(carRequestDTO.getYear());

        carRepository.save(ncar);
    }

    public void deleteCar(String idCar){
        carRepository.delete(carRepository.findOne(idCar));
    }

    public void updateCar(CarController.CarRequestDTO carRequestDTO, String carId ){
        Car ncar = carRepository.findOne(carId);

        ncar.setBrand(carRequestDTO.getBrand());
        ncar.setColor(carRequestDTO.getColor());
        ncar.setImage(carRequestDTO.getImage());
        ncar.setModel(carRequestDTO.getModel());
        ncar.setYear(carRequestDTO.getYear());

        carRepository.save(ncar);
    }
}
