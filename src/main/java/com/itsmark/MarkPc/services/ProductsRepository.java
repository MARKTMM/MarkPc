package com.itsmark.MarkPc.services;

import com.itsmark.MarkPc.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
