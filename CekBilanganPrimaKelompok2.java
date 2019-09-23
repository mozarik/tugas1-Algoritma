/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekbilanganprimakelompok2;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class CekBilanganPrimaKelompok2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka yang akan di cek: ");
        
        long angka = input.nextLong();
        long hasilMod;   //hasilMod diigunakan untuk melihat apakah angka tersebut habis dibagi oleh pembaginya 
        boolean prima = true;
        
        for(int pembagi = 2 ; pembagi <= 2 ; pembagi++){    //dalam hal ini pembagi dimulai dari angka 2 karena bil. prima
            hasilMod = angka % pembagi; //pengecekan apakah angka yang diinputkan habis dibagi pembaginya atau tidak
            if (hasilMod == 0){ //bila habis atau sama dengan nol,
                prima = false;  //maka nilai boolean prima berubah jadi false,
                break;   // dan looping akan berhenti (break)
            }
        } 
        
        if (prima && ((angka > 0)&&(angka != 1)))   //bila angka tersebut prima dan lebih dari nol dan tidak sama dengan 1,
            System.out.println(angka + " adalah bilangan prima");   //maka program akan membaca angka tersebut adalah bil. prima
        else 
            System.out.println(angka + " bukanlah bilangan prima"); //bila tidak, maka sebaliknya

    }
    
}
