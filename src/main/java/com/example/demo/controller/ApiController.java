package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService cs;
	
	@PostMapping("/")
	public List<Car> addDet(@RequestBody List<Car> c)
	{
		return cs.saveninfo(c);
	}
	 
	 @GetMapping("/owner/{owners}")
	 public List<Car> getown(@PathVariable int owners)
	 {
		 return cs.getowners(owners);
	 }
	 @GetMapping("/address/{address}")
	 public List<Car> getAd(@PathVariable String address)
	 {
		 return cs.getadd(address);
	 }
	 @GetMapping("/carname/{carName}")
	 public List<Car> getcn(@PathVariable String carName)
	 {
		 return cs.getname(carName);
	 }
	 
	 @GetMapping("/owners/{owners}/cartype/{carType}")
	 public List<Car> getco(@PathVariable int owners,@PathVariable String carType)
	 {
		 return cs.gettype(owners, carType);
	 }
}
