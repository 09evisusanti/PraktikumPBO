package com.evisusanti.praktikumpbo.pertemuan4.kendaraan;

public class Sepeda extends Kendaraan {
    String nama;
    int jmlRoda;
    int dayaAngkut;
    
    public void nyalakanMesin(){
        System.out.println("Mesin " + nama + " telah dinyalakan!");
    }
    
    public void showInfo(){
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Jumlah Roda : " + jmlRoda);
        
        extraInfo();
    }
    
    public void extraInfo(){
        System.out.println("Tipe Kendaraan : Sepeda");
    }
    
    public void belok(String arah){
        System.out.println("Mobil " + nama + " belok ke" + arah + "!");
    }
    
    public void belok(){
        System.out.println("Error : Harap masukkan arah belok! (Kanan / Kiri)");
    }
}
