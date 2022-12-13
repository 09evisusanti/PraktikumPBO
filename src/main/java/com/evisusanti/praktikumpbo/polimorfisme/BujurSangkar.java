package com.evisusanti.praktikumpbo.polimorfisme;

public class BujurSangkar extends PersegiPanjang {
   protected double sisi;
   
   public BujurSangkar(double panjang){
       super(panjang, panjang);
   }
   
   public void display(){
       System.out.println("Luas dan Keliling Bujur Sangkar : ");
       System.out.println("Luas : " + super.luas());
       System.out.println("Keliling : " + super.keliling());
   }
}
