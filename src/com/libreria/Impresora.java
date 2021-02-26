package com.libreria;

public class Impresora implements  ISalida{

    private String msg;

    public Impresora (String msg){
        this.msg = msg;
    }

    public void visualiza(){
        System.out.println("Imprimiendo..." );
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(msg);
    }
}
