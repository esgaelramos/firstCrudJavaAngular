package xyz.yoandroide.demo.model;

// import jakarta.persistence.Entity; // <-- This is not necessary because it is not an entity (it is a table)
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// @Entity
@Table(name = "pais") // <-- Name of the table in the database 
public class Pais {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) // <-- Auto-increment
    private int id;
    private String nombre;

    // Constructors
    // public Pais() {
    // } // for hibernate JPA

    // not id because it is auto-increment
    // public Pais(String nombre)  {
    //     //super(); // <-- Superclass (this signifies that the superclass is the one that is being used)
    //     this.nombre = nombre;
    // }

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
