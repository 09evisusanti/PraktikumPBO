//Package merupakan sebuah folder yang berisi sekumpulan program java.
//Biasanya nama package mengikuti nama domain dari si pembuat programnya.
package com.evisusanti.praktikumpbo.pertemuan2; //Deklarasi package

public class Variabels { //Blok class, dapat diisi dengan method & variabel
    //'main' + tab
    //'main()' memiliki parameter 'args[]' untuk menyimpan nilai dari argumen command line
    public static void main(String[] args) { //Method main
        String nama = "Evi Susanti";
        int usia = 19;
        
        //'sout' + tab
        //Fungsi untuk menampilkan teks ke layar monitor
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
    }
}
