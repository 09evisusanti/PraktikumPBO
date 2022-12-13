//Package merupakan sebuah folder yang berisi sekumpulan program java.
//Biasanya nama package mengikuti nama domain dari si pembuat programnya.
package com.evisusanti.praktikumpbo.pertemuan2;

//Library merupakan sekumpulan class & fungsi yg bisa digunakan dalam membuat program
import java.util.Scanner;

public class Conditions { //Blok class, dapat diisi dengan method & variabel
    public static void main(String[] args) { //Method main
        Scanner input = new Scanner(System.in); //Fungsinya untuk mempersingkat pengetikan
        
        System.out.print("Masukkan bilangan bulat : ");
        int bilangan = input.nextInt();
        
       //Kondisi If Else
        if(bilangan > 0)
            System.out.println(bilangan + " adalah bilangan positif!");
        
        else if(bilangan < 0)
            System.out.println(bilangan + " adalah bilangan negatif!");
        
        else
            System.out.println(bilangan + " adalah nol!");
    }
}
