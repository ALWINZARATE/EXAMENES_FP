/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ahorrcado_exa;

import java.util.Scanner;

public class AHORRCADO_EXA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta = "JAVA";
        char[] progreso = {'_', '_', '_', '_'};
        int intentos = 3; // SOLO 3 INTENTOS FALLIDOS
        System.out.println("=== JUEGO DEL AHORCADO ===");
        while (intentos > 0) {
            System.out.print("Palabra: ");
            for (char c : progreso) {
                System.out.print(c + " ");
            }
            System.out.println("\nIntentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = Character.toUpperCase(sc.next().charAt(0));
            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }
            if (acierto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Letra incorrecta.");
                intentos--; // ❗ Ahora solo tienes 3
            }
            if (String.valueOf(progreso).equals(palabraSecreta)) {
                System.out.println("\n¡Ganaste! La palabra era: " + palabraSecreta);
                return;
            }
        }
        System.out.println("\nPerdiste. La palabra era: " + palabraSecreta);

    
