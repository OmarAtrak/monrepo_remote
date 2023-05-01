package ma.pfe.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
    private Number rue;
    private String avenue;
    private String number;



    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getAvenue() {
        return this.avenue;
    }
    public void setAvenue(String aveneu) {
        this.avenue = avenue;
    }

    public Number getRue() {
        return this.rue;
    }
    public void setRue(Number rue) {
        this.rue = rue;
    }

}
