/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.kart.oyunu;

import java.util.ArrayList;

/**
 *
 * @author eaqLe
 */
public class Bilgisayar extends Oyuncu{
    
    public Bilgisayar(int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor=60);
    }
    @Override
    public void kartGoster()
    {
        System.out.println("Bilgisayar:");
        System.out.println(kartListesi.get(0));
        System.out.println(kartListesi.get(1));
        System.out.println(kartListesi.get(2)); 
    }
    public Bilgisayar()
    {
        
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    /**
     *
     * @return
     */
    @Override
    public int getSkor() {
        return Skor;
    }

    @Override
    public String getKartListesi(int i) {
        return kartListesi.get(i).toString();
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
    
    
}
