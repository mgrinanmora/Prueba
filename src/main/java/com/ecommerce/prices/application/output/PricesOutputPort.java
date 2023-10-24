package com.ecommerce.prices.application.output;

import com.ecommerce.prices.domain.model.Price;

import java.time.LocalDate;

/**
 * The interface Prices output port.
 */
public interface PricesOutputPort {

    /**
     * Find price by date price.
     *
     * @param systemDate the system date
     * @param productId  the product id
     * @param brandId    the brand id
     * @return the price
     */
    Price findPriceByDate(String systemDate, Long productId,Long brandId);
}
