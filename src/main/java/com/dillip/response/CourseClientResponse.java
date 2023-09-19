package com.dillip.response;

import java.time.LocalDateTime;
import java.util.List;

import com.dillip.dto.CourseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseClientResponse {
	private LocalDateTime timestamp;
	private String message;
	private List<CourseDTO> data;
}
