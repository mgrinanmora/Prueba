package com.ecommerce.prices.domain;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


import com.ecommerce.prices.application.output.PricesOutputPort;
import com.ecommerce.prices.domain.model.Brand;
import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.domain.service.ProductsService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class ProductsServiceTest {

    @InjectMocks
    private ProductsService productsService;
    @Mock
    private PricesOutputPort priceOutputPort;

    @Test
    void callToPricesInfoTest1() {
        Brand brand = Brand.builder().id(1L).brandName("CADENA1").build();
        String date = "2020-06-14-10.00.00";
        Price price = Price.builder()
                .startDate("2020-06-14-00.00.00")
                .endDate("2020-12-31-00.00.00")
                .productId(1L)
                .brand(brand)
                .price(30.0)
                .priceList("1")
                .curr("EUR")
                .priority(1).build();
        when(priceOutputPort.findPriceByDate(date,1L,1L)).thenReturn(price);
        var response = productsService.callToPricesInfo(date,1l,1l);
        assertEquals(response.getFinalPrice(),price.getPrice());

    }

    @Test
    void callToPricesInfoTest2() {
        Brand brand = Brand.builder().id(1L).brandName("CADENA1").build();
        String date = "2020-06-14-16.00.00";
        Price price = Price.builder()
                .startDate("2020-06-14-00.00.00")
                .endDate("2020-12-31-00.00.00")
                .productId(1L)
                .brand(brand)
                .price(30.0)
                .priceList("1")
                .curr("EUR")
                .priority(1).build();
        when(priceOutputPort.findPriceByDate(date,1L,1L)).thenReturn(price);
        var response = productsService.callToPricesInfo(date,1l,1l);
        assertEquals(response.getFinalPrice(),price.getPrice());

    }

    @Test
    void callToPricesInfoTest3() {
        Brand brand = Brand.builder().id(1L).brandName("CADENA1").build();
        String date = "2020-06-14-21.00.00";
        Price price = Price.builder()
                .startDate("2020-06-14-00.00.00")
                .endDate("2020-12-31-00.00.00")
                .productId(1L)
                .brand(brand)
                .price(30.0)
                .priceList("1")
                .curr("EUR")
                .priority(1).build();
        when(priceOutputPort.findPriceByDate(date,1L,1L)).thenReturn(price);
        var response = productsService.callToPricesInfo(date,1l,1l);
        assertEquals(response.getFinalPrice(),price.getPrice());
    }

    @Test
    void callToPricesInfoTest4() {
        Brand brand = Brand.builder().id(1L).brandName("CADENA1").build();
        String date = "2020-06-15-10.00.00";
        Price price = Price.builder()
                .startDate("2020-06-14-00.00.00")
                .endDate("2020-12-31-00.00.00")
                .productId(1L)
                .brand(brand)
                .price(30.0)
                .priceList("1")
                .curr("EUR")
                .priority(1).build();
        when(priceOutputPort.findPriceByDate(date,1L,1L)).thenReturn(price);
        var response = productsService.callToPricesInfo(date,1l,1l);
        assertEquals(response.getFinalPrice(),price.getPrice());
    }
    @Test
    void callToPricesInfoTest5() {
        Brand brand = Brand.builder().id(1L).brandName("CADENA1").build();
        String date = "2020-06-16-21.00.00";
        Price price = Price.builder()
                .startDate("2020-06-14-00.00.00")
                .endDate("2020-12-31-00.00.00")
                .productId(1L)
                .brand(brand)
                .price(30.0)
                .priceList("1")
                .curr("EUR")
                .priority(1).build();
        when(priceOutputPort.findPriceByDate(date,1L,1L)).thenReturn(price);
        var response = productsService.callToPricesInfo(date,1l,1l);
        assertEquals(response.getFinalPrice(),price.getPrice());
    }

}
