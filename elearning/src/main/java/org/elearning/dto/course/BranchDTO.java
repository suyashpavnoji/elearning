package org.elearning.dto.course;

import java.util.Date;

import org.elearning.domain.AbstractDomainObject;

public class BranchDTO extends AbstractDomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9091747286660921445L;

	private String id;

	private String description;

	private CourseDTO[] courses;

	private int noOfCOurses;

	public BranchDTO(String id, String description, CourseDTO[] courses,
			int noOfCOurses) {
		super();
		this.id = id;
		this.description = description;
		this.courses = courses;
		this.noOfCOurses = noOfCOurses;
	}

	public BranchDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BranchDTO(Date creationDate, Date lastmodifiedDate, boolean isActive) {
		super(creationDate, lastmodifiedDate, isActive);
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CourseDTO[] getCourses() {
		return courses;
	}

	public void setCourses(CourseDTO[] courses) {
		this.courses = courses;
	}

	public int getNoOfCOurses() {
		return noOfCOurses;
	}

	public void setNoOfCOurses(int noOfCOurses) {
		this.noOfCOurses = noOfCOurses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
