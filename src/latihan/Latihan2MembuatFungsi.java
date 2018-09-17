/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author DANYAV
 */
public class Latihan2MembuatFungsi {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int pilihan=9;
        do {
            System.out.println("\nMENU LUAS BANGUN");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung Luas Persegi panjang");
            System.out.println("3. Keluar");
            System.out.println("Masukkan Pilihan Anda : ");
            pilihan = masukan.nextInt();
               switch(pilihan) {
                    case 1 : LuasPersegi();break;
                    case 2 : LuasPersegiPanjang();break;
    }
    }while(pilihan != 3);
    }
    private static void LuasPersegi(){
            Scanner masukan = new Scanner(System.in);
            float sisi , luas;
            System.out.print("masukkan nilai sisi : ");
            sisi = masukan.nextFloat();
            luas = sisi * sisi;
            System.out.println("Luas Persegi adalah : "+ luas);
    }
    private static void LuasPersegiPanjang(){
        Scanner masukan = new Scanner(System.in);
        float panjang, lebar, luas;
        System.out.println("Masukkan nilai panjang : ");
        panjang = masukan.nextFloat();
        System.out.println("Masukkan nilai lebar : ");
        lebar = masukan.nextFloat();
        luas = panjang* lebar;
        System.out.println("Luas Persegi Panjang adalah: "+luas);
    }
}
        
    
    

