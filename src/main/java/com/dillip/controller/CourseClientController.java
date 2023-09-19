package com.dillip.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dillip.dto.CourseDTO;
import com.dillip.service.CourseClientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/course-client")
@RequiredArgsConstructor
public class CourseClientController {
	private final CourseClientService courseClientService;

//	http://localhost:8080/course-client/course
	@GetMapping(value = "/course", produces = "application/json")
	public String findAllCourse() {
		return this.courseClientService.findAllCourse();
	}
}
