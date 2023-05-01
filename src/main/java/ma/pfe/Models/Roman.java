package ma.pfe.Models;

public class Roman extends Book{
    public String themeLittraire;

    public String getThemeLittraire() {
        return themeLittraire;
    }
    public void setThemeLittraire(String themeLittraire) {
        this.themeLittraire = themeLittraire;
    }

    public Roman(String title, String themeLittraire){
        super(title);
        this.themeLittraire = themeLittraire;
    }

}
