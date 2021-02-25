/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.kart.oyunu;

import java.util.ArrayList;
import static pokemon.kart.oyunu.PokemonKartOyunu.kartlistesi;

/**
 *
 * @author eaqLe
 */
public abstract class Oyuncu {
    public int oyuncuID;
    public String oyuncuAdi;
    public int Skor;
    public static ArrayList kartListesi=new ArrayList();
        
    public Oyuncu(int oyuncuID,String oyuncuAdi,int Skor)
    {
        this.oyuncuID=oyuncuID;
        this.oyuncuAdi=oyuncuAdi;
        this.Skor=Skor;
    }
    public void kartVer(String i){
        //System.out.println(i);
        this.kartListesi.add(i);
        //System.out.println(i);
    }
    
    public String getKartListesi(int i) {
        return kartListesi.get(i).toString();
    }

    public void setKartListesi(ArrayList kartListesi) {
        this.kartListesi = kartListesi;
    }
    
    public void kartGoster()
    {
        System.out.println(kartListesi.get(1));
    }
    public void SkorGoster()
    {
        System.out.println("Skor:"+this.Skor);
    }
    public void kartSec()
    {
        
    }
    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
    
}
