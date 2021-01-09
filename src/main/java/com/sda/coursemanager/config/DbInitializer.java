package com.sda.coursemanager.config;
import com.sda.coursemanager.LessonRepository;
import com.sda.coursemanager.model.Lesson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DbInitializer implements CommandLineRunner {
    private LessonRepository lessonRepository;

    public DbInitializer(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       initLessons();
    }

    private void initLessons() {
        if (lessonRepository.count() == 0) {
            Lesson lesson_db = new Lesson();
            Lesson lesson_tests = new Lesson();
            lesson_db.setSubject("Databases");
            lesson_db.setDate(LocalDate.now().minusDays(24));

            lesson_tests.setSubject("Testing in java");
            lesson_tests.setDate(LocalDate.now().minusDays(16));

            lessonRepository.save(lesson_db);
            lessonRepository.save(lesson_tests);
        }
    }
}
