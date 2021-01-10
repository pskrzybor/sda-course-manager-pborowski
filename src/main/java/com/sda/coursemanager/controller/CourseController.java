package com.sda.coursemanager.controller;



import com.sda.coursemanager.model.Course;
import com.sda.coursemanager.repository.CourseRepository;
import com.sda.coursemanager.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    private final CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getCourses();

    }

    @GetMapping("/courses/{id}")
    public Course getSingleCourse(@PathVariable long id){
        return courseService.getSingleCourse(id);

    }

}
