package com.richard.lopez.final_exam.web;

import com.richard.lopez.final_exam.domain.Seller;
import com.richard.lopez.final_exam.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rlopez on 21-06-17.
 */
@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Seller> getAllSellers(){
        return sellerService.getAllSellers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addSeller(@RequestBody SellerRequestDTO sellerRequestDTO) {
        sellerService.addNewSeller(sellerRequestDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSeller(@PathVariable String sellerId) {
        sellerService.deleteSeller(sellerId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateSeller(@RequestBody SellerRequestDTO sellerRequestDTO, @PathVariable String sellerId) {
        sellerService.updateSeller(sellerRequestDTO, sellerId);
    }

    public static class SellerRequestDTO{
        private String name;
        private long age;
        private long ci;
        private long num_cars_sold;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getAge() {
            return age;
        }

        public void setAge(long age) {
            this.age = age;
        }

        public long getCi() {
            return ci;
        }

        public void setCi(long ci) {
            this.ci = ci;
        }

        public long getNum_cars_sold() {
            return num_cars_sold;
        }

        public void setNum_cars_sold(long num_cars_sold) {
            this.num_cars_sold = num_cars_sold;
        }
    }
}
