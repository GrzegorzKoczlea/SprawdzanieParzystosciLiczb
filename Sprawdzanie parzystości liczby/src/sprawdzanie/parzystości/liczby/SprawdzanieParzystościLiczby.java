/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprawdzanie.parzystości.liczby;

import java.util.Scanner;

/**
 *
 * @author Informatyka
 */
public class SprawdzanieParzystościLiczby {
    
    public static float SprawdzParzystosc(int argument)
    {
//        float wynik =   argument % 2;
//        return wynik;
        return argument % 2;
    }
    
    public static void WypiszWynik(float wynik_z_dzielenia)
    {
        if(wynik_z_dzielenia != 0)
        {
            System.out.println("Liczba nie jest parzysta");
        }
        else
        {
            System.out.print("Liczba jest parzysta");   
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Podaj liczbę: ");
        int podana_liczba;
        Scanner scanner = new Scanner(System.in);
        podana_liczba = scanner.nextInt();
        float wynik_z_dzielenia;
        
        wynik_z_dzielenia = SprawdzParzystosc(podana_liczba);
        WypiszWynik(wynik_z_dzielenia);

                
       if(podana_liczba == 5)
       {
            System.out.println("Podałeś liczbę 5");
       }
       else if(podana_liczba == 10)
       {
             System.out.println("Podałeś liczbę 10");
       }
       else if(podana_liczba == 15)
       {
            System.out.println("Podałeś liczbę 15");
       }
       else
           System.out.println("Podałeś inną liczbę");
    }
    
}
