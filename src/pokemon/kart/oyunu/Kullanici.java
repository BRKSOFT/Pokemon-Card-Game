/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.kart.oyunu;

import java.util.ArrayList;
import java.lang.String;

/**
 *
 * @author eaqLe
 */
public class Kullanici extends Oyuncu {
   
    
    public Kullanici(int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor=50);
    }
    public void kartGoster()
    {
        
        System.out.println("\n\nKullanici: ");
        System.out.println(this.kartListesi.get(1));
        //kartlar[1]=kartListesi.get(1).toString();
        /*System.out.println(kartlar[0]);
        System.out.println(kartlar[1]);
        System.out.println(kartlar[2]);*/
    }
    
    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

    public void setKartListesi(ArrayList kartListesi) {
        this.kartListesi = kartListesi;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    @Override
    public String getKartListesi(int i) {
        //System.out.println("asdasd"+kartListesi);
        return kartListesi.get(i).toString();
    }
    
    public Kullanici()
    {
        
    }
           
    
}
