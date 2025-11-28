/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exa2_25550655;

import java.util.Scanner;

public class EXA2_25550655 {
    private static int Scanner;

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int numero;
        int opcion;
        int repetir = 1;

        while (repetir == 1) {
            System.out.print("Ingrese un numero entero: ");
            numero = captu.nextInt();
            System.out.println("¿Qué desea imprimir?");
            System.out.println("1. Numeros primos");
            System.out.println("2. Numeros no primos");
            System.out.print("Opcion: ");
            opcion = captu.nextInt();
            if (opcion == 1) {
                System.out.println("Numeros primos entre 2 y " + numero + ":");
                for (int i = 2; i <= numero; i++) {
                    if (esPrimo(i)) {
      System.out.print(i + " = ");            
                    }
                }
    } else if (opcion == 2) {
    System.out.println("Números NO primos entre 2 y " + numero + ":");

     for (int i = 2; i <= numero; i++) {
                    if (esPrimo(i)) {
                        System.out.print(i + " = ");                      
                    }
                }
            } else {
                System.out.println("Opción invalida.");
            }
            System.out.print("¿Desea repetir el proceso? (1 = Sí, 0 = No): ");
            repetir = captu.nextInt();
        }
        System.out.println("Programa finalizado.");
    }   
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
      



