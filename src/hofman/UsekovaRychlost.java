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
public class UsekovaRychlost {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadejte maximální povolenou rychlost úseku v km/h.");
        float maxRychlost = sc.nextFloat();
        System.out.println("Zadejte jak dlouhý je úsek v metrech.");
        float delkaUseku = sc.nextFloat();
        
        System.out.println("Zadejte cas vjezdu do useku hodiny, minuty, sekundy a setiny.");
        float h = sc.nextFloat();
        float m = sc.nextFloat();
        float s = sc.nextFloat();
        float set = sc.nextFloat();
        
        float time = h*3600+m*60+s+set/100;
        
        System.out.println("Zadejte cas vyjezdu z useku hodiny, minuty, sekundy a setiny.");
        float fh = sc.nextFloat();
        float fm = sc.nextFloat();
        float fs = sc.nextFloat();
        float fset = sc.nextFloat();
        
        float ftime = fh*3600+fm*60+fs+fset/100;
        
        float casUseku = ftime-time;
        
        
        float rychlost = (delkaUseku/casUseku);
        System.out.println("Rychlost vozidla v daném úseku je " + Math.round(rychlost*3.6) + " km/h.");
        
        if (rychlost*3.6>maxRychlost) {
            System.out.println("Překročení max rychlosti o " + Math.round(rychlost*3.6-maxRychlost) + " km/h.");
        } else {
            System.out.println("Ukázková jízda úsekem.");
        }
        
    }
    
}
