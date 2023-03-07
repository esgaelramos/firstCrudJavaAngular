package xyz.yoandroide.demo.model;

import jakarta.persistence.Column;
// import jakarta.persistence.Entity; <-- This is not necessary because it is not an entity (it is a table)
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// @Entity
@Table(name = "persona") // <-- Name of the table in the database 
public class Persona {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) // <-- Auto-increment
    private int id;
    @Column (name = "namep") // <-- Specifc name of the column in the database
    private String nombre;
    private String apellido;
    private int edad;

    @ManyToOne // <-- Many to one relationship (one person can have one country, but one country can have many persons)
    @JoinColumn(name = "pais_id") // <-- Foreign key (pais_id is the name of the column in the database)
    private Pais pais;
    @JoinColumn(name = "estado_id")
    private Estado estado;

    // Constructors
    // public Persona() {
    // } // for hibernate JPA

    // not id because it is auto-increment
    // public Persona(String nombre, String apellido, int edad, Pais pais, Estado estado)  {
    //     //super(); // <-- Superclass (this signifies that the superclass is the one that is being used)
    //     this.nombre = nombre;
    //     this.apellido = apellido;
    //     this.edad = edad;
    //     this.pais = pais;
    //     this.estado = estado;
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
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
