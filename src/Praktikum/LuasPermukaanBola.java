/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author DANYAV
 */
public class LuasPermukaanBola {
    public static void main(String[] args) {
        System.out.println("Masukkan Jari Jari Bola : ");
        Scanner masukan = new Scanner(System.in);
        double jari = masukan.nextDouble();
        System.out.println("Luas Permukaan Bola = " + 4*3.14*jari*jari);
    }
    
}
