/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author DANYAV
 */
public class KonversiSuhu {
    public static void main(String[] args) {
    double celcius = 78.0;
        System.out.println("Suhu dalam celcius "+ celcius);
    
    double reamur = Double.valueOf(celcius * 0.8);
      System.out.println("Suhu dalam reamur : "+ reamur);
        
    double fahrenheit = Double.valueOf(celcius * 1.8 + 32);
      System.out.println("Suhu dalam fahrenheit : "+ fahrenheit);
      
    double kelvin = Double.valueOf(celcius + 273.15);
      System.out.println("Suhu dalam kelvin : "+ kelvin);
    
    
    }
}
