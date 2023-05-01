package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;

import java.util.List;


public interface StudentRepository {
    long save(StudentEntity e);
    boolean update(StudentEntity e);
    boolean delete(StudentId id);
    List<StudentEntity> selectAll();
    StudentEntity findById(StudentId id);
}
