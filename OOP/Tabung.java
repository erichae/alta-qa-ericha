/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author ASUS
 */
public class Tabung extends BangunDatar {
    double jarijari, tinggi;

    public Tabung(double jarijari, double tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }
    
    @Override
    double volume(){
        return 3.14 * (jarijari * jarijari) * tinggi;
    }
}