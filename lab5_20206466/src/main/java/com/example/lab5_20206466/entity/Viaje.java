package com.example.lab5_20206466.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="viajes")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idViajes", nullable = false)
    private Integer id_viajes;

    @Column(name = "punto_recojo")
    private String punto_recojo;

    @Column(name = "cant_personas")
    private String cant_personas;

    @Column(name = "cant_perros")
    private String cant_perros;

/*
    @ManyToOne
    @JoinColumn(name="idPersona", nullable=false)
    private Persona persona;*/

}
