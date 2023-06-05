package com.gestion.tareas.GestordeTareas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tareas")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titulo", nullable = false, length = 50, unique = true)
    private String titulo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "estado")
    private boolean estado=false;

    @Transient//para decir que no es parte de la tabla pero que es un error se le conoce como variable de control
    private String mensajeError;

    public Tarea() {
    }

    public Tarea(Integer id, String titulo, String descripcion, boolean estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
