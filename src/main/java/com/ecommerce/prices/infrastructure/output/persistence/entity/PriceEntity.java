package com.ecommerce.prices.infrastructure.output.persistence.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="PRICES")
@Getter
@Setter
public class PriceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "BRAND_ID")
    private BrandEntity brand;

    @Column( name = "START_DATE")
    private String startDate;

    @Column( name = "END_DATE")
    private String endDate;

    @Column( name = "PRICE_LIST")
    private String priceList;

    @Column( name = "PRODUCT_ID")
    private Long productId;

    @Column( name = "PRICE")
    private Double price;

    @Column( name = "PRIORITY")
    private Integer priority;

    @Column( name = "CURR")
    private String curr;

}
