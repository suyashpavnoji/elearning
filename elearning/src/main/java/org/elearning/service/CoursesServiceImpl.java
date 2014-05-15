package org.elearning.service;

import java.util.List;

import javax.annotation.Resource;

import org.elearning.domain.course.Course;
import org.elearning.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CoursesServiceImpl implements CoursesService{

	@Resource
	CourseRepository courseRepository;

	@Transactional(rollbackFor = Exception.class)
	public Course create(Course course) {
		Course createdCourse = courseRepository.save(course);
		return createdCourse;
	}

	@Transactional(rollbackFor = Exception.class)
	public Course delete(int id) {
		Course deletedCourse = courseRepository.findOne((long) id);
		if (deletedCourse != null) {
			courseRepository.delete(deletedCourse);
		}
		return deletedCourse;
	}
	@Transactional
	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	@Transactional(rollbackFor = Exception.class)
	public Course update(Course course) {
		Course updatedCourse = courseRepository.save(course);
		return updatedCourse;
	}
	@Transactional
	public Course findById(int id) {
		Course updatedCourse = courseRepository.findOne((long) id);
		return updatedCourse;
	}

}
