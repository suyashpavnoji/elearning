package org.elearning.assembler;

import org.elearning.domain.AbstractDomainObject;
import org.elearning.dto.AbstractDTO;

public abstract class AbstractAssembler<T extends AbstractDTO, F extends AbstractDomainObject> implements IAbstractAssembler<T, F> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*public T fromDomainObject(F domainObject)
	{
		
	}

	public F toDomainObject(T dto)
	{
		
	}
*/
	public T fromAbstractDomainObject(F domainObject, T dto) {
		dto.setActive(domainObject.getIsActive());
		dto.setCreationDate(domainObject.getCreationDate());
		dto.setLastmodifiedDate(domainObject.getLastmodifiedDate());
		return dto;
	}

	public F toAbstractDomainObject(T dto, F domainjectOb) {
		domainjectOb.setActive(domainjectOb.getIsActive());
		domainjectOb.setCreationDate(domainjectOb.getCreationDate());
		domainjectOb.setLastmodifiedDate(domainjectOb.getLastmodifiedDate());
		return domainjectOb;
	}

}
