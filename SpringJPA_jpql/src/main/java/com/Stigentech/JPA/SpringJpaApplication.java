package com.Stigentech.JPA;

import java.util.List;
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
		
		prod.setName("hp laptop");
		prod.setPrice(5000);
		prod.setDescription("vvvvgood");
	//	dao.saveproduct(prod);
		//dao.save(prod);
	//  dao.update(prod);
		//dao.delete(20);
	//   dao.delete(20);
	  // read
//		Optional<Product>pro=dao.findbyid(20);
//		Product prod1=pro.get();
//		 System.out.println(prod1.getId());
//	  System.out.println(prod1.getName());
//	  System.out.println(prod1.getPrice());
//	  System.out.println(prod1.getDescription());
//	  System.out.println("-----------------------------");
		
		
//		List<Product> prod1= dao.findbynamelike("%a%");
	//  List<Product>prod1=dao.findbypricebteween(4000, 100000);
	  List<Product>prod1=dao.findbypriceandname1("hp laptop", 5000);
	//	List<Product> prod1= dao.findbyname("apple laptop");
	//	List<Product> prod1= dao.findbydis("vvvvgood");
		
  for (Product prod11 : prod1) {
		  System.out.println(prod11.getId());
		  System.out.println(prod11.getName());
		  System.out.println(prod11.getPrice());
		  System.out.println(prod11.getDescription());
		  System.out.println("-----------------------------");
		  
	}
	}
}
