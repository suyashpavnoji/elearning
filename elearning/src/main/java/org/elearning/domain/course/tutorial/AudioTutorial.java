package org.elearning.domain.course.tutorial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.elearning.domain.AbstractDomainObject;
import org.elearning.domain.type.TutorialType;

@Entity
@Table(name="elearn_audio_tutorial")
public class AudioTutorial extends AbstractDomainObject implements Tutorial {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3158159760009586734L;
	
	@Id
	@Column(name="id",nullable=false)
	private Long id;
	/**
	 * This will denote the location of the tutorial
	 */
	private String location;
	/**
	 * This will denote if the tutorial is external/internal
	 */
	private boolean isExternalLocation;
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setExternalLocation(boolean isExternalLocation) {
		this.isExternalLocation = isExternalLocation;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
