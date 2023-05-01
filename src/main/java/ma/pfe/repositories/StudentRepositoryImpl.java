package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import ma.pfe.mappers.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository(value="repo1")
public class StudentRepositoryImpl implements StudentRepository{
    private final static Logger LOG = LoggerFactory.getLogger(StudentRepositoryImpl.class);

    private StudentEntity SEntity;
    @Autowired
    private StudentMapper SMapper;

    public StudentRepositoryImpl(StudentEntity studentEntity){
        this.SEntity = studentEntity;
    }

    @Override
    public long save(StudentEntity e) {
        return 0;
    }

    @Override
    public boolean update(StudentEntity e) {
        return false;
    }

    @Override
    public boolean delete(StudentId id) {
        return true;
    }

    @Override
    public List<StudentEntity> selectAll() {
        return null;
    }

    @Override
    public StudentEntity findById(StudentId id) {
        return null;
    }

}
