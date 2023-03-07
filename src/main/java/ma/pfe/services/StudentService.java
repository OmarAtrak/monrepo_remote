package ma.pfe.services;

import ma.pfe.dto.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    StudentDto create(StudentDto e);
    StudentDto update(StudentDto e);
    boolean delete(long id);
    List<StudentDto> readAll();
}
