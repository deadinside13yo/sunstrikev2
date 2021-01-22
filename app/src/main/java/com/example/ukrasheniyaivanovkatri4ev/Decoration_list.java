package com.example.ukrasheniyaivanovkatri4ev;

public class Decoration_list {
    private int Icon;
    private String Decoration;
    private double Count;

    public Decoration_list (int icon,  String decoration, double count) {
        Icon = icon;

        Decoration = decoration;
        Count = count;
    }


    public int getIcon() {
        return Icon;
    }

    public void setIcon(int icon) {
        Icon = icon;
    }

    public String getDecoration() {
        return Decoration;
    }

    public void setDecoration(String decoration) {
        Decoration = decoration;
    }

    public double getCount() {
        return Count;
    }

    public void setCount(double count) {
        Count = count;
    }



}
