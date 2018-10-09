/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin2_3;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Boletin2_3 {
    

    public static void main(String[] args) {
        
        Scanner scanCantidad = new Scanner(System.in);
        System.out.println("Introduce cantidad de billetes de 100€: ");
        float cantidadBilletes100 = scanCantidad.nextFloat();
        System.out.println("Introduce cantidad de billetes de 20€: ");
        float cantidadBilletes20 = scanCantidad.nextFloat();
        System.out.println("Introduce cantidad de billetes de 5€: ");
        float cantidadBilletes5 = scanCantidad.nextFloat();
        System.out.println("Introduce cantidad de monedas de 1€: ");
        float cantidadMonedas1 = scanCantidad.nextFloat();
        float totalDinero = ((cantidadBilletes100 * 100)+(cantidadBilletes20 * 20)+(cantidadBilletes5*5)+(cantidadMonedas1));
        
        System.out.println("Total : " + totalDinero + "€");
    }        
}
