package org.elearning.assembler;

import org.elearning.domain.AbstractDomainObject;
import org.elearning.dto.AbstractDTO;

public interface IAbstractAssembler<T extends AbstractDTO, F extends AbstractDomainObject> {
	
	public T fromDomainObject(F domainObject);

	public F toDomainObject(T dto);


}
