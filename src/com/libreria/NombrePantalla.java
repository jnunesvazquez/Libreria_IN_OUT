package com.libreria;

import javax.swing.*;

public class NombrePantalla {

    ObjetoPantalla pantalla = new ObjetoPantalla(pedirNombre());

    public String pedirNombre(){
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        return nombre;
    }
}
