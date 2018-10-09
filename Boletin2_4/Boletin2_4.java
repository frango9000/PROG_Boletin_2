/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin2_4;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Boletin2_4 {
        public static void main(String[] args) {
        
        int cantidadBilletes100 = 0, cantidadBilletes20 = 0, cantidadBilletes5 = 0, cantidadMonedas1 = 0;
        Scanner scanCantidad = new Scanner(System.in);
        System.out.println("Introduce cantidad Euros: ");
        float totalDinero = scanCantidad.nextFloat();
        float contadorInterno = totalDinero;
        
        while(contadorInterno >= 100){
            contadorInterno -= 100;
            cantidadBilletes100++;
        }
        
        while(contadorInterno >= 20){
            contadorInterno -= 20;
            cantidadBilletes20++;
        }
        
        while(contadorInterno >= 5){
            contadorInterno -= 5;
            cantidadBilletes5++;
        }
        
        while(contadorInterno >= 1){
            contadorInterno -= 1;
            cantidadMonedas1++;
        }
        
        
        System.out.println(totalDinero + "€ se pueden dividir de la siguiente manera: ");
        System.out.println("Cantidad de Billetes de 100€ : " + cantidadBilletes100);
        System.out.println("Cantidad de Billetes de 20€ : " + cantidadBilletes20);
        System.out.println("Cantidad de Billetes de 5€ : " + cantidadBilletes5);
        System.out.println("Cantidad de Monedas de 1€ : " + cantidadMonedas1);
                
        

    }        

}
