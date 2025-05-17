package com.example.Course.Registration.System.Controller;


import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistartion;
import com.example.Course.Registration.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CourseConroller {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("courses/entrolled")
    public List<CourseRegistartion> entrolledStudents(){
        return courseService.entrolledStudents();
    }

    @PostMapping("courses/entrolled")
    public void entrollCourse(@RequestParam("name") String name,@RequestParam("emailId") String emailId,
                                @RequestParam("courseName") String courseName){
         courseService.entrollCourse(name,emailId,courseName);
    }

}
