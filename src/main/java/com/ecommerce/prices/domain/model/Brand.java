package com.ecommerce.prices.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String brandName;
}
