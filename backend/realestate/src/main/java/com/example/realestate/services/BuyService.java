package com.example.realestate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.realestate.model.Buy;
import com.example.realestate.repository.BuyRepository;

@Service
public class BuyService {
    private BuyRepository buyRepository;
    public BuyService(BuyRepository buyRepository)
    {
        this.buyRepository = buyRepository;
    }
    public boolean saveNewRecord(Buy buy)
    {
        try
        {
            buyRepository.save(buy);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Buy> getBuyDetails()
    {
        return buyRepository.findAll();
    }
    public boolean updateBuy(int id,Buy buy)
    {
        if(getBuyById(id)==null)
        {
            return false;
        }
        try{
            buyRepository.save(buy);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteBuy(int id)
    {
        if(getBuyById(id)==null)
        {
            return false;
        }
        buyRepository.deleteById(id);
        return true;
    }
    public Buy getBuyById(int id)
    {
        Optional<Buy> obj = buyRepository.findById(id);
        return obj.orElse(null);
    }
}
