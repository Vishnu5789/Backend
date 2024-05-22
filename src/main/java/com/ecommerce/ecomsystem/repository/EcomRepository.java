package com.ecommerce.ecomsystem.repository;

import com.ecommerce.ecomsystem.model.LoginData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcomRepository extends JpaRepository<LoginData,Integer> {
    LoginData findByEmail(String email);
}
