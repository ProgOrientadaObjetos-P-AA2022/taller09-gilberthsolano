/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete6.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPagoPrestamo;
   
    public PrestamoEducativo(String n, String a, String u,
            int t, String c, String nivel, InstitucionEducativa ce, double vc){
        super(n,a,u,t,c);
        nivelEstudio=nivel;
        centroEducativo=ce;
        valorCarrera=vc;
        
    }
    
    public void establecerNivelEstudio(String c){
        nivelEstudio=c;
    }
    public String obtenerNivelEstudio(){
        return nivelEstudio;
    }
    public void establecerInstitucionEducativa(InstitucionEducativa c){
        centroEducativo=c; 
    }
    public InstitucionEducativa obtenerInstitucionEducativa(){
        return centroEducativo;
    }
    public void establecerValorCarrera(double c){
        valorCarrera=c;
    }
    public double obtenerValorCarrera(){
        return valorCarrera;
    }
    public void calcularValorMensualPrestamo(){
        //El valor mensual del pago del préstamo del valor de la carrera es igual 
        //al (valor de la carrera dividido para el número de meses) menos 10% del 
        //(resultado del valor de la carrera dividido para el número de meses)
        double resultado=0;
        resultado=(valorCarrera/tiempoPrestamo)-((valorCarrera/tiempoPrestamo)*(0.10));
        valorMensualPagoPrestamo=resultado;

    }
    public double obtenerValorMensualPrestamo(){
        return valorMensualPagoPrestamo;
    }

    @Override
    public String toString() {
         String reporte=String.format("%s", super.toString());
         reporte=String.format("Prestamo Educativo\n %s\n"
                 + "Nivel Estudio:%s\n"
                 + "%s\n"
                 + "Valor de la carrera%.2f\n"
                 + "Valor pago mensual de prestamo%.2f\n",reporte,
                 obtenerNivelEstudio(),
                 obtenerInstitucionEducativa(),
                 obtenerValorCarrera(),
                 obtenerValorMensualPrestamo()
                 );
         return reporte;
    }
    
    
}
