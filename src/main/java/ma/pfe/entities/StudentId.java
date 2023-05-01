package ma.pfe.entities;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Objects;

public class StudentId implements Serializable {
    private long id;
    private String code;
    private String alias;

    public StudentId(long id, String code, String alias){
        this.id = id;
        this.code = code;
        this.alias = alias;
    }
    public StudentId(){}

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentId studentId = (StudentId) o;
        return id == studentId.id && Objects.equals(code, studentId.code) && Objects.equals(alias, studentId.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, alias);
    }
}
