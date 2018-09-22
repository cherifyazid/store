package com.ecom.back.repositories;

import com.ecom.back.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

     Product getProductByCode(String code);
}
