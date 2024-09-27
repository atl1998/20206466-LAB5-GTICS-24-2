package com.example.lab5_20206466.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPersona")
    private Integer id_persona;

    @Column(name="celular")
    private String celular;

    @Column(name="dni")
    private String dni;

    @Column(name="nombre")
    private String nombre;

    @Column(name="tipo_persona")
    private String tipo_persona;

}
