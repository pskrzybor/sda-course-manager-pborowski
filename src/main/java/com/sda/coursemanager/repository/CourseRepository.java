package com.sda.coursemanager.repository;

import com.sda.coursemanager.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
