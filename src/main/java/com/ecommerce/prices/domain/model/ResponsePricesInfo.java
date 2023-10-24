package com.ecommerce.prices.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class ResponsePricesInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productId;
    private Long brandId;
    private String priceList;
    private String systemDate;
    private Double finalPrice;
}
