package com.ecommerce.prices.infrastructure.output.persistence.repository;

import com.ecommerce.prices.infrastructure.output.persistence.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

/**
 * The interface Price repository.
 */
@Repository
public interface PriceRepository extends JpaRepository<PriceEntity,Long> {


    @Query("SELECT p FROM PriceEntity p " +
            "WHERE :systemDate >= p.startDate AND :systemDate <= p.endDate " +
            "AND p.productId = :productId " +
            "AND p.brand.id = :brandId " +
            "AND p.priority = (SELECT MAX(p2.priority) FROM PriceEntity p2 " +
            "WHERE :systemDate >= p2.startDate AND :systemDate <= p2.endDate " +
            "AND p2.productId = :productId " +
            "AND p2.brand.id = :brandId)")
    PriceEntity findHighestPriorityPrice( @Param("systemDate") String systemDate,
                                          @Param("productId") Long productId,
                                          @Param("brandId") Long brandId);
}
