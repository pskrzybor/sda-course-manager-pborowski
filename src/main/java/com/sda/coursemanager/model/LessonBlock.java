package com.sda.coursemanager.model;

import javax.persistence.*;

import java.util.List;

@Entity
public class LessonBlock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private String Subject;

 @OneToMany

    List<Lesson> lessons;

 @ManyToOne
    User teacher;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }
}
