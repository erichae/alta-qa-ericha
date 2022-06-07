/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author ASUS
 */
public class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi){
       this.sisi = sisi;
    }

    @Override
    double luas(){
       return sisi * sisi;
    }

    @Override
    double keliling(){
       return 4 * sisi; 

    
   
}
    
}
