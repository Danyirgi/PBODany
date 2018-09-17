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
public class BiodataDiri {
    public static void main(String[] args) {
        String Nama,TempatLahir, Tgllahir,jenisk,alamatmlg,motto;
        int NIS;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda : ");
        Nama = masukan.next();
        System.out.println("Masukkan NIS Anda : ");
        NIS = masukan.nextInt();
        System.out.println("Masukkan Tempat Lahir Anda : ");
        TempatLahir = masukan.next();
        System.out.println("Masukkan Tanggal Lahir Anda : ");
        Tgllahir = masukan.next();
        System.out.println("Masukkan Jenis Kelamin Anda : ");
        jenisk = masukan.next(); 
        System.out.println("Masukkan Alamat di Malang Anda : ");
        alamatmlg = masukan.next();
        System.out.println("Masukkan Motto Anda : ");
        motto = masukan.next(); 
        
    }
}
