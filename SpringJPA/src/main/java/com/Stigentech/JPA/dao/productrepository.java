package com.Stigentech.JPA.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Stigentech.JPA.model.Product;
@Repository
public interface productrepository  extends JpaRepository<Product, Serializable>{

}
