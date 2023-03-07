package xyz.yoandroide.demo.model;

// import jakarta.persistence.Entity; // <-- This is not necessary because it is not an entity (it is a table)
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// @Entity
@Table(name = "estado") // <-- Name of the table in the database 
public class Estado {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) // <-- Auto-increment
    private int id;
    private Pais pais;
    private String nombre; 

    // Constructors
    public Estado() {
    } // for hibernate JPA
    
    // not id because it is auto-increment
    public Estado(Pais pais, String nombre)  {
        super(); // <-- Superclass (this signifies that the superclass is the one that is being used)
        this.pais = pais;
        this.nombre = nombre;
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
