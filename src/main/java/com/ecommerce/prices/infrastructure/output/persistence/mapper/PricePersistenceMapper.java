package com.ecommerce.prices.infrastructure.output.persistence.mapper;

import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.infrastructure.output.persistence.entity.PriceEntity;
import org.mapstruct.Mapper;

/**
 * The interface Price persistence mapper.
 */
@Mapper(uses = {BrandPersistenceMapper.class})
public interface PricePersistenceMapper {
    /**
     * To price entity price entity.
     *
     * @param price the price
     * @return the price entity
     */
    PriceEntity toPriceEntity(Price price);

    /**
     * To price price.
     *
     * @param priceEntity the price entity
     * @return the price
     */
    Price toPrice(PriceEntity priceEntity);
}
