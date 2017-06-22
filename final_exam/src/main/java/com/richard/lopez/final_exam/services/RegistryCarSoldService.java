package com.richard.lopez.final_exam.services;

import com.richard.lopez.final_exam.domain.Buyer;
import com.richard.lopez.final_exam.domain.Car;
import com.richard.lopez.final_exam.domain.RegistryCarSold;
import com.richard.lopez.final_exam.domain.Seller;
import com.richard.lopez.final_exam.repository.BuyerRepository;
import com.richard.lopez.final_exam.repository.CarRepository;
import com.richard.lopez.final_exam.repository.RegistryCarSoldRepository;
import com.richard.lopez.final_exam.repository.SellerRepository;
import com.richard.lopez.final_exam.web.RegistryCarSoldController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by rlopez on 21-06-17.
 */
@Service
public class RegistryCarSoldService {

    @Autowired
    private SellerRepository sellerRepository;
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private BuyerRepository buyerRepository;
    @Autowired
    private RegistryCarSoldRepository registryCarSoldRepository;

    public List<RegistryCarSold> getAllRegistries() {
        return registryCarSoldRepository.findAll();
    }

    public HashMap<String, Object> getAllRegistriesBySeller(String sellerId) {
        HashMap<String, Object> answer = new HashMap<>();
        RegistryCarSold registryCarSold = registryCarSoldRepository.searchBySeller(sellerId);

        answer.put("Name Seller: ", registryCarSold.getSeller().getName());
        answer.put("Quatity Cars Sold: ", registryCarSold.getSeller().getNum_cars_sold());

        return answer;
    }

    public void addRegistryCarSold(RegistryCarSoldController.RegistryCarSoldRequestDTO registryCarSoldRequestDTO) {

        Seller nseller = sellerRepository.findOne(registryCarSoldRequestDTO.getSellerId());
        Car ncar = carRepository.findOne(registryCarSoldRequestDTO.getCarId());
        Buyer nbuyer = buyerRepository.findOne(registryCarSoldRequestDTO.getBuyerId());

        RegistryCarSold nregistryCarSold = new RegistryCarSold();
        nregistryCarSold.setSeller(nseller);
        nregistryCarSold.setCar(ncar);
        nregistryCarSold.setBuyer(nbuyer);
        nregistryCarSold.setDateOfSell(registryCarSoldRequestDTO.getDateOfSell());

        registryCarSoldRepository.save(nregistryCarSold);
    }

    public void deleteRegistryCarSold(String registryCarSoldId) {

        RegistryCarSold registryCarSold = registryCarSoldRepository.findOne(registryCarSoldId);
        registryCarSoldRepository.delete(registryCarSold);
    }

    //TODO> Should be implemented
    public void updateRegistryCarSold(){}
}
