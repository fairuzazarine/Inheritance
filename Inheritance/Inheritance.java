
package Inheritance;


public class Inheritance {

    
    public static void main(String[] args) {
        BangunDatar bangundatar = new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        Segitiga Segitiga = new Segitiga();
        Segitiga.alas = 12;
        Segitiga.tinggi = 8;
        
        bangundatar.luas();
        bangundatar.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        Segitiga.luas();
        Segitiga.keliling();
      
        
        
    }
    
}
