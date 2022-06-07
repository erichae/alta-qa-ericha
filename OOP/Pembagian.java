/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pembagian {
   //fungsi
 
    public static int Bagi (int a, int b){
 
    return(a / b);
 
}
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukan nilai A : ");
 
        int a=input.nextInt();
 
        System.out.print("Masukan nilai B : ");
 
        int b=input.nextInt();
 
        System.out.println("==================");
 
        System.out.println("Hasil Pembagian : "+Bagi(a, b));
 
 
    }
    
}
