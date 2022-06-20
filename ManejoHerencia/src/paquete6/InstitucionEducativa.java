/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class InstitucionEducativa {
    private String nombre;
    private String siglas;
    
    public InstitucionEducativa(String n, String s){
        nombre=n;
        siglas=s; 
    }
    public void establecerNombre(String c){
        nombre=c;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void establecerSiglas(String c){
        siglas=c;
    }
    public String obtenerSiglas(){
        return siglas;
    }

    @Override
    public String toString() {
        String reporte= String.format("Institucion Educativa\n"
                + "Nombre Institucion:%s\n"
                + "Siglas Institucion:%s\n",
                obtenerNombre(),
                obtenerSiglas());
        return reporte;
        
    }
    
}
