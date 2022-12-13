//Package merupakan sebuah folder yang berisi sekumpulan program java.
//Biasanya nama package mengikuti nama domain dari si pembuat programnya.
package com.evisusanti.praktikumpbo.pertemuan2;

//Library merupakan sekumpulan class & fungsi yg bisa digunakan dalam membuat program
import java.util.Scanner; 

public class Input { //Blok class, dapat diisi dengan method & variabel
    public static void main(String[] args) { //Method main
        String nama, jurusan;
        int nim;
        
        Scanner input = new Scanner(System.in); //Fungsinya untuk mempersingkat pengetikan
        
        System.out.println("---Selamat Datang di Halaman Login Mahasiswa---");
        System.out.println("---Silahkan input data diri anda");
        System.out.println("");
        
        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();
        
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();
        
        System.out.print("NIM : ");
        nim = input.nextInt();
        
        System.out.println("-----------------------");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("NIM : " + nim);
        
        System.out.println("");
        System.out.println("Terimakasih, data anda telah berhasil disimpan!");
       
    }
}
