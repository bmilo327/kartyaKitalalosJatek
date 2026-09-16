/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    static String[] pakli = new String[22];
    
    public static void main(String[] args) {
        pakliFeltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
            kever();
        }
        ezVolt();
    }
    
    public static void kirak(){
        for (int i = 0; i < pakli.length; i++) {
            System.out.println(pakli[i]);
        }
    }
    
    public static void melyik(){
        
    }
    
    public static void kever(){
     
    }
    
    public static void ezVolt(){
        
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
