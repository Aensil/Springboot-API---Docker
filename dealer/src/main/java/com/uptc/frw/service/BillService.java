package com.uptc.frw.service;


import com.uptc.frw.jpa.entity.*;
import com.uptc.frw.jpa.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    @Autowired
    private BillRepository billRepository;

    @Autowired
    private ClientService clientService;

    @Autowired
    private SellerService sellerService;

    @Autowired
    private CarService carService;

    @Autowired
    private UseCarService useCarService;

    public List<Bill> findAllBill(){
        return billRepository.findAll();
    }

    public Bill saveBill(Bill bill){
        Client client = clientService.findClient(bill.getIdClient());
        Seller seller = sellerService.findSeller(bill.getIdSeller());
        Car car = carService.findCar(bill.getIdCar());
        UseCar useCar = useCarService.findUseCar(bill.getIdCarRecieve());
        bill.setClient(client);
        bill.setSeller(seller);
        bill.setCar(car);
        bill.setUseCar(useCar);
        return billRepository.save(bill);
    }

    public Bill findBill(Long id){
        return billRepository.findById(id).get();
    }

    public void deleteBill(Long id){
        billRepository.deleteById(id);
    }

    public Bill updatePrice(Long id,Double price){
        Bill bill = findBill(id);
        bill.setTotalPrice(price);
        return saveBill(bill);
    }
}
