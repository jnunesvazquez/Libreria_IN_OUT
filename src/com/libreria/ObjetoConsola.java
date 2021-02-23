package com.libreria;

import javax.swing.*;

public class ObjetoConsola {

    private String msg;

    public ObjetoConsola (String msg){
        this.msg = msg;
    }

    public void imprimirPorConsola(){
        String elemento = JOptionPane.showInputDialog("Introducir el mensaje a mostrar");
        JOptionPane.showMessageDialog(null, elemento);
    }
}
