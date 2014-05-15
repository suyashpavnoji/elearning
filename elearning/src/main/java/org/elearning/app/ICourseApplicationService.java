package org.elearning.app;

import org.elearning.dto.course.CourseDTO;
import org.elearning.repository.CourseRepository;

public interface ICourseApplicationService {

	public CourseDTO getCourseById(Long id) throws Exception;

	public int addCourse(CourseDTO courseDTO) throws Exception;

	public int removeCourse(Long courseId) throws Exception;

}
