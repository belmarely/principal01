package com.iraheta;

public class Vehiculo {
    public String marca;
    public String modelo;
    public double precio_sugerido;

    public Vehiculo (String marca, String modelo, double precio_sugerido){
        this.marca= marca;
        this.modelo= modelo;
        this.precio_sugerido= precio_sugerido + (precio_sugerido * 0.20);
    }
}
