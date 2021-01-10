package com.sda.coursemanager.service;

import com.sda.coursemanager.model.Course;
import com.sda.coursemanager.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses(){
        return courseRepository.findAll();

    }

    public Course getSingleCourse(long id) {
        return courseRepository.findById(id)
                .orElseThrow();
    }
}
