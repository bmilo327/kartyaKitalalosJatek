/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    static String[] pakli = new String[22];
    static Scanner scr = new Scanner(System.in);
    
    public static void main(String[] args) {
        pakliFeltolt();
        for (int i = 0; i < 3; i++) {
            kirak(pakli);
            int tipp = melyik();
            kever(tipp);
        }
        ezVolt();
    }
    
    public static void kirak(String[] lista){
        for (int i = 1; i < lista.length; i++) {
            System.out.print(lista[i] + "\t");
            if (i % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public static int melyik(){
        System.out.print("Melyik oszlopban van a kiválasztott lap?: ");
        int tipp = scr.nextInt();
        while (tipp < 1 || tipp > 3) {            
            System.out.print("1-3 közötti értéket adj meg: ");
            tipp = scr.nextInt();
        }
        System.out.println();
        return tipp;
    }
    
    public static void kever(int tipp){
        String[] ujPakli = new String[22];
        
        switch (tipp) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                   ujPakli[i]= pakli[20-((i-1)*3)];
                   ujPakli[i+7]= pakli[19-((i-1)*3)];
                   ujPakli[i+14]= pakli[21-((i-1)*3)];
                }
                break;
            case 2: 
                for (int i = 1; i <= 7; i++) {
                   ujPakli[i]= pakli[19-((i-1)*3)];
                   ujPakli[i+7]= pakli[20-((i-1)*3)];
                   ujPakli[i+14]= pakli[21-((i-1)*3)]; 
                }
                break;
            case 3: 
                for (int i = 1; i <= 7; i++) {
                   ujPakli[i]= pakli[20-((i-1)*3)];
                   ujPakli[i+7]= pakli[21-((i-1)*3)];
                   ujPakli[i+14]= pakli[19-((i-1)*3)];
                }
                break;
            default:
                throw new AssertionError();
        }
        pakli = ujPakli;       
    }
    
    public static void ezVolt(){
        System.out.println("A " + pakli[11] + " lapott válsztottad");
    }
    
    public static String[] pakliFeltolt(){
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int db = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                if (db < 21) {
                   pakli[++db]=szin + " "  + ertek; 
                }
            }
        }
        return pakli;
    }
}
