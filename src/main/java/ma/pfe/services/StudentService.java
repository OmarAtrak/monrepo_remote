package ma.pfe.services;

import ma.pfe.dto.StudentDto;
import ma.pfe.dto.StudentIdDTO;
import ma.pfe.entities.StudentId;

import java.util.List;

public interface StudentService {
    StudentDto save(StudentDto e);
    StudentDto update(StudentDto e);
    boolean delete(StudentIdDTO id);
    List<StudentDto> selectAll();
    StudentDto findById(StudentIdDTO idDto);
}
