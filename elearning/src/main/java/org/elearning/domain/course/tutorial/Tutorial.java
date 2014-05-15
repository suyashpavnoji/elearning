package org.elearning.domain.course.tutorial;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.elearning.domain.IAbstractDomainObject;
import org.elearning.domain.type.TutorialType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public interface Tutorial extends IAbstractDomainObject {
	
	@Id
	public Long getId();
	
	public void setId(Long id);
	/**
	 * This will set the location of the resource
	 */
	public void setLocation(String location);

	/**
	 * This will return location of the tutorial
	 * 
	 * @return
	 */
	public String getLocation();

	/**
	 * This will denote is the tutorial is internal or external
	 * 
	 * @return
	 */
	public boolean getIsExternalLocation();

	/**
	 * This will set if the location is external/internal
	 */
	public void setIsExternalLocation(boolean isExternalLocation);

	/**
	 * This will denote type of tutorial
	 * 
	 * @return
	 */
	public TutorialType getTutorialType();

	/**
	 * This will set the tutorial type
	 * 
	 * @param tutorialType
	 */
	public void setTutorialType(TutorialType tutorialType);

}
