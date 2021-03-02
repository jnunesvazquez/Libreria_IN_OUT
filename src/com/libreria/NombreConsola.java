package com.libreria;

import javax.swing.*;
import java.util.Scanner;

public class NombreConsola {

    ObjetoConsola consola = new ObjetoConsola(pedirNombre());

    public String pedirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        return nombre;
    }
}
