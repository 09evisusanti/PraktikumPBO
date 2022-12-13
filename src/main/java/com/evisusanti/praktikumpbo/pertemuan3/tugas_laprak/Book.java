package com.evisusanti.praktikumpbo.pertemuan3.tugas_laprak;

public class Book {
    String nama_buku;
    int halaman;
    String penulis;
    
    public Book(){}

    public Book(String nama_buku, int halaman, String penulis) {
        this.nama_buku = nama_buku;
        this.halaman = halaman;
        this.penulis = penulis;
    }

    //Method mencetak semua attribute
    public void showProfile(){
        System.out.println("Nama Buku : " + nama_buku);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Penulis : " + penulis);
    }
}
