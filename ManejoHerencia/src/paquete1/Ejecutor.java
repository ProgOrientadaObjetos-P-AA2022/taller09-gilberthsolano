/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete5.Persona;
import paquete4.PrestamoEducativo;
import paquete6.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        PrestamoAutomovil prestAu1= new PrestamoAutomovil("Gilbert", "Solano", "gilbertsolano",
//                10, "Loja", "Nuevo", "Chevrolet", new Persona("Rosa", "Perez", "rosape"), 30000);
//        prestAu1.calcularPagoMensual();
//        System.out.println(prestAu1);
//PrestamoEducativo prestEdu1= new PrestamoEducativo("Teresa", "Flores", "tflores", 12, "Cuenca", "Primer", new InstitucionEducativa("Univ", "Uv"), 2000);
//prestEdu1.calcularValorMensualPrestamo();
//        System.out.println(prestEdu1);

        int opc = 0;
        do {
            System.out.println("1. Prestamo Automovil");
            System.out.println("2. Prestamo Educativo");
            System.out.println("0. Salir");
            opc = Integer.parseInt(entrada.nextLine());
//       

            if (opc == 1 || opc == 2) {

                System.out.println("Ingrese nombre del beneficiario");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese apellido del beneficiario");
                String apellido = entrada.nextLine();
                System.out.println("Ingrese el username del beneficiario");
                String username = entrada.nextLine();
                System.out.println("Ingrese la cantidad de meses a"
                        + "pagar el prestamo ");
                int mes = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese la ciudad");
                String ciudad = entrada.nextLine();
                Persona pers1 = new Persona(nombre, apellido, username);
                pers1.establecerNombre(nombre);
                pers1.establecerApellido(apellido);
                pers1.establecerUsername(username);
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese el tipo de automovil");
                        String tipoA = entrada.nextLine();
                        System.out.println("Ingrese la marca del automovil");
                        String marcaA = entrada.nextLine();
                        System.out.println("Ingrese el nombre del garante");
                        String nombreG = entrada.nextLine();
                        System.out.println("Ingrese el apellido del garante");
                        String apellidoG = entrada.nextLine();
                        System.out.println("Ingrese el username del garante");
                        String usernameG = entrada.nextLine();
                        System.out.println("Ingrese el valor del automovil");
                        double valorA = Double.parseDouble(entrada.nextLine());

                        Persona garant1 = new Persona(nombreG, apellidoG, usernameG);
                        garant1.establecerNombre(nombreG);
                        garant1.establecerApellido(apellidoG);
                        garant1.establecerUsername(usernameG);
                        PrestamoAutomovil prestAuto1 = new PrestamoAutomovil(nombre, apellido, username, mes, ciudad, tipoA, marcaA, garant1, valorA);
                        prestAuto1.establecerBeneficiario(pers1);
                        prestAuto1.establecerTiempoPrestamo(mes);
                        prestAuto1.establecerCiudad(ciudad);
                        prestAuto1.establecerTipoAutomovil(tipoA);
                        prestAuto1.establecerMarcaAutoMovil(marcaA);
                        prestAuto1.establecerGarante(garant1);
                        prestAuto1.establecerValorAutomovil(valorA);
                        prestAuto1.calcularPagoMensual();
                        System.out.printf("%s\n", prestAuto1);
                        break;
                    case 2:
                        System.out.println("Ingrese  nivel de estudio");
                        String nivel = entrada.nextLine();
                        System.out.println("Ingrese  nombre del Centro educativo");
                        String nomCarrera = entrada.nextLine();
                        System.out.println("Ingrese las siglas del Centro Educativo");
                        String siglas = entrada.nextLine();
                        System.out.println("Ingrese  valor de la carrera");
                        double valorCarrera = Double.parseDouble(entrada.nextLine());

                        InstitucionEducativa inste1 = new InstitucionEducativa(nomCarrera, siglas);
                        PrestamoEducativo presE1 = new PrestamoEducativo(nombre, apellido, username, mes, ciudad, nivel, inste1, valorCarrera);
                        presE1.establecerBeneficiario(pers1);
                        presE1.establecerTiempoPrestamo(mes);
                        presE1.establecerCiudad(ciudad);
                        presE1.establecerNivelEstudio(nivel);
                        presE1.establecerInstitucionEducativa(inste1);
                        presE1.establecerValorCarrera(valorCarrera);
                        presE1.calcularValorMensualPrestamo();
                        System.out.printf("%s\n", presE1);
                        break;
                  

                }

            } else {
                System.out.println();
            }
        } while (opc != 0);

    }
}
