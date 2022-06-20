/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String username;
    
    public Persona(String n, String a, String u){
        nombre=n;
        apellido=a;
        username=u;
        
    }
    public Persona(){
        
    }
    public void establecerNombre(String c){
        nombre=c;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void establecerApellido(String c){
        apellido=c;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public void establecerUsername(String c){
        username=c;
    }
    public String obtenerUsername(){
        return username;
    }

    @Override
    public String toString() {
        String reporte=String.format("Persona\n"
                + "Nombre:%s\n"
                + "Apellido:%s\n"
                + "Username:%s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerUsername());
        return reporte;
    }
    
}
