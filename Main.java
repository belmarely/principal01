package com.iraheta;

public class Main {

    public static void main(String[] args) {
    Vehiculo carro = new Vehiculo
            ("mazda", "BT-50", 550000);
    Vehiculo avion = new Vehiculo("toyota", "F23", 100000);


    System.out.println(carro.marca);
    System.out.println(avion.modelo);
    System.out.println(carro.precio_sugerido);

    }

}
