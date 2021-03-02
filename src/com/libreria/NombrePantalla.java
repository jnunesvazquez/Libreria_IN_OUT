package com.libreria;

import javax.swing.*;

public class NombrePantalla implements ISalida{

    private String msg;

    public NombrePantalla (){
        msg = pedirNombre();
    }

    public String pedirNombre(){
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        return nombre;
    }

    public void visualiza(){
        JOptionPane.showMessageDialog(null, "Tu nombre es" + msg);
    }
}
