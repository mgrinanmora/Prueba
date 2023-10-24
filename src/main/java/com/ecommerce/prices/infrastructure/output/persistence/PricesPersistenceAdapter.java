package com.ecommerce.prices.infrastructure.output.persistence;

import com.ecommerce.prices.application.output.PricesOutputPort;
import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.infrastructure.output.persistence.entity.PriceEntity;
import com.ecommerce.prices.infrastructure.output.persistence.mapper.PricePersistenceMapper;
import com.ecommerce.prices.infrastructure.output.persistence.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * The type Prices persistence adapter.
 */
@Component
@RequiredArgsConstructor
public class PricesPersistenceAdapter implements PricesOutputPort {

    private final PriceRepository priceRepository;
    private final PricePersistenceMapper pricePersistenceMapper;

    @Override
    public Price findPriceByDate(String systemDate, Long productId, Long brandId) {
        PriceEntity entity =  priceRepository.findHighestPriorityPrice(systemDate,productId,brandId);
        return pricePersistenceMapper.toPrice(entity);
    }
}
