package com.mycompany.classicmodels.domain.repository;

import com.mycompany.classicmodels.domain.model.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {

}
