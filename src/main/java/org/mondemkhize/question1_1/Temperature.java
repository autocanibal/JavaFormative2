package org.mondemkhize.question1_1;

import java.text.DecimalFormat;

public class Temperature {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        double fahrenheit = 62.5;
        double celsius = f2c(fahrenheit);
        System.out.println(fahrenheit + "°F = "+df.format(celsius)+"°C");
    }
    static double f2c(double fahr){
        return (fahr -32)*5/9;
    }
}