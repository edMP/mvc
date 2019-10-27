package Vistas;

import Controladores.ControlConversor;

public interface InterfazVista {

    void setControlador(ControlConversor c);

    void arranca(); //Comienza visualización

    double getCantidad();  //cantidad a convertir

    void escribeCambio(String s); //texto con la conversión

    // Constantes que definen las posibles operaciones:
    static final String AEUROS = "Pesetas a Euros";
    static final String APESETAS = "Euros a Pesetas";
}

