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
    private String nombre_mascota;

    @Column(name = "cant_personas")
    private String genero;

    @Column(name = "cant_perros")
    private String edad;

/*
    @ManyToOne
    @JoinColumn(name="idPersona", nullable=false)
    private Persona persona;*/

}
