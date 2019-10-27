package Modelos;

public class ConversorEuros {
    private double cambio;
    
    public ConversorEuros(double valorCambio)
    {
            // valor en la moneda de un euro
            cambio=valorCambio;
    }
    
    public double eurosAmoneda(double cantidad)
    {
        return cantidad*cambio;
    }
    
    public double monedaAeuros(double cantidad)
    {
        return cantidad/cambio;
    }
}

