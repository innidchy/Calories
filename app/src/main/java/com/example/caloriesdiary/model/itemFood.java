package com.example.caloriesdiary.model;

public class itemFood {
    private String food;
    private int cal;
    private String date;
    public itemFood(String food,int cal,String date){
        this.food = food;
        this.cal = cal;
        this.date = date;
    }
    public String getFood(){
        return food;
    }

    public int getCal() {
        return cal;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return food;
    }
}
