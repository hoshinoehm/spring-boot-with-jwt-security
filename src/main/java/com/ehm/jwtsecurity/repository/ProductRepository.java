package com.ehm.jwtsecurity.repository;

import com.ehm.jwtsecurity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
