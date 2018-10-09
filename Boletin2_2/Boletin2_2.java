/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin2_2;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Boletin2_2 {
    
        public static void main(String[] args) {
        Scanner scanCelcius = new Scanner(System.in);
        System.out.println("Introduce la temperatura en grados Celcius: ");
        float tempCelcius = scanCelcius.nextFloat();
        
        float tempFarenheit = ( ( tempCelcius * 9 ) / 5 ) + 32;
        float tempKelvin = tempCelcius + 273.15f;
                
        System.out.println(tempCelcius + "ºC");
        System.out.println(tempFarenheit + "ºF");
        System.out.println(tempKelvin + "ºK");
        
    }
    
}
