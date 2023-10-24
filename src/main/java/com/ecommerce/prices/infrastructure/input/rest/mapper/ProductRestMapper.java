package com.ecommerce.prices.infrastructure.input.rest.mapper;

import com.ecommerce.prices.domain.model.ResponsePricesInfo;
import com.ecommerce.prices.infrastructure.adapters.input.rest.data.ResponsePricesInfoDto;
import org.mapstruct.Mapper;

/**
 * The interface Product rest mapper.
 */
@Mapper
public interface ProductRestMapper {

    /**
     * To response prices info response prices info.
     *
     * @param responsePricesInfoDto the response prices info dto
     * @return the response prices info
     */
    ResponsePricesInfo toResponsePricesInfo(ResponsePricesInfoDto responsePricesInfoDto);

    /**
     * To response prices info dto response prices info dto.
     *
     * @param responsePricesInfo the response prices info
     * @return the response prices info dto
     */
    ResponsePricesInfoDto toResponsePricesInfoDto(ResponsePricesInfo responsePricesInfo);
}
