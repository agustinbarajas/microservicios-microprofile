package com.example.microservicios.microprofile.rest;

public class Task {
    private int id;
    private String descripcion;

    public Task(int id, String descripcion) {
    	super();
    	this.id = new Integer(id);
    	this.descripcion = new String(descripcion);
    }
    public Task() {
        this(1, "Tarea 1");
    }

    public String toString() {
        return getId() + "." + getDescripcion();
    }

    public void setId(int id) {
        this.id = new Integer(id);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = new String(descripcion);
    }

    public int getId() {
        return new Integer(this.id);
    }

    public String getDescripcion() {
        return new String(this.descripcion);
    }
}