package com.mycompany.classicmodels.domain.repository;

import com.mycompany.classicmodels.domain.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    String GET_BY_PRODUCT_CODE =
            "Select o from OrderDetails od " +
                    "Join od.id.order o " +
                    "Join od.id.product p " +
                    "Where p.code = :code " +
                    "Order By o.orderDate desc";

    @Query(value = GET_BY_PRODUCT_CODE)
    List<Order> findByProductCode(@Param("code") String code);

}
