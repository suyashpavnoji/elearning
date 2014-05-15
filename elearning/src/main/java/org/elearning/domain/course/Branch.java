package org.elearning.domain.course;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.elearning.domain.AbstractDomainObject;
import org.elearning.domain.course.tutorial.Tutorial;
@Entity
@Table(name="elearn_branch")
public class Branch extends AbstractDomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9091747286660921445L;
	
	@Id
	@Column(name="id")
	private String id;
	@Column(name="description")
	private String description;
	
	@OneToMany
	@JoinColumn(name="disciplineId")
	@OrderColumn(name="branch_id")
	private Set<Course> courses;

	@Column(name="no_of_courses")
	private int noOfCOurses;

	public Branch(String id, String description, Set<Course> courses,
			int noOfCOurses) {
		super();
		this.id = id;
		this.description = description;
		this.courses = courses;
		this.noOfCOurses = noOfCOurses;
	}

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(Date creationDate, Date lastmodifiedDate, boolean isActive) {
		super(creationDate, lastmodifiedDate, isActive);
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public int getNoOfCOurses() {
		return noOfCOurses;
	}

	public void setNoOfCOurses(int noOfCOurses) {
		this.noOfCOurses = noOfCOurses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
