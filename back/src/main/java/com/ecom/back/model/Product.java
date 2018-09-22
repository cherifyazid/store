package com.ecom.back.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Product",schema = "public")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String code;
    String name;
}
