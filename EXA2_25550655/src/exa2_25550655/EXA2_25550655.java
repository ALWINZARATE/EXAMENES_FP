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
       System.out.print("Ingresa un número entero: ");
       int numero;    
       System.out.println("¿Deseas imprimir los numeros primos o no primos?");     
       boolean esPrimo = true;  
        if (numero <= 1) {
        esPrimo = false;
       for(int i = 1; i <= numero; i++){
       for(int j = 1; j <= i; j++){
       System.out.print("*");
       
       for (int i = 2; i <= Math.sqrt(numero); i++) {
       if (numero % i == 0) {
        esPrimo = false;
             break;
    }
  }
       }
       }
    }
}
    }



