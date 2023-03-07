package ma.pfe.services;

import ma.pfe.dto.StudentDto;
import ma.pfe.repositories.StudentRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final static Logger LOG = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Override
    public StudentDto create(StudentDto e) {
        return new StudentDto();
    }

    @Override
    public StudentDto update(StudentDto e) {
        return new StudentDto();
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentDto> readAll() {
        List list = new ArrayList<>();
        list.add("imad");
        list.add("ali");
        list.add("zakaria");
        list.add("said");
        return list;
    }
}
