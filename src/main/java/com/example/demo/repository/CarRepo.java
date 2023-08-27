package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Car;


public interface CarRepo extends JpaRepository<Car, Integer>{
   @Query(value="select * from Car where owners=:s",nativeQuery=true)
   public List<Car> getCarbyown(@Param("s") int owners);
   
  
   @Query(value="select * from Car where address=:add",nativeQuery=true)
   public List<Car> getCarbyAdd(@Param("add") String address);
   
   @Query(value="select * from Car where car_name =:name",nativeQuery=true)
   public List<Car> getCarbyName(@Param("name") String carName);
   
   @Query(value="select * from Car where owners=:own or car_type=:type",nativeQuery=true)
   public List<Car> getCarbyParam(@Param("own") int owners, @Param("type") String carType );
   
}
