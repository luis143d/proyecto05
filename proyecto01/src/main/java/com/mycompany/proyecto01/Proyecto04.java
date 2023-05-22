/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto01;

import java.util.Scanner;

/**
 *
 * @author Murillo
 */
public class Proyecto04 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Pedir las notas de prácticas al usuario
        System.out.print("Ingrese la nota 1 de práctica: ");
        double nota1 = input.nextDouble();
        System.out.print("Ingrese la nota 2 de práctica: ");
        double nota2 = input.nextDouble();
        System.out.print("Ingrese la nota 3 de práctica: ");
        double nota3 = input.nextDouble();
        System.out.print("Ingrese la nota 4 de práctica: ");
        double nota4 = input.nextDouble();
        
        // Pedir la nota del examen final al usuario
        System.out.print("Ingrese la nota del examen final: ");
        double examenFinal = input.nextDouble();
        
        // Calcular el promedio de prácticas y el promedio final
        double promedioPracticas = (nota1 + nota2 + nota3 + nota4) / 4;
        double promedioFinal = (promedioPracticas * 0.5) + (examenFinal * 0.5);
        
        // Mostrar el resultado al usuario
        System.out.println("El promedio de prácticas es: " + promedioPracticas);
        System.out.println("El promedio final es: " + promedioFinal);
    }

}
