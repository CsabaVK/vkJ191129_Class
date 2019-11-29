/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1129_gcjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author csabavk
 */
class DClass{

    private String vNev;
    private String kNev;
    private int gyerekSzam;
    private int szulEv;

    public DClass(String vNev, String kNev, int gyerekSzam, int szulEv) {
        this.vNev = vNev;
        this.kNev = kNev;
        this.gyerekSzam = gyerekSzam;
        this.szulEv = szulEv;
    }
    
    public int csaladiPotlek()
    {
        int csp = 0;
        if (gyerekSzam == 1) {
            csp = 12200;
        }
        if (gyerekSzam == 2) {
            csp = 13400 * gyerekSzam;
        }
        if (gyerekSzam > 3) {
            csp = 16000 * gyerekSzam;
        }
        return csp;
    }
    
    public String nyugdij()
    {
        String uzenet = "";
        
        DateFormat formatum = new SimpleDateFormat("yyyy");
        Date aktdatum = new Date();
        
        int aktEv = Integer.parseInt(formatum.format(aktdatum));
        
        int hanyEves = aktEv - szulEv;
        if (hanyEves >= 63) {
            uzenet = "Ön már nyugdíjas!";
        }
        else {uzenet = "A nyugdíjig ennyi éve van: " + (63 - hanyEves);}
        
        return uzenet;
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner be = new Scanner(System.in);
        
        System.out.println("Kérem a vezetéknevét!");
        String vNev = be.next();
        
        System.out.println("Kérem a keresztnevét!");
        String kNev = be.next();
        
        System.out.println("Kérem a gyerekszámot!");
        int gyerekSzam = be.nextInt();
        
        System.out.println("Kérem a Születési évét!");
        int szulEv = be.nextInt();
        
        //PÉLDÁNYOSÍTÁS
        DClass d = new DClass(vNev, kNev, gyerekSzam, szulEv);
        
        System.out.println("Családi potlék: " + d.csaladiPotlek());
        System.out.println(d.nyugdij());
    }
    
}
