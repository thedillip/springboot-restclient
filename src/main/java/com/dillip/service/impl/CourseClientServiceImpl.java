package com.dillip.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.dillip.dto.CourseDTO;
import com.dillip.service.CourseClientService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseClientServiceImpl implements CourseClientService {

	@Value("${course.service.baseurl}")
	private String courseServiceBaseUrl;

	private final RestClient restClient;

	@Override
	public String findAllCourse() {
		return restClient.get().uri("{baseUrl}/course", courseServiceBaseUrl).accept(MediaType.APPLICATION_JSON)
				.retrieve().body(String.class);
	}

	@Override
	public CourseDTO findCourseById(String id) {
		return restClient.get().uri("/course/{id}", id).accept(MediaType.APPLICATION_JSON).retrieve()
				.body(CourseDTO.class);
	}

}
