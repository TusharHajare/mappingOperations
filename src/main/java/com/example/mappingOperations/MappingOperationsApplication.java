package com.example.mappingOperations;

import com.example.mappingOperations.Repository.AddressRepository;
import com.example.mappingOperations.Repository.AddressRepository;
import com.example.mappingOperations.Repository.StudentRepository;
import com.example.mappingOperations.entity.Address;
import com.example.mappingOperations.entity.StudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingOperationsApplication //implements CommandLineRunner
{

	public static void main(String[] args)
	{
		SpringApplication.run(MappingOperationsApplication.class, args);
		System.out.println("gm Tushar****");
	}


//	StudentData.get
//	@Autowired
//	StudentRepository studentRepository;
//	@Autowired
//	AddressRepository addressRepository;
//
//	@Override
//	public void run(String... args) throws Exception
//	{
//		StudentData student=new StudentData();
//		student.setRollnum(1);
//		student.setName("Tushar Hajare");
//		studentRepository.save(student);
////
////		StudentData student1=new StudentData(2,"Vijay Hajare");
////		studentRepository.save(student1);
//
//
//		Address address=new Address(1,"Jawala",student);
//		addressRepository.save(address);
//
//		Address address1=new Address(2,"Jamkhed",student);
//		addressRepository.save(address1);
//
//		Address address2=new Address(3,"Ahmednagar",student);
//		addressRepository.save(address2);
//
//		Address address3=new Address(4,"Baramati",student);
//		addressRepository.save(address3);
//
//		Address address4=new Address(5,"pune",student);
//		addressRepository.save(address4);
//	}
}
