package org.elearning.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * This class will be default class for all domain entity
 * 
 * this will have default creation and lastmodification date
 * 
 * @author suyash
 * 
 */
public abstract class AbstractDTO implements Serializable {

	private Date creationDate;

	private Date modificationDate;

	private boolean isActive;

	public AbstractDTO() {
		super();
		creationDate = new Date();
		modificationDate = new Date();
	}

	public AbstractDTO(Date creationDate, Date lastmodifiedDate,
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
