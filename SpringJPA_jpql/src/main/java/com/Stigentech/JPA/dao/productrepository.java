package com.Stigentech.JPA.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Stigentech.JPA.model.Product;
@Repository
public interface productrepository  extends JpaRepository<Product, Serializable>{
//named query
	List<Product>findProductByNameLike(String name);
	
	List<Product>findProductByPriceBetween(double startrange,double endrange);
	
	List<Product>findProductByNameAndPrice(String name,double price);
	
//	jpql
	@Query("select p from Product p where p.name=?1")
	List<Product>findProductByname(String name);
	
	@Query("select p from Product p where p.description=:description")
	List<Product>findProductBydis(@Param("description")String description);
	
	@Query("select p from Product p where p.name=?1 AND p.price=?2")
	List<Product>findProductBynameandprice(String name,double price);
	
	@Query("select p from Product p where p.name=:name AND p.price=:price")
	List<Product>findProductBynameandpricenam(@Param("name")String name,@Param("price")double price);
	//native sql
	@Query(value="select* from product" ,nativeQuery=true)
	List<Product>findall();
	
	
}
