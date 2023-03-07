package ma.pfe.mappers;

import ma.pfe.dto.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentDto convertEntityToDto(StudentEntity entity){
        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
    public StudentEntity convertDtoToEntity(StudentDto dto){
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    public List <StudentDto> convertEntitysToDtos(List<StudentEntity> entities){
        return entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
    }
    public List <StudentEntity> convertDtoToEntity(List<StudentDto> dtos){
        return dtos.stream().map(dto -> convertDtoToEntity(dto)).collect(Collectors.toList());
    }
}
