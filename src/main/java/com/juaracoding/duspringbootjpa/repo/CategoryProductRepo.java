package com.juaracoding.duspringbootjpa.repo;/*
Created By IntelliJ IDEA 2022.3.2 (Community Edition)
Build #IC-223.8617.56, built on January 26, 2023
@Author user a.k.a. Deby Utari
Java Developer
Created on 14/02/2023 18.34
@Last Modified 14/02/2023 18.34
Version 1.0
*/
import com.juaracoding.duspringbootjpa.model.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface CategoryProductRepo extends JpaRepository<CategoryProduct,Long> {

//    List<CategoryProduct> findByNameCategoryProduct(String value);
}

