package com.debraj.springjenkins.repository;

import com.debraj.springjenkins.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
