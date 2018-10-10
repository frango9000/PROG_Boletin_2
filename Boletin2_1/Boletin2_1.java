/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin2_1;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Boletin2_1 {
    
     
    public static void main(String[] args) {
        Scanner scanpPagado = new Scanner(System.in);
        Scanner scanpTarifa = new Scanner(System.in);
        System.out.println("Introduce el importe pagado: ");
        float pPagado = scanpPagado.nextFloat();
        System.out.println("Introduce el precio tarifa: ");
        float pTarifa = scanpTarifa.nextFloat();
        float descuento = 100 - (( pPagado / pTarifa ) * 100 );
                
        System.out.println("Descuento: " + descuento + "%");
        
    }
}
