package com.richard.lopez.final_exam.web;

import com.richard.lopez.final_exam.domain.Buyer;
import com.richard.lopez.final_exam.services.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rlopez on 21-06-17.
 */
@RestController
@RequestMapping("/buyers")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Buyer> getAllBuyers(){
        return buyerService.getAllBuyers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addBuyer(@RequestBody BuyerRequestDTO buyerRequestDTO) {
        buyerService.addNewBuyer(buyerRequestDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBuyer(@PathVariable String buyerId) {
        buyerService.deleteBuyer(buyerId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateBuyer(@RequestBody BuyerRequestDTO buyerRequestDTO, @PathVariable String buyerId) {
        buyerService.updateBuyer(buyerRequestDTO, buyerId);
    }

    public static class BuyerRequestDTO{
        private String name;
        private long ci;
        private String profession;
        private long cel;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getCi() {
            return ci;
        }

        public void setCi(long ci) {
            this.ci = ci;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

        public long getCel() {
            return cel;
        }

        public void setCel(long cel) {
            this.cel = cel;
        }
    }
}
