package com.evisusanti.praktikumpbo.pertemuan5.tugas;

import java.util.Scanner;

public class Novel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Membuat agar panjang array ditentukan input user
        System.out.println("-- Program Input Judul Novel --");
        System.out.print("Masukkan jumlah novel : ");
        int jml = input.nextInt();
        System.out.println();
        
        //Membuat array baru dengan panjang sesuai input user
        String[] judul = new String[jml];
        
        //Masukkan nilai ke array
        for(int i=0; i<jml; i++){
            System.out.print("Masukkan novel ke- " + (i+1) + ": ");
            judul[i] = input.next();
        }
        System.out.println();
        
        //Menampilkan semua nilai array
        System.out.println("-- Daftar Judul Novel --");
        for(int i=0; i<jml; i++){
            System.out.println(i + ": " + judul[i]);
        }
    }
}
