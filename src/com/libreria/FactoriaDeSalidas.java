package com.libreria;

public class FactoriaDeSalidas {
    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;
    public static final int IMPRESORA = 3;
    public static final int NOMBRECONSOLA = 4;
    public static final int NOMBREPANTALLA = 5;

    public static ISalida getProducto(int type, String msg){
        switch (type){
            case CONSOLA:
                return new ObjetoConsola(msg);
            case VENTANA:
                return new ObjetoPantalla(msg);
            case IMPRESORA:
                return new Impresora(msg);
            case NOMBRECONSOLA:
                return new NombreConsola();
            case NOMBREPANTALLA:
                return new NombrePantalla();
            default:
                return null;
        }
    }
}
