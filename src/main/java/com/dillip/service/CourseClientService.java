package com.dillip.service;

import java.util.List;

import com.dillip.dto.CourseDTO;

public interface CourseClientService {
	String findAllCourse();

	CourseDTO findCourseById(String id);
}
