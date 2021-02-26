package com.libreria;

import javax.swing.*;

public class ObjetoConsola implements ISalida{

    private String msg;

    public ObjetoConsola (String msg){
        this.msg = msg;
    }

    public void visualiza(){
        String elemento = JOptionPane.showInputDialog("Introducir el mensaje a mostrar");
        JOptionPane.showMessageDialog(null, elemento);
    }
}
