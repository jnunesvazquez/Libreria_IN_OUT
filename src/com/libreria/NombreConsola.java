package com.libreria;

import javax.swing.*;
import java.util.Scanner;

public class NombreConsola implements ISalida{

    private String msg;

    public NombreConsola (){msg = pedirNombre();}

    public String pedirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        return nombre;
    }

    public void visualiza(){
        System.out.println("Tu nombre es" + msg);
    }
}
