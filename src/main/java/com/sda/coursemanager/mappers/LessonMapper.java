package com.sda.coursemanager.mappers;

import com.sda.coursemanager.model.LessonBlock;
import com.sda.coursemanager.dto.LessonBlockDetailsDto;
import com.sda.coursemanager.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LessonMapper {

    public static List<LessonBlockDetailsDto> mapLoessonBlockToDtoList(List<LessonBlock> blocks) {
        return blocks.stream()
                .map(LessonMapper::mapLessonBlockToDto)
                .collect(Collectors.toList());
    }

    public static LessonBlockDetailsDto mapLessonBlockToDto(LessonBlock lessonBlock) {
        LessonBlockDetailsDto lessonBlockDetailsDto = new LessonBlockDetailsDto();
        lessonBlockDetailsDto.setId(lessonBlock.getId());
        lessonBlockDetailsDto.setSubject(lessonBlock.getSubject());
        lessonBlockDetailsDto.setLessons(new ArrayList<>(lessonBlock.getLessons()));
        lessonBlockDetailsDto.setTeacherId(getTeacherId(lessonBlock));
        lessonBlockDetailsDto.setTeacherName(getTeacherName(lessonBlock));

        return lessonBlockDetailsDto;
    }

    private static long getTeacherId(LessonBlock block) {
        return Optional.ofNullable(block)
                .map(LessonBlock::getTeacher)
                .map(User::getId)
                .orElse(0L);
    }

    private static String getTeacherName(LessonBlock block) {
        return Optional.ofNullable(block)
                .map(LessonBlock::getTeacher)
                .map(u -> String.format("%s %s", u.getFirstName(), u.getLastName()))
                .orElse("");
    }
}
