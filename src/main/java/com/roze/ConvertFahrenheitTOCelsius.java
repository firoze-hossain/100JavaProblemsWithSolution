package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze convert Fahrenheit to Celsius
 */
public class ConvertFahrenheitTOCelsius {

    public static void main(String[] args) {
        float temperature;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Farenheit : ");
        temperature = sc.nextInt();
        temperature = ((temperature - 32) * 5) / 9;
        System.out.println("Temperature in Celcius: " + temperature);

    }
}
