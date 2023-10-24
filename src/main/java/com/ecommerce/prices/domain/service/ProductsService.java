package com.ecommerce.prices.domain.service;

import com.ecommerce.prices.application.input.ProductsUseCase;
import com.ecommerce.prices.application.output.PricesOutputPort;
import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.domain.model.ResponsePricesInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * The type Products service.
 */
@Service
@AllArgsConstructor
@Slf4j
public class ProductsService implements ProductsUseCase {

    private PricesOutputPort pricesOutputPort;
    @Override
    public ResponsePricesInfo callToPricesInfo(String systemDate, Long productId, Long brandId) {
        log.info("Se procede a obtener la informaciond e la tabla PRICES");
        Price price = pricesOutputPort.findPriceByDate(systemDate,productId,brandId);
        return buildResponse(price,systemDate);
    }
    private ResponsePricesInfo buildResponse(Price price,String systemDate){
        log.info("Construyendo respuesta");
       return  ResponsePricesInfo.builder()
                .priceList(price.getPriceList())
                .finalPrice(price.getPrice())
                .brandId(price.getBrand().getId())
                .productId(price.getProductId())
                .systemDate(systemDate).build();
    }
}
