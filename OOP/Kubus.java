/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author ASUS
 */
public class Kubus extends BangunDatar {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    double volume(){
        return sisi * sisi * sisi;
    }

    
    
}
