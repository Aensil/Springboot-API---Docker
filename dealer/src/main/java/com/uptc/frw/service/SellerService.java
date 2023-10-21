package com.uptc.frw.service;

import com.uptc.frw.jpa.entity.Seller;
import com.uptc.frw.jpa.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> findAllSeller(){
        return sellerRepository.findAll();
    }

    public Seller saveSeller(Seller seller){
        return sellerRepository.save(seller);
    }

    public Seller findSeller(Long id){
        return sellerRepository.findById(id).get();
    }

    public void deleteSeller(Long id){
        sellerRepository.deleteById(id);
    }

    public Seller updatePhone(Long id,Long phone){
        Seller seller = findSeller(id);
        seller.setPhone(phone);
        return saveSeller(seller);
    }
}
