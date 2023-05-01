package ma.pfe.entities;

import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_Students")
//@IdClass(StudentId.class)
public class StudentEntity {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.TABLE)    // TABLE = HIBERNATE_SEQUENCE (GERRER LES ID)
    @Column(name = "id_student")
    private StudentId studentId;
    //    private long id;

    @Column(name = "student_name")
    private String name;

    @Embedded
    @Column(name = "student_adresse")
    private Adresse adresse;

    @ManyToMany()
    @Column(name = "Courses")
    private List<CourseEntity> courses;

    public StudentId getId() {
        return this.studentId;
    }
    public void setId(StudentId id) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse(){
        return this.adresse;
    }
    public void setAdresse(Adresse adresse){
        this.adresse = adresse;
    }
}