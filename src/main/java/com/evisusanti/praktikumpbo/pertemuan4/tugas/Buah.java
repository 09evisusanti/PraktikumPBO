package com.evisusanti.praktikumpbo.pertemuan4.tugas;

public class Buah {
    //Attribute
    String nama;
    String warna;
    int jml;
    
    //Method
    public void colour(){
        System.out.println("Aku membeli jeruk yang warnanya " + warna + " di toko.");
    }
    
    public void showInfo(){
        System.out.println("Satu kilo " + nama + " berisi sebanyak " + jml + "butir");
    }
}
