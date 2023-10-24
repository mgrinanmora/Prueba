package com.ecommerce.prices.application.input;

import com.ecommerce.prices.domain.model.ResponsePricesInfo;

import java.time.LocalDate;

/**
 * The interface Products use case.
 */
public interface ProductsUseCase {
    /**
     * Call to prices info response prices info.
     *
     * @param systemDate the system date
     * @param productId  the product id
     * @param brandId    the brand id
     * @return the response prices info
     */
    ResponsePricesInfo callToPricesInfo(String systemDate, Long productId, Long brandId);
}
