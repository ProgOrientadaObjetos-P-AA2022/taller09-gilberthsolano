/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudad;

    public Prestamo(String n, String a, String u,
            int t, String c) {
        beneficiario = new Persona(n, a, u);
        tiempoPrestamo = t;
        establecerCiudad(c);

    }

    public void establecerBeneficiario(Persona c) {
        beneficiario = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public void establecerTiempoPrestamo(int c) {
        tiempoPrestamo = c;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void establecerCiudad(String c) {
        ciudad = c.toUpperCase();
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String reporte = String.format("Prestamo\n"
                + "Beneficario:%s\n"
                + "Tiempo prestamo:%d\n"
                + "Ciudad:%s\n", beneficiario,
                tiempoPrestamo,
                ciudad
        );
        return reporte;
    }

}
