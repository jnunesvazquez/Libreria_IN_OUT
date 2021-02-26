package com.libreria;

import javax.swing.*;

public class ObjetoPantalla implements ISalida{

    private String msg;

    public ObjetoPantalla (String msg){
        this.msg = msg;
    }

    public void visualiza(){
        JOptionPane.showMessageDialog(null, "Sale por la pantalla " + msg);
    }
}
