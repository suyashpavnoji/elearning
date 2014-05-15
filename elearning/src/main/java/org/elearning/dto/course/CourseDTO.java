package org.elearning.dto.course;

import java.util.Date;

import org.elearning.domain.AbstractDomainObject;
import org.elearning.domain.course.tutorial.Tutorial;
import org.elearning.dto.AbstractDTO;

public class CourseDTO extends AbstractDTO{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5541710605863584231L;

	private Long id;
	
	private String description;
	
	private SyllabusDTO syllabus;
	
	private Tutorial[] tutorials;
	
	private int noOfTutorials;

	public CourseDTO() {
		super();
		
	}

	public CourseDTO(Date creationDate, Date lastmodifiedDate, boolean isActive) {
		super(creationDate, lastmodifiedDate, isActive);
		// TODO Auto-generated constructor stub
	}

	public CourseDTO(Long id, String description, SyllabusDTO syllabus,
			Tutorial[] tutorials, int noOfTutorials) {
		super();
		this.id = id;
		this.description = description;
		this.syllabus = syllabus;
		this.tutorials = tutorials;
		this.noOfTutorials = noOfTutorials;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SyllabusDTO getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(SyllabusDTO syllabus) {
		this.syllabus = syllabus;
	}

	public Tutorial[] getTutorials() {
		return tutorials;
	}

	public void setTutorials(Tutorial[] tutorials) {
		this.tutorials = tutorials;
	}

	public int getNoOfTutorials() {
		return noOfTutorials;
	}

	public void setNoOfTutorials(int noOfTutorials) {
		this.noOfTutorials = noOfTutorials;
	}
	

}
