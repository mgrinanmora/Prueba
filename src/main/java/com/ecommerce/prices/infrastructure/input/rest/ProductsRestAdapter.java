package com.ecommerce.prices.infrastructure.input.rest;

import com.ecommerce.prices.application.input.ProductsUseCase;
import com.ecommerce.prices.domain.model.ResponsePricesInfo;
import com.ecommerce.prices.infrastructure.adapters.input.rest.PricesApi;
import com.ecommerce.prices.infrastructure.adapters.input.rest.data.ResponsePricesInfoDto;
import com.ecommerce.prices.infrastructure.input.rest.mapper.ProductRestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class ProductsRestAdapter implements PricesApi {

    private final ProductsUseCase productsUseCase;
    private final ProductRestMapper productRestMapper;

    @Override
    public ResponseEntity<ResponsePricesInfoDto> _pricesInfo(String systemDate, Long productId, Long brandId) {
        ResponsePricesInfo response = productsUseCase.callToPricesInfo(systemDate,productId,brandId);
        return ResponseEntity.ok().body(productRestMapper.toResponsePricesInfoDto(response));
    }
}
