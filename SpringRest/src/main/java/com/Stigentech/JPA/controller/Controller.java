package com.Stigentech.JPA.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Stigentech.JPA.model.Product;
import com.Stigentech.JPA.service.ProductService;

@RestController
public class Controller {
	@Autowired
	private ProductService  ser;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
	
	@PostMapping("/save")
	public void save(@RequestBody Product p) {
	
		ser.saveproduct(p);
		
	}
	@GetMapping("/findall")
	public List<Product> findall() {
	
		LOGGER.info("get all  info quesnaires working");
		LOGGER.error("get all  error quesnaires working");
		LOGGER.warn("get all  warn quesnaires working");

		return ser.findallproduct();
	}
	
	@GetMapping("findbyid/{id}")
	public Optional<Product> findbyid(@PathVariable("id") int id) {
		return ser.findbyid(id);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Product p) {
	
		ser.saveproduct(p);
		
	}
	 @RequestMapping(value="/deletebyid/{id}",method = RequestMethod.DELETE)
	//@DeleteMapping("/deletebyid/{id}")
 public ResponseEntity<String> delete(@PathVariable("id") int id) throws Exception{
		 ser.delete(id);
		 return new ResponseEntity<>("deleted", HttpStatus.OK);
		
	}
	
	
	
}
