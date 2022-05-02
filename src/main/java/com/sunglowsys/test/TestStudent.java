package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        Student student = (Student) context.getBean("student");
        Student student1 = context.getBean(Student.class);
        System.out.println(student);
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getEmail());
        System.out.println(student.getMobile());
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
