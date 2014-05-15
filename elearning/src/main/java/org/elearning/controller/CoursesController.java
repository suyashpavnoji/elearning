package org.elearning.controller;

import java.util.List;

import org.elearning.domain.course.Course;
import org.elearning.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/courses")
public class CoursesController {

	@Autowired
	CoursesService coursesService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView shopCoursesPage() {
		ModelAndView mav = new ModelAndView("shop-list");
		List<Course> courseList = coursesService.findAll();
		mav.addObject("courseList", courseList);
		return mav;
	}

}
