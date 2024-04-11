package com.example.mappingOperations.dao;

import com.example.mappingOperations.entity.StudentData;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class RequestOrder
{
    public StudentData studentData;
}
