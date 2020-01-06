package com.mycompany.classicmodels.domain.repository;

import com.mycompany.classicmodels.domain.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    String GET_BY_COSTUMER_NUMBER =
            "Select p from OrderDetails od " +
                    "Join od.id.product p " +
                    "Join od.id.order o " +
                    "Join o.customer c " +
                    "Where c.number = :number " +
                    "Order By o.orderDate desc";

    @Query(value = GET_BY_COSTUMER_NUMBER)
    List<Product> findByCustomerNumber(@Param("number") Long number);

}
