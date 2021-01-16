package com.sda.coursemanager.dto;

import com.sda.coursemanager.model.LessonBlock;
import com.sda.coursemanager.dto.LessonBlockDetailsDto;

import java.util.List;

public class CourseDetailsDto {
    private long id;
    private String name;
    private List<LessonBlockDetailsDto> lessonBlocks;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LessonBlockDetailsDto> getLessonBlocks() {
        return lessonBlocks;
    }

    public void setLessonBlocks(List<LessonBlockDetailsDto> lessonBlocks) {
        this.lessonBlocks = lessonBlocks;
    }
}
