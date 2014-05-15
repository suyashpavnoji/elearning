package org.elearning.domain;

import java.io.Serializable;
import java.util.Date;

import org.elearning.dto.AbstractDTO;

/**
 * This class will be default class for all domain entity
 * 
 * this will have default creation and lastmodification date
 * 
 * @author suyash
 * 
 */
public abstract class AbstractDomainObject implements Serializable,
		IAbstractDomainObject {

	private Date creationDate;

	private Date modificationDate;

	private boolean isActive;
	
	public AbstractDomainObject() {
		super();
		creationDate = new Date();
		modificationDate = new Date();
	}

	public AbstractDomainObject(Date creationDate, Date lastmodifiedDate,
			boolean isActive) {
		super();
		this.creationDate = creationDate;
		this.modificationDate = lastmodifiedDate;
		this.isActive = isActive;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastmodifiedDate() {
		return modificationDate;
	}

	public void setLastmodifiedDate(Date lastmodifiedDate) {
		this.modificationDate = lastmodifiedDate;
	}

	public boolean isActive() {
		return isActive;
	}
	
	public boolean getIsActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
