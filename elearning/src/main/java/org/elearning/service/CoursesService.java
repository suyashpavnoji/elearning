package org.elearning.service;

import java.util.List;

import org.elearning.domain.course.Course;



public interface CoursesService {
	public Course create(Course Course);
	public Course delete(int id); 
	public List<Course> findAll();
	public Course update(Course Course); 
	public Course findById(int id);

}
