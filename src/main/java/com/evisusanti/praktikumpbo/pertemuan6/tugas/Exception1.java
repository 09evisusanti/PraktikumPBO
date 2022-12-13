package com.evisusanti.praktikumpbo.pertemuan6.tugas;

public class Exception1 {
    public static void main(String[] args) {
        try{
        Object[] array = new String[3];
        array[0] = 8;
        }catch(ArrayStoreException e){
            e.printStackTrace();
        }
        System.out.println("Terus Running...");
    }
}
