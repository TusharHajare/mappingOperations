package com.example.mappingOperations.Controller;

import com.example.mappingOperations.Repository.AddressRepository;
import com.example.mappingOperations.Repository.StudentRepository;
import com.example.mappingOperations.dao.RequestOrder;
import com.example.mappingOperations.entity.StudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController
{
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/AddData")
    private StudentData AddData(@RequestBody RequestOrder request)
    {
        return studentRepository.save(request.getStudentData());
    }

    @GetMapping("/findAllData")
    private List<StudentData> findAllData()
    {
        return studentRepository.findAll();
    }
}
