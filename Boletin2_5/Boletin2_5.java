/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin2_5;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Boletin2_5 {
        public static void main(String[] args) {
           
            Scanner scanIn = new Scanner(System.in);
            System.out.println("Introduce el sueldo fijo: ");
            float sueldoFijo = scanIn.nextFloat();
            System.out.println("Introduce el total de ventas en €: ");
            float ventasTotal = scanIn.nextFloat();
            System.out.println("Introduce el kilometraje total en Km: ");
            float kilometrosTotal = scanIn.nextFloat();
            System.out.println("Introduce el la cantidad de dias de desplazamiento: ");
            float diasTotal = scanIn.nextFloat();
            float sueldoBruto = (sueldoFijo + (ventasTotal * 0.05f) + (kilometrosTotal * 2f) + (diasTotal * 30f));

            System.out.println("El sueldo bruto es: " + sueldoBruto);
            
            float porcentajeIRPF = 18f;
            float retencionSegSocial = 36f;
            
            float sueldoLiquido = (sueldoBruto - ((sueldoBruto * porcentajeIRPF)/100) - retencionSegSocial);

            System.out.println("El sueldo liquido es: " + sueldoLiquido);
            
            
            
            
            
            
            
            
            
            
            
            
        }
}
