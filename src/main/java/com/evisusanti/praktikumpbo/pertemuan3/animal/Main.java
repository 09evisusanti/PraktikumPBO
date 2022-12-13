package com.evisusanti.praktikumpbo.pertemuan3.animal;

public class Main {
    // 'main' + [Tab]
    public static void main(String[] args) {
        //Membuat object dari class Animal
        Animal cat = new Animal("Miaw", 3, "Black");
        Animal dog = new Animal("Puppy", 4, "Brown");
        Animal rabbit = new Animal("Chio", 2, "White");
        
        /*
        //Mengisi nilai attribute object 'cat'
        cat.name = "Miaw";
        cat.age = 3;
        cat.color = "Black";
        
        //Mengisi nilai attribute object 'dog'
        dog.name = "Puppy";
        dog.age = 4;
        dog.color = "Brown";
        
        //Mengisi nilai attribute object 'rabbit'
        rabbit.name = "Chio";
        rabbit.age = 2;
        rabbit.color = "White";
        */
                
        //Memanggil Method
        cat.showProfile();
        System.out.println("-----------------");
        dog.showProfile();
        System.out.println("-----------------");
        rabbit.showProfile();
    }
}
