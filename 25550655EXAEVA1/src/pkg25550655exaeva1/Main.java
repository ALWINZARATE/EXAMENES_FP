/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg25550655exaeva1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tiempo;
        int natacion, ciclismo, carrera;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura tu tiempo en natacion en minutos: ");
        natacion = captu.nextInt();
        System.out.println("Captura tu tiempo en ciclismo en minutos: ");
        ciclismo = captu.nextInt();
        System.out.println("Captura tu tiempo en carrera en minutos: ");
        carrera = captu.nextInt();
        if (tiempo <= 120 && <=60){
        System.out.println("Calificacion: exelente");
        } else if (tiempo <= 150 && tiempo <=70){
        System.out.println("Calificacion = Regular");
    }}
    
}
