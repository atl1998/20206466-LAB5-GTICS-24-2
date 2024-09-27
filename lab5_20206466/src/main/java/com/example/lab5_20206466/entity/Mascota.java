package com.example.lab5_20206466.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="mascotas")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMascotas", nullable = false)
    private Integer id_mascotas;

    @Column(name = "nombre_mascota")
    private String nombre_mascota;

    @Column(name = "genero")
    private String genero;

    @Column(name = "edad")
    private String edad;

    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;

    @Column(name = "vacunado")
    private String vacunado;

    @Column(name="desparasitado")
    private String desparasitado;
/*
    @ManyToOne
    @JoinColumn(name="idPersona", nullable=false)
    private Persona persona;*/

}
