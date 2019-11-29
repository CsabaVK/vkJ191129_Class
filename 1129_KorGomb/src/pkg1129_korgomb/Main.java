/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1129_korgomb;

import java.util.Scanner;

/**
 *
 * @author csabavk
 */
class GClass{
    private double sugar;

    public GClass(double sugar) {
        this.sugar = sugar;
    }
    
    public double felszin()
    {
        return (4 * Math.PI * sugar * sugar);
    }
    public double terfogat()
    {
        return ((4 * sugar * sugar * sugar * Math.PI) / 3);
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner be = new Scanner(System.in);
        
        System.out.println("Kérem a kör sugarát!");
        String sugar = be.next();
        double r = be.nextDouble();
        
        GClass g = new GClass(r);
        {
            g.felszin();
            g.terfogat();
        }
        
        System.out.println(g.felszin() + g.terfogat());
    }
    
}
