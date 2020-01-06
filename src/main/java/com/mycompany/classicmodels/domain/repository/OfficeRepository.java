package com.mycompany.classicmodels.domain.repository;

import com.mycompany.classicmodels.domain.model.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {

}
