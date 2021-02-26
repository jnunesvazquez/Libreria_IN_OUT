package com.libreria;

import javax.swing.*;

public class ObjetoConsola implements ISalida{

    private String msg;

    public ObjetoConsola (String msg){
        this.msg = msg;
    }

    public void visualiza(){
        System.out.println("Sale por la consola " + msg);
    }
}
