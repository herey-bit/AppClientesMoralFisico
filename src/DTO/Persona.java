package DTO;

public abstract class Persona {
    
    protected String nombre;

    public Persona (String nombre) {
        this.nombre = nombre;
    }

    public Persona(){}

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "";
    }

    


}