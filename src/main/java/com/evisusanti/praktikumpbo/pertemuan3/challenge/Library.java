package com.evisusanti.praktikumpbo.pertemuan3.challenge;

public class Library {
    private String name;
    private int visitorsToday;
    private int yearBuilt;
    
    public Library(){}

    public Library(String name, int visitorsToday, int yearBuilt) {
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }
    
    public void showProfile(){
        System.out.println("Name : " + name);
        System.out.println("Visit Today : " + visitorsToday);
        System.out.println("Year Built : " + yearBuilt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }    
}
