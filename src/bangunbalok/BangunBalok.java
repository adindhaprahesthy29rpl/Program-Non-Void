/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunbalok;

/**
 *
 * @author MOKLET-2
 */
public class BangunBalok {

    /**
     * @param args the command line arguments
     */
    // Variabel Instance
    int panjang;
    int lebar;
    int tinggi;
    int luasPermukaan;
    int volume;
    
    // Method Void Judul   
    void judul(){
        System.out.println("======================================");
        System.out.println("      PROGRAM BANGUN RUANG BALOK      ");
        System.out.println("======================================");
    }
    
    // Parameter
    void Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Method Non Void
    int panjang(){
        return panjang;
    }
        
    int lebar(){
        return lebar;
    }
    
    int tinggi(){
        return tinggi;
     }
    
    // Method Luas Permukaan
    int luasPermukaan(){
        luasPermukaan = (panjang*lebar) + (panjang*tinggi) + (lebar*tinggi);
        System.out.println("Luas Permukaan Balok Adalah : "+luasPermukaan+ " cm^2");
        return luasPermukaan;
    }
    
    // Method Void Volume
    int volume(){
        volume = panjang*lebar*tinggi;
        System.out.println("Volume Balok Adalah : "+volume+ " cm^3");
        return volume;
    }
    
    // Method Void Akhiran
    void akhiran(){
        System.out.println("=======================================");
    } 
}
    

