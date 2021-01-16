package com.sda.coursemanager.dto;

public class CourseDto {
    private long id;
    private String name;
    private int courseLength;



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

    public int getCourseLength() {
        return courseLength;
    }

    public void setCourseLength(int courseLength) {
        this.courseLength = courseLength;
    }


}
