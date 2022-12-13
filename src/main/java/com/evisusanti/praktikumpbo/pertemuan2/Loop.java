//Package merupakan sebuah folder yang berisi sekumpulan program java.
//Biasanya nama package mengikuti nama domain dari si pembuat programnya.
package com.evisusanti.praktikumpbo.pertemuan2; //Deklarasi package

public class Loop { //Blok class, dapat diisi dengan method & variabel
    //'main()' memiliki parameter 'args[]' untuk menyimpan nilai dari argumen command line
    public static void main(String[] args) { 
        // While
        int j = 1;
        while(j <= 100) {
          System.out.println("Loading... (" + j + "%)");
          j += 10;

          if(j == 50) {
            System.out.println("Udah ah, capek!");
            break;
          }
        }
        System.out.println("Looping While selesai! \n");
    }
}
