/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatar{
    float alas, tinggi;

    public Segitiga(float alas, float tinggi){
       this.alas = alas;
       this.tinggi = tinggi;
    }

    @Override
    double luas(){
       return alas * tinggi * 1/2;
    }
    
    @Override
    double keliling(){
       return (double) alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }   
    
}
