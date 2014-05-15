package org.elearning.dto.course;

import java.util.Date;

import org.elearning.domain.AbstractDomainObject;
import org.elearning.dto.AbstractDTO;

/**
 * This will denote syllabus of the course content
 * 
 * @author suyash
 * 
 */
public class SyllabusDTO extends AbstractDTO {

	private int id;

	private String location;

	private boolean isDocument;

	public SyllabusDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SyllabusDTO(Date creationDate, Date lastmodifiedDate, boolean isActive) {
		super(creationDate, lastmodifiedDate, isActive);
		// TODO Auto-generated constructor stub
	}

	public SyllabusDTO(int id, String location, boolean isDocument) {
		super();
		this.id = id;
		this.location = location;
		this.isDocument = isDocument;
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
