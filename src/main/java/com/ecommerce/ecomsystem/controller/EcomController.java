package com.ecommerce.ecomsystem.controller;

import com.ecommerce.ecomsystem.model.LoginData;
import com.ecommerce.ecomsystem.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login_data")
@CrossOrigin
public class EcomController {
    @Autowired
    private Service service;
    @PostMapping("/addCustomer")
    public void postDetails(@RequestBody LoginData customer)
    {
        service.saveDetails(customer);
    }
    @PostMapping("/login")
    public String request(@RequestBody LoginData loginData)
    {
        LoginData saved=service.findByMailId(loginData);
        System.out.println(saved.getPassword().equals(loginData.getPassword()));
        if(saved.getPassword().equals(loginData.getPassword()))
        {
            return "{\"status\":\"200\"}";
        }
        else {
            return "{\"status\":\"202\"}";
        }
    }
}
