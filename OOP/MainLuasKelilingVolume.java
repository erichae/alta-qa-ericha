/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author ASUS
 */
public class MainLuasKelilingVolume {
    public static void main(String[] args) {
        BangunDatar bangun_datar = new BangunDatar();
        PersegiPanjang persegi_panjang = new PersegiPanjang(7,8);
        Persegi persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga(3,4);
        Balok balok = new Balok (3,6,10);
        Kubus kubus = new Kubus (10);
        Tabung tabung = new Tabung (7,10);

        bangun_datar.luas();
        System.out.println("Luas Persegi Panjang : "+persegi_panjang.luas());
        System.out.println("Luas Segitiga : "+segitiga.luas());
        System.out.println("Luas Persegi : "+persegi.luas());

        System.out.println("");

        bangun_datar.keliling();
        System.out.println("Keliling Persegi Panjang : "+persegi_panjang.keliling());
        System.out.println("Keliling Segitiga : "+segitiga.keliling());
        System.out.println("Keliling Persegi : "+persegi.keliling());

        System.out.println("");

        bangun_datar.volume();
        System.out.println("Volume Balok :"+balok.volume());
        System.out.println("Volume Kubus :"+kubus.volume());
        System.out.println("Volume Tabung :"+tabung.volume());
    }
}
