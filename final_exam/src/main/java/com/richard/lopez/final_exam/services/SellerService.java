package com.richard.lopez.final_exam.services;

import com.richard.lopez.final_exam.domain.Seller;
import com.richard.lopez.final_exam.repository.SellerRepository;
import com.richard.lopez.final_exam.web.SellerController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by rlopez on 21-06-17.
 */
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getAllSellers(){
        return sellerRepository.findAll();
    }

    public void addNewSeller(SellerController.SellerRequestDTO sellerRequestDTO){
        Seller nseller = new Seller();
        nseller.setAge(sellerRequestDTO.getAge());
        nseller.setCi(sellerRequestDTO.getCi());
        nseller.setName(sellerRequestDTO.getName());
        nseller.setNum_cars_sold(sellerRequestDTO.getNum_cars_sold());

        sellerRepository.save(nseller);
    }

    public void deleteSeller(String idSeller){
        sellerRepository.delete(sellerRepository.findOne(idSeller));
    }

    public void updateSeller(SellerController.SellerRequestDTO sellerRequestDTO, String sellerId ){
        Seller nseller = sellerRepository.findOne(sellerId);

        nseller.setName(sellerRequestDTO.getName());
        nseller.setNum_cars_sold(sellerRequestDTO.getNum_cars_sold());
        nseller.setCi(sellerRequestDTO.getCi());
        nseller.setAge(sellerRequestDTO.getAge());

        sellerRepository.save(nseller);
    }
}
