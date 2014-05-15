package org.elearning.repository.core;

import java.io.Serializable;

import org.elearning.domain.AbstractDomainObject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This is marker interface for Repository
 * 
 * @author suyash
 * 
 * @param <T>
 */
public interface AbstractRepository<T extends AbstractDomainObject, Key extends Serializable>
		extends JpaRepository<T, Key> {

}
