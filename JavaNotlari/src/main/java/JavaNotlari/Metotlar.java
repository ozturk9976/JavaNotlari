/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaNotlari;
import java.util.Scanner;

/**
 *
 * @author Hamza
 */
//Metotlar 13
public class Metotlar {
    public static void main(String[] args){
    
    faktoriyel();
    
    }
    
    public static void faktoriyel(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Lütfen bir sayı giriniz");
    int sayi = scan.nextInt();
    int faktoriyel =1;
    
        while (sayi > 0){
        faktoriyel *= sayi;
        sayi--;
        
        }
        System.out.println("Faktoriyel " + faktoriyel);
            
   
    }
    
    
        
}




