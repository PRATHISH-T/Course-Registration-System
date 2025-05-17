package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistartion;
import com.example.Course.Registration.System.Repository.CourseRegisterRepository;
import com.example.Course.Registration.System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    // for course
    @Autowired
    CourseRepository courseRepository;

    // course Registration
    @Autowired
    CourseRegisterRepository courseRegisterRepository;

    // to get all the course
    public List<Course> availableCourses() {
       return courseRepository.findAll();
    }

    public List<CourseRegistartion> entrolledStudents(){
        return courseRegisterRepository.findAll();
    }

    public String entrollCourse(String name, String emailId, String courseName) {
        CourseRegistartion courseRegistartion = new CourseRegistartion(name,emailId,courseName);
        courseRegisterRepository.save(courseRegistartion);
        return "Added succesfully";
    }
}
