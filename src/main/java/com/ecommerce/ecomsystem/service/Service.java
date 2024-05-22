package com.ecommerce.ecomsystem.service;

import com.ecommerce.ecomsystem.model.LoginData;
import com.ecommerce.ecomsystem.repository.EcomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service{
    @Autowired
    private EcomRepository ecomRepo;
    public void saveDetails(LoginData loginData)
    {
        ecomRepo.save(loginData);
    }
    public LoginData findByMailId(LoginData loginData)
    {
        System.out.println(loginData.getEmail());
        return ecomRepo.findByEmail(loginData.getEmail());
    }
}
