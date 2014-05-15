package org.elearning.domain.course.tutorial;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.elearning.domain.AbstractDomainObject;
import org.elearning.domain.type.TutorialType;

@Table(name = "elearn_document_tutorial")
public class DocumentTutorial extends AbstractDomainObject implements Tutorial {

	/**
	 * 
	 */
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}

	public void setExternalLocation(boolean isExternalLocation) {
		this.isExternalLocation = isExternalLocation;
	}

	private static final long serialVersionUID = -6355917690095082076L;
	/**
	 * This will denote the location of the tutorial
	 */
	private String location;
	/**
	 * This will denote if the tutorial is external/internal
	 */
	private boolean isExternalLocation;
	/**
	 * This will denote tutorial type
	 */
	private TutorialType tutorialType;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isExternalLocation() {
		return isExternalLocation;
	}

	public boolean getIsExternalLocation() {
		return isExternalLocation;
	}

	public void setIsExternalLocation(boolean isExternalLocation) {
		this.isExternalLocation = isExternalLocation;
	}

	public TutorialType getTutorialType() {
		return tutorialType;
	}

	public void setTutorialType(TutorialType tutorialType) {
		this.tutorialType = tutorialType;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
