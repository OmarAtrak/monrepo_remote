package ma.pfe.dto;


import ma.pfe.entities.StudentId;

import java.util.List;

public class StudentDto {
    private StudentIdDTO idDTO;
    private String nameDTO;
    private List<CourseDTO> coursesDTO;
    private AdresseDTO adresseDTO;

    public StudentIdDTO getIdDTO() {
        return this.idDTO;
    }
    public String getNameDTO() {
        return this.nameDTO;
    }
    public AdresseDTO getAdresseDTO() {
        return this.adresseDTO;
    }
    public List<CourseDTO> getCoursesDTO(){
        return this.coursesDTO;
    }

    public void setIdDTO(StudentIdDTO idDTO) {
        this.idDTO.setId(idDTO.getId());
        this.idDTO.setCode(idDTO.getCode());
        this.idDTO.setAlias(idDTO.getAlias());
    }
    public void setNameDTO(String nameDTO) {
        this.nameDTO = nameDTO;
    }
    public void setAdresseDTO(AdresseDTO adresseDTO) {
        this.adresseDTO = adresseDTO;
    }
    public void setCourseDTO(List<CourseDTO> coursesDTO){
        this.coursesDTO = coursesDTO;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "idDTO=" + idDTO +
                ", nameDTO='" + nameDTO + '\'' +
                ", coursesDTO=" + coursesDTO +
                ", adresseDTO=" + adresseDTO +
                '}';
    }
}
