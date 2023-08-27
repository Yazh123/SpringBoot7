package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class ApiService {
	@Autowired
    CarRepo cr;
	
    public List<Car> saveninfo(List<Car> ss) {
    	return (List<Car>)cr.saveAll(ss);
    }
     
    public List<Car> getowners(int o){
    	return cr.getCarbyown(o);
    }
    
    public List<Car> getadd (String add){
    	return cr.getCarbyAdd(add);
    }
    
    public List<Car> getname (String name){
    	return cr.getCarbyName(name);
    }
    
    public List<Car> gettype (int o, String type){
    	return cr.getCarbyParam(o,type);
    }
}
