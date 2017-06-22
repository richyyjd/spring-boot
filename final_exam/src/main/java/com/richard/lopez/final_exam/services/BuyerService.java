package com.richard.lopez.final_exam.services;

import com.richard.lopez.final_exam.domain.Buyer;
import com.richard.lopez.final_exam.repository.BuyerRepository;
import com.richard.lopez.final_exam.web.BuyerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rlopez on 21-06-17.
 */
@Service
public class BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers(){
        return buyerRepository.findAll();
    }

    public void addNewBuyer(BuyerController.BuyerRequestDTO buyerRequestDTO){
        Buyer nbuyer = new Buyer();


        buyerRepository.save(nbuyer);
    }

    public void deleteBuyer(String idBuyer){
        buyerRepository.delete(buyerRepository.findOne(idBuyer));
    }

    public void updateBuyer(BuyerController.BuyerRequestDTO buyerRequestDTO, String buyerId ){
        Buyer nbuyer = buyerRepository.findOne(buyerId);


        buyerRepository.save(nbuyer);
    }
}
