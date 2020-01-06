package com.mycompany.classicmodels.domain.repository;

import com.mycompany.classicmodels.domain.model.entity.ProductLines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLinesRepository extends JpaRepository<ProductLines, Long> {

}
