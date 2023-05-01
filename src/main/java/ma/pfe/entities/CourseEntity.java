package ma.pfe.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_Course")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private StudentId id;

    private String name;

    @ManyToMany
    @JoinTable(name = "tab_list_courses")
    private List<StudentEntity> students;

    @Embedded
    private Adresse adresse;


    public StudentId getId() {
        return id;
    }
    public void setId(StudentId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }
    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public Adresse getAdresse() {
        return adresse;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
