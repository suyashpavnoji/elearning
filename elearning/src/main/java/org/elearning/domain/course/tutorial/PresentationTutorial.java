package org.elearning.domain.course.tutorial;

import org.elearning.domain.type.TutorialType;

public class PresentationTutorial {
	
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


}
