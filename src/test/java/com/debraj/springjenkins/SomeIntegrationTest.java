package com.debraj.springjenkins;

import com.debraj.springjenkins.domain.Student;
import com.debraj.springjenkins.repository.StudentRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringJenkinsApplication.class,TestMongoConfig.class})
public class SomeIntegrationTest {
    @Autowired
    private StudentRepository studentRepository;
    @Before
    public void setup(){
        Student student = new Student("paul", "smith","1234567890","debraj.m@gmail.com");
        studentRepository.save(student);
    }
    @Test
    public void whenInserting_andCount_thenWeDontGetZero(){

        long count = studentRepository.count();
        Assert.assertNotEquals(0,count);
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void clean(){

        studentRepository.deleteAll();
    }

}
