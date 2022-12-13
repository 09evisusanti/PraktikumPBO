package com.evisusanti.praktikumpbo.pertemuan3.animal;

public class Animal {
    //Attribute
    private String name;
    private int age;
    private String color;
    
    //name disamping this merujuk ke attribute, name disamping sama dengan merujuk parameter
    //Constructor
    public Animal(){}
    
    //[Alt] + [Insert] -> Constructor -> Select All
    public Animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    //Method mencetak semua attribute
    public void showProfile(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + " years old");
        System.out.println("Color : " + color);
    }
    
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getColor() {
      return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
}
