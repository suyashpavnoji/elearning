package org.elearning.app;

import javax.annotation.Resource;

import org.elearning.assembler.CourseAssembler;
import org.elearning.domain.course.Course;
import org.elearning.dto.course.CourseDTO;
import org.elearning.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseApplicationService extends AbstractApplicationService
		implements ICourseApplicationService {

	@Resource
	CourseRepository courseRepository;

	@Transactional(readOnly = true)
	@Override
	public CourseDTO getCourseById(Long id) {
		Course course = null;
		course = courseRepository.findOne(id);
		return new CourseAssembler().fromDomainObject(course);

	}

	@Transactional(readOnly = true)
	public CourseDTO getAllCoursesByDiscpline(Long disciplineId) {
		Course course = null;
		// course=courseRepository.findAll((disciplineId);
		return new CourseAssembler().fromDomainObject(course);

	}

	@Override
	public int addCourse(CourseDTO courseDTO) throws Exception {
		Course course = new CourseAssembler().toDomainObject(courseDTO);
		courseRepository.saveAndFlush(course);
		return 0;
	}

	@Override
	public int removeCourse(Long courseId) throws Exception {
		courseRepository.delete(courseId);
		return 0;
	}

}
