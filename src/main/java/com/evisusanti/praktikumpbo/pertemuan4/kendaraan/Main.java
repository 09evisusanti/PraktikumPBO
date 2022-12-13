package com.evisusanti.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //Pembuatan object
        //Class object = new Class{}
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Sepeda sp = new Sepeda();
        
        //Memasukkan nilai attribute
        mb.nama = "Mitsubishi";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        sp.nama = "Volta";
        sp.jmlRoda = 2;
        sp.dayaAngkut = 2;
        
        //Uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("kanan");
        mb.belok();
        
        System.out.println("\n");
        kn.showInfo();
        kn.nyalakanMesin();
        
        System.out.println("\n");
        sp.showInfo();
        sp.nyalakanMesin();
        sp.belok("Kanan");
        sp.belok();
    }
}
