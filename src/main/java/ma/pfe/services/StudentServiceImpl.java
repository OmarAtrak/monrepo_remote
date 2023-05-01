package ma.pfe.services;

import ma.pfe.dto.StudentDto;
import ma.pfe.dto.StudentIdDTO;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("service")
public class StudentServiceImpl implements StudentService{
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository studentRepository;
    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDto save(StudentDto e) {
        LOGGER.debug("start method save dto : {} ", e);
        studentRepository.save(studentMapper.convertDtoToEntity(e));
        return e;
    }

    @Override
    public StudentDto update(StudentDto e) {
        LOGGER.debug("start method save dto : {} ", e);
        studentRepository.update(studentMapper.convertDtoToEntity(e));
        return e;
    }

    @Override
    public boolean delete(StudentIdDTO idDto) {
        LOGGER.debug("start method delete idDto : {} ", idDto);
        studentRepository.delete(studentMapper.studentIdDtoToStudentId(idDto));
        return true;
    }

    @Override
    public List<StudentDto> selectAll() {
        LOGGER.debug("start method select All");
        return studentMapper.convertEntitysToDtos(studentRepository.selectAll());
    }

    @Override
    public StudentDto findById(StudentIdDTO idDto) {
        LOGGER.debug("start method findById idDto : {} ", idDto);
        return studentMapper.convertEntityToDto(
                studentRepository
                        .findById(studentMapper.studentIdDtoToStudentId(idDto)));
    }
}
