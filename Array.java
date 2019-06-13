package com.iraheta;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[] datos = new int[5];

        for (int i=0; i<5; i++) {
            System.out.print("Ingrese un numero" + "[" + i + "]: ");
            datos[i] = entrada.nextInt();
        }
        System.out.println("\n");
        for(int temp : datos){
            System.out.print(temp);
        }
    }
}
