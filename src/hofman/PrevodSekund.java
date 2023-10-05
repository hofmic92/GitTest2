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
public class PrevodSekund {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadejte pocet hodin.");
        int h = sc.nextInt();
        System.out.println("Zadejte pocet minut.");
        int m = sc.nextInt();
        System.out.println("Zadejte pocet sekund.");
        int s = sc.nextInt();
        int c = h*3600+m*60+s;
        System.out.format("Celkový čas v sekundách: %d%n", c);
        
        
        System.out.println("Napište čas v sekundách.");
        int s2 = sc.nextInt();
        int h2 = s2/3600;
        int m2 = (s2%3600)/60;
        int s3 = ((s2%3600)%60);
        System.out.format("Cas: %dh:%dm:%ds%n",h2, m2, s3);
    }
    
}
