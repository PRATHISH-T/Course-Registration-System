package com.example.Course.Registration.System.Repository;

import com.example.Course.Registration.System.Model.CourseRegistartion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegisterRepository extends JpaRepository<CourseRegistartion,Integer> {

}
