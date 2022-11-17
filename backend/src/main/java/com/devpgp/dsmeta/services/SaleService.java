package com.devpgp.dsmeta.services;

import com.devpgp.dsmeta.entities.Sale;
import com.devpgp.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findSale(){
        return saleRepository.findAll();
    }

}
