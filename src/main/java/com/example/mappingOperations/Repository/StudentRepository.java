package com.example.mappingOperations.Repository;

import com.example.mappingOperations.entity.StudentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentData, Integer>
{

}
