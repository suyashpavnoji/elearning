package org.elearning.assembler;

import org.elearning.domain.course.Syllabus;
import org.elearning.dto.course.SyllabusDTO;

public class SyllabusAssembler extends AbstractAssembler<SyllabusDTO, Syllabus> {

	public SyllabusAssembler() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public SyllabusDTO fromDomainObject(Syllabus domainObject) {
		SyllabusDTO syllabusDTO = new SyllabusDTO();
		fromAbstractDomainObject(domainObject, syllabusDTO);
		// syllabusDTO.setDocument(domainObject.get);
		syllabusDTO.setId(domainObject.getId());
		return syllabusDTO;
	}

	@Override
	public Syllabus toDomainObject(SyllabusDTO dto) {
		Syllabus syllabus = new Syllabus();
		return syllabus;

	}

}
