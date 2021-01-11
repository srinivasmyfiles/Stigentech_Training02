package com.Stigentech.JPA;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Stigentech.JPA.model.Product;
import com.Stigentech.JPA.service.ProductService;


@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac=	SpringApplication.run(SpringJpaApplication.class, args);
		
		
		ProductService  dao = ac.getBean(ProductService .class);
		
		
	Product prod=new Product();
		prod.setId(23);
		prod.setName("apple laptop");
		prod.setPrice(95000);
		prod.setDescription("vvvvgood");
	//	dao.saveproduct(prod);
		//dao.save(prod);
	  dao.update(prod);
		//dao.delete(20);
	//   dao.delete(20);
	  // read
		Optional<Product>pro=dao.findbyid(20);
		Product prod1=pro.get();
		 System.out.println(prod1.getId());
	  System.out.println(prod1.getName());
	  System.out.println(prod1.getPrice());
	  System.out.println(prod1.getDescription());
	  System.out.println("-----------------------------");
		
		
		
//	  for (Product prod1 : dao.findallproduct()) {
//		  System.out.println(prod1.getId());
//		  System.out.println(prod1.getName());
//		  System.out.println(prod1.getPrice());
//		  System.out.println(prod1.getDescription());
//		  System.out.println("-----------------------------");
//		  
//	}
	}
}
