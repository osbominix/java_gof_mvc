package com.gof.designpattern.mvc;

/**
 * Created by yl3 on 20.12.15.
 */
public class View {

    public void output(String smartphoneType, String price) {

        System.out.println("***************************************");
        System.out.println("* Smartphone Type: " + smartphoneType);
        System.out.println("* Smartphone Price: " + price);
        System.out.println("***************************************");
        System.out.println();
        System.out.println();

    }
}
