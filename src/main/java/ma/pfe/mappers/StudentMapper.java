package ma.pfe.mappers;

import ma.pfe.dto.StudentDto;
import ma.pfe.dto.StudentIdDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component(value = "mapper1")
public class StudentMapper {
    public StudentDto convertEntityToDto(StudentEntity entity){
        StudentDto dto = new StudentDto();
        dto.setIdDTO(studentIdToStudentIdDto(entity.getId()));
        dto.setNameDTO(entity.getName());
        return dto;
    }
    public StudentEntity convertDtoToEntity(StudentDto dto){
        StudentEntity entity = new StudentEntity();
        entity.setId(studentIdDtoToStudentId(dto.getIdDTO()));
        entity.setName(dto.getNameDTO());
        return entity;
    }
    public List <StudentDto> convertEntitysToDtos(List<StudentEntity> entities){
        return entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
    }
    public List <StudentEntity> convertDtoToEntity(List<StudentDto> dtos){
        return dtos.stream().map(dto -> convertDtoToEntity(dto)).collect(Collectors.toList());
    }

    public StudentId studentIdDtoToStudentId(StudentIdDTO studentIdDto){
        StudentId studentId = new StudentId();
        studentId.setId(studentIdDto.getId());
        studentId.setCode(studentIdDto.getCode());
        studentId.setAlias(studentIdDto.getAlias());

        return studentId;
    }

    public StudentIdDTO studentIdToStudentIdDto(StudentId studentId){
        StudentIdDTO studentIdDTO = new StudentIdDTO();
        studentIdDTO.setId(studentId.getId());
        studentIdDTO.setCode(studentId.getCode());
        studentIdDTO.setAlias(studentId.getAlias());

        return studentIdDTO;
    }
}
