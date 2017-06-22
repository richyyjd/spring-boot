package com.richard.lopez.final_exam.web;

import com.richard.lopez.final_exam.domain.Car;
import com.richard.lopez.final_exam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rlopez on 21-06-17.
 */
@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCar(@RequestBody CarRequestDTO carDTO) {
        carService.addNewCar(carDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable String carId) {
        carService.deleteCar(carId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateCar(@RequestBody CarRequestDTO carDTO, @PathVariable String carId) {
        carService.updateCar(carDTO, carId);
    }

    public static class CarRequestDTO{
        private String brand;
        private long year;
        private String model;
        private String color;
        private String image;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public long getYear() {
            return year;
        }

        public void setYear(long year) {
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
