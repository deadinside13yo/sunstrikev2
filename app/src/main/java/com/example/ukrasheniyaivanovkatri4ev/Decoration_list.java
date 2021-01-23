package com.example.ukrasheniyaivanovkatri4ev;

public class Decoration_list {
    private int Icon;
    private String Decoration;
    private int Count;

    public Decoration_list (int icon,  String decoration, int count) {
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

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }


}
