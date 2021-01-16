package com.sda.coursemanager.controller;

import com.sda.coursemanager.mappers.CourseMapper;
import com.sda.coursemanager.model.Course;
import com.sda.coursemanager.dto.CourseDetailsDto;
import com.sda.coursemanager.dto.CourseDto;
import com.sda.coursemanager.repository.CourseRepository;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private CourseRepository repository;

    public CourseController(CourseRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/courses/")
    public List<CourseDto> getAllCourses() {
        return CourseMapper.mapCourseToDtoList(repository.findAll());
    }

    @GetMapping("/courses/{id}")
    public CourseDetailsDto getSingleCourse(@PathVariable long id) throws NotFoundException {
        Course course = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("course not found"));
        return CourseMapper.mapCourseToDetailsDto(course);
    }
}
