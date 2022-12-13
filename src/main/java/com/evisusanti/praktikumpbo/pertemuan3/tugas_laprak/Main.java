package com.evisusanti.praktikumpbo.pertemuan3.tugas_laprak;

public class Main {
    public static void main(String[] args) {
        Book komik = new Book("Doraemon", 184, "Fujiko");
        Book novel = new Book("Peter", 176, "Risa Saraswati");
        Book dongeng = new Book("Timun Emas", 24, "Dede Firmansyah");
        
        //Memanggil Method
        komik.showProfile();
        System.out.println("-----------------");
        novel.showProfile();
        System.out.println("-----------------");
        dongeng.showProfile();
    }
}
