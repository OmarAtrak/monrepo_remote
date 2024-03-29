package ma.pfe.Models;


import javax.persistence.*;

@Entity
@Table(name = "tbooks")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Book {
    @Id
    private int id;
    private String title;

    public int getId(){ return this.id;}
    public void setId(int id) { this.id = id;}
    public String getTitle(){ return  title;}
    public void setTitle(String title){ this.title=title;}


    // les constructor
    public Book(int id, String title){
        super();
        this.id = id;
        this.title = title;
    }
    public Book(){
        super();
    }
    public Book(String title){
        super();
        this.title = title;
    }
}
