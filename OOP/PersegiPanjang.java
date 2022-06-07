
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    double luas(){
        return panjang * lebar;
    }

    @Override
    double keliling(){
    return 2 * (panjang + lebar);
    }
    
}

