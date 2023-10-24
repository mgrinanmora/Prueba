package com.ecommerce.prices.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Price implements Serializable {

    private static final long serialVersionUID = 1L;

    private Brand brand;
    private String startDate;
    private String endDate;
    private String priceList;
    private Long productId;
    private Double price;
    private Integer priority;
    private String curr;

}
