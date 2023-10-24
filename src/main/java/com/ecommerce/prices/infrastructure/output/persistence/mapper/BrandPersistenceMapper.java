package com.ecommerce.prices.infrastructure.output.persistence.mapper;

import com.ecommerce.prices.domain.model.Brand;
import com.ecommerce.prices.infrastructure.output.persistence.entity.BrandEntity;
import org.mapstruct.Mapper;

/**
 * The interface Brand persistence mapper.
 */
@Mapper
public interface BrandPersistenceMapper {
    /**
     * To brand entity brand entity.
     *
     * @param brand the brand
     * @return the brand entity
     */
    BrandEntity toBrandEntity(Brand brand);

    /**
     * To brand brand.
     *
     * @param brandEntity the brand entity
     * @return the brand
     */
    Brand toBrand(BrandEntity brandEntity);
}
