package com.Stigentech.JPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Stigentech.JPA.dao.productrepository;
import com.Stigentech.JPA.model.Product;


@Service
public class ProductService {
	
	@Autowired
	public productrepository rep;
		
	
	public void saveproduct(Product  pro) {
		
		rep.save(pro);
	}
	
	public void update(Product  pro) {
		 
		rep.save(pro);
	}
	

	public void delete(int id) {
		  rep.deleteById(id);
		
	}

	
	public List<Product> findallproduct() {
		return rep.findAll();
		
	}
	
	public Optional<Product> findbyid(int id) {
		return rep.findById(id);
	}
	

	
	
	public List<Product> findbynamelike(String name) {
		return rep.findProductByNameLike(name);
	}
	
	public List<Product> findbypricebteween(double startrange,double endrange ) {
		return rep.findProductByPriceBetween(startrange, endrange);
	}
	
	public List<Product> findbypriceandname(String name,double price ) {
		return rep.findProductByNameAndPrice(name, price);
	}
	
	public List<Product> findbyname(String name ) {
		return rep.findProductByname(name);
	}
	
	
	
	public List<Product> findbydis(String description ) {
		return rep.findProductBydis(description);
	}
	
	
	public List<Product> findbypriceandname1(String name,double price ) {
		return rep.findProductBynameandpricenam(name, price);
	}
}
