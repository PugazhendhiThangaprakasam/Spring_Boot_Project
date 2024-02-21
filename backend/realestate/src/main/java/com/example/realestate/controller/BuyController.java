package com.example.realestate.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.realestate.model.Buy;
import com.example.realestate.services.BuyService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class BuyController {
    public BuyService buyService;
    public BuyController(BuyService buyService)
    {
        this.buyService = buyService;
    }
    @PostMapping("/buy")
    public ResponseEntity<Buy> postMethodName(@RequestBody Buy buy) {
        
        if(buyService.saveNewRecord(buy)==true)
        {
            return new ResponseEntity<>(buy,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/buydetails")
    public ResponseEntity<List<Buy>> getMethodName() {
        List<Buy> list =  buyService.getBuyDetails();
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
    @PutMapping("/buy/{id}")
    public ResponseEntity<Buy> putMethodName(@PathVariable int id, @RequestBody Buy buy) {
        if(buyService.updateBuy(id,buy) == true)
        {
            return new ResponseEntity<>(buy,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        
    }

    @DeleteMapping("/deletebuy/{id}")
    public ResponseEntity<Buy> delete(@PathVariable("id") int id)
    {
        if(buyService.deleteBuy(id)==true)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
