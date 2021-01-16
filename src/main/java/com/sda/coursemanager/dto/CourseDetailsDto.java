package com.sda.coursemanager.dto;
import com.sda.coursemanager.model.LessonBlock;

import java.util.List;

public class CourseDetailsDto {
    private long id;
    private String name;
    private List<LessonBlock> lessonBlocks;

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

    public List<LessonBlock> getLessonBlocks() {
        return lessonBlocks;
    }

    public void setLessonBlocks(List<LessonBlock> lessonBlocks) {
        this.lessonBlocks = lessonBlocks;
    }
}
