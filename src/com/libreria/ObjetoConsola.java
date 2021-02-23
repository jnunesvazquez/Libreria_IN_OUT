package com.libreria;

import javax.swing.*;

public class ObjetoConsola {

    public void imprimirPorConsola(){
        String elemento = JOptionPane.showInputDialog("Introducir el mensaje a mostrar");
        JOptionPane.showMessageDialog(null, elemento);
    }
}
