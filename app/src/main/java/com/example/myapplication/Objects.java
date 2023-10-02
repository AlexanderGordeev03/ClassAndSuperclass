package com.example.myapplication;

import android.util.Log;

public class Objects extends Mathematical {
    int price;
    String Name;
    public void character(){
        Log.i("character()", "It's a "+Name+", it can do "+functionality+" operations and costs "+ price + " rub");
    }
}
