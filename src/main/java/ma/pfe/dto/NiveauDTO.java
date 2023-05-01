package ma.pfe.dto;

public class NiveauDTO {
    private long id;
    private String label;


    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return this.label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "NiveauDTO{" +
                "id=" + id +
                ", label='" + label + '\'' +
                '}';
    }
}