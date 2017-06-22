package com.richard.lopez.final_exam.web;

import com.richard.lopez.final_exam.domain.RegistryCarSold;
import com.richard.lopez.final_exam.services.RegistryCarSoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by rlopez on 21-06-17.
 */
@RestController
@RequestMapping("/registries")
public class RegistryCarSoldController {

    @Autowired
    private RegistryCarSoldService registryCarSoldService;

    @RequestMapping(method = RequestMethod.GET)
    public List<RegistryCarSold> getAllRegistries() {
        return registryCarSoldService.getAllRegistries();
    }

    @RequestMapping(value = "/canCarsSoldBySeller/{sellerId}", method = RequestMethod.GET)
    public HashMap<String, Object> getAllRegistriesBySeller(@PathVariable String sellerId) {
        return registryCarSoldService.getAllRegistriesBySeller(sellerId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addRegistryCarSold(@RequestBody RegistryCarSoldRequestDTO registryDTO) {
        registryCarSoldService.addRegistryCarSold(registryDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRegistryCarSold(@PathVariable String id) {
        registryCarSoldService.deleteRegistryCarSold(id);
    }

    //TODO> Should be implemented
    public void updateRegistryCarSold(){}

    public static class RegistryCarSoldRequestDTO{
        private String sellerId;
        private String carId;
        private String buyerId;
        private Date dateOfSell;

        public String getSellerId() {
            return sellerId;
        }

        public void setSellerId(String sellerId) {
            this.sellerId = sellerId;
        }

        public String getCarId() {
            return carId;
        }

        public void setCarId(String carId) {
            this.carId = carId;
        }

        public String getBuyerId() {
            return buyerId;
        }

        public void setBuyerId(String buyerId) {
            this.buyerId = buyerId;
        }

        public Date getDateOfSell() {
            return dateOfSell;
        }

        public void setDateOfSell(Date dateOfSell) {
            this.dateOfSell = dateOfSell;
        }
    }
}
