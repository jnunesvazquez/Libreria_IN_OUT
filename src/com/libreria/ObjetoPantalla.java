package com.libreria;

import java.util.Scanner;

public class ObjetoPantalla {

    public void imprimirPorPantalla(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir el mensaje a mostrar");
        String elemento = sc.nextLine();
        System.out.println(elemento);
    }
}
