package com.iraheta;

public class Persona {
    public String nombre;
    public int edad;
    public String sexo;
    public float peso;
    public double altura;

    public Persona(){}

    public Persona(String nombre, int edad, String sexo,
                   float peso, double altura){
        this.nombre = nombre;
        this.edad= edad;
        this.sexo= sexo;
        this.peso=peso;
        this.altura=altura;
        System.out.println("Primer constructor");
    }

    public boolean mayorEdad(){
        if (edad>=18){
            return true;
        }
        return false;
    }

}
