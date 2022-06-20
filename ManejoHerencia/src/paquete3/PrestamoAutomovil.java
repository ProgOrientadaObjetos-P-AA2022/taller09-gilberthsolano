/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante;
    private double valorAutomovil;
    private double pagoPrestamoAutomovil;

    public PrestamoAutomovil(String n, String a, String u,
            int t, String c,
            String ta, String marc, Persona g, double va) {
        super(n, a, u, t, c);
        tipoAutomovil = ta;
        marcaAutomovil = marc;
        garante = g;
        valorAutomovil = va;
    }
    public PrestamoAutomovil(){
        
    }
    public void establecerTipoAutomovil(String c){
        tipoAutomovil=c;
    }
    public String obtenerTipoAutomovil(){
        return tipoAutomovil;
    }
    public void establecerMarcaAutoMovil(String c){
        marcaAutomovil=c;
    }
    public String obtenerMarcaAutomovil(){
        return marcaAutomovil;
    }
    public void establecerGarante(Persona c){
        garante=c;
    }
    public Persona obtenerGarante(){
        return garante;
    }
    public void establecerValorAutomovil(double c){
        valorAutomovil=c;
    }
    public double obtenerValorAutomovil(){
        return valorAutomovil;
    }
    public void calcularPagoMensual(){
        double resultado=0;
        resultado=valorAutomovil/tiempoPrestamo;
        
        pagoPrestamoAutomovil=resultado;
    }
    public double obtenerPagoMensual(){
        return pagoPrestamoAutomovil;
    }

    @Override
    public String toString() {
        String reporte=String.format("%s", super.toString());
        reporte=String.format("Prestamo Automovil\n"
                + "%s\n"
                + "Tipo Automovil:%s\n"
                + "Marca Automovil:%s\n"
                + "Garante:%s\n"
                + "Valor Automovil:%.2f\n"
                + "Pago Prestamo Automovil:%.2f\n",reporte,
                obtenerTipoAutomovil(),
                obtenerMarcaAutomovil(),
                obtenerGarante(),
                obtenerValorAutomovil(),
                obtenerPagoMensual());
        return reporte;
    }
    
    

}
