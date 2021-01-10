package com.sda.coursemanager.repository;

import com.sda.coursemanager.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
