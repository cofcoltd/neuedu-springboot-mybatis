package com.entity;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class Product {

    private Integer pid;

    private String pname;
    private BigDecimal price;
    private String description;
    private String imgs;

}
