package org.elearning.domain.course;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.elearning.domain.AbstractDomainObject;
import org.elearning.domain.course.tutorial.Tutorial;

@Entity
@Table(name = "elearn_course")
public class Course extends AbstractDomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5541710605863584231L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "discipline_id")
	private Long disciplineId;

	@Column(name = "description")
	private String description;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "id", name = "syllabus_id")
	private Syllabus syllabus;

	@OneToMany(fetch = FetchType.LAZY)
	@OrderColumn(name="course_id")
	private Set<Tutorial> tutorials;

	@Column(name = "no_of_tutorials")
	private int noOfTutorials;
	
	@Column(name="branch_id")
	private Long branchId;

	public Long getDisciplineId() {
		return disciplineId;
	}

	public void setDisciplineId(Long disciplineId) {
		this.disciplineId = disciplineId;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public Course() {
		super();

	}

	public Course(Date creationDate, Date lastmodifiedDate, boolean isActive) {
		super(creationDate, lastmodifiedDate, isActive);
		// TODO Auto-generated constructor stub
	}

	public Course(Long id, String description, Syllabus syllabus,
			Set<Tutorial> tutorials, int noOfTutorials) {
		super();
		this.id = id;
		this.description = description;
		this.syllabus = syllabus;
		this.tutorials = tutorials;
		this.noOfTutorials = noOfTutorials;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Syllabus getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(Syllabus syllabus) {
		this.syllabus = syllabus;
	}

	public Set<Tutorial> getTutorials() {
		return tutorials;
	}

	public void setTutorials(Set<Tutorial> tutorials) {
		this.tutorials = tutorials;
	}

	public int getNoOfTutorials() {
		return noOfTutorials;
	}

	public void setNoOfTutorials(int noOfTutorials) {
		this.noOfTutorials = noOfTutorials;
	}

}
