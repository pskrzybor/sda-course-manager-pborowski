package com.sda.coursemanager.dto;

public class LessonBlockUpdateForm {
    private String subject;
    private long teacherId;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }
}
