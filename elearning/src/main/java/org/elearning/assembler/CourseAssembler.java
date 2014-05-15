package org.elearning.assembler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.elearning.domain.course.Course;
import org.elearning.domain.course.tutorial.Tutorial;
import org.elearning.dto.course.CourseDTO;

public class CourseAssembler extends AbstractAssembler<CourseDTO, Course> {

	@Override
	public CourseDTO fromDomainObject(Course domainObject) {
		CourseDTO courseDTO = new CourseDTO();
		courseDTO.setActive(domainObject.isActive());
		courseDTO.setId(domainObject.getId());
		courseDTO.setCreationDate(domainObject.getCreationDate());
		courseDTO.setDescription(domainObject.getDescription());
		courseDTO.setLastmodifiedDate(domainObject.getLastmodifiedDate());
		courseDTO.setNoOfTutorials(courseDTO.getNoOfTutorials());
		courseDTO.setSyllabus(new SyllabusAssembler()
				.fromDomainObject(domainObject.getSyllabus()));
		courseDTO.setTutorials(domainObject.getTutorials().toArray(
				new Tutorial[domainObject.getTutorials().size()]));
		return courseDTO;

	}

	@Override
	public Course toDomainObject(CourseDTO courseDTO) {
		Course course = new Course();
		course.setActive(courseDTO.isActive());
		course.setId(courseDTO.getId());
		course.setCreationDate(courseDTO.getCreationDate());
		course.setDescription(courseDTO.getDescription());
		course.setLastmodifiedDate(courseDTO.getLastmodifiedDate());
		course.setNoOfTutorials(course.getNoOfTutorials());
		course.setSyllabus(new SyllabusAssembler().toDomainObject(courseDTO
				.getSyllabus()));
		Set<Tutorial> tutorials = new HashSet<Tutorial>();
		Collections.addAll(tutorials, courseDTO.getTutorials());
		course.setTutorials(tutorials);

		return course;
	}

}
