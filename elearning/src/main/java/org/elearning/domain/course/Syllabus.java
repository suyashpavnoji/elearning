package org.elearning.domain.course;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.elearning.domain.AbstractDomainObject;

/**
 * This will denote syllabus of the course content
 * 
 * @author suyash
 * 
 */
@Entity(name = "elearn_syllabus")
public class Syllabus extends AbstractDomainObject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "course_id")
	private Long courseId;
	@Column(name = "location")
	private String location;
	@Column(name = "is_document")
	private boolean isDocument;

	public Syllabus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Syllabus(Date creationDate, Date lastmodifiedDate, boolean isActive) {
		super(creationDate, lastmodifiedDate, isActive);
		// TODO Auto-generated constructor stub
	}

	public Syllabus(int id, String location, boolean isDocument) {
		super();
		this.id = id;
		this.location = location;
		this.isDocument = isDocument;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isDocument() {
		return isDocument;
	}

	public void setDocument(boolean isDocument) {
		this.isDocument = isDocument;
	}

}
