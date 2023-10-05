/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HofmanJan;

import java.util.Scanner;

/**
 *
 * @author hofmi
 */
public class UroceniVkladu {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadej počáteční kapitál.");
        double k = sc.nextDouble();
        System.out.println("Roční úročení.");
        double u = sc.nextDouble();
        System.out.println("Počet let.");
        double n = sc.nextDouble();
        System.out.println("Hodnota (Přípis za rok)");
        double m = sc.nextDouble();
        
        k = k * (Math.pow(1+u/100/m, n*m));
        System.out.println("Celkový kapitál bude " + Math.round(k) + " Kč.");
    }
    
}
