package org.elearning.domain;

import java.util.Date;

/**
 * This is marker interface for all the domain entity which is persisted in
 * database
 * 
 * this will have default creation and lastmodification date
 * 
 * @author suyash
 * 
 */
public interface IAbstractDomainObject {

	public Date getCreationDate();

	public void setCreationDate(Date creationDate);

	public Date getLastmodifiedDate();

	public void setLastmodifiedDate(Date lastmodifiedDate);

	public boolean isActive();

	public void setActive(boolean isActive);

}
