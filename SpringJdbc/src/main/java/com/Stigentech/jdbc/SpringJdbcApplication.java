package com.Stigentech.jdbc;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Stigentech.jdbc.dao.Productrepositoryimpl;
import com.Stigentech.jdbc.model.Product;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext ac	=SpringApplication.run(SpringJdbcApplication.class, args);
	Productrepositoryimpl dao = ac.getBean(Productrepositoryimpl.class);
	
	
	Product prod=new Product();
	prod.setId(21);
	prod.setName("lenovo laptop");
	prod.setPrice(85000);
	prod.setDiscription("vgood");
	
	//dao.save(prod);
  // dao.update(prod);
	//dao.delete(20);
   
  // read
  for (Product prod1 : dao.findall()) {
	  System.out.println(prod1.getId());
	  System.out.println(prod1.getName());
	  System.out.println(prod1.getPrice());
	  System.out.println(prod1.getDiscription());
	  System.out.println("-----------------------------");
	  
	
}
	
   
	}

}
