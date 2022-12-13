package com.evisusanti.praktikumpbo.pertemuan4.tugas;

public class Main {
    public static void main(String[] args) {
        // Pembuatan Object 
            Jeruk jr = new Jeruk(); 
            Buah bu = new Buah(); 
            Mangga mg = new Mangga(); 
 
        // Isi Nilai Attribute 
            jr.nama = "Jeruk"; 
            jr.jml = 5; 
            jr.warna = "Orange"; 
            jr.vitamin = "C"; 
 
            bu.nama = "Alpukat"; 
            bu.warna = "Hijau"; 
            bu.jml = 1; 
 
            mg.nama = "Mangga"; 
            mg.jml = 3; 
            mg.warna = "Hijau"; 
            mg.vitamin = "C"; 
            
            //Memanggil Method
            jr.colour(); 
            jr.showInfo(); 
            jr.khasiat(); 
            jr.extraInfo(); 
            
            System.out.println("\n");
            bu.colour(); 
            bu.showInfo();
            
            System.out.println("\n");
            mg.colour(); 
            mg.showInfo(); 
            mg.khasiat(); 
            mg.extraInfo(); 
    }
}
