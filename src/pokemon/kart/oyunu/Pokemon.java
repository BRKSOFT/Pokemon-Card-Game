/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.kart.oyunu;

import javax.swing.ImageIcon;

/**
 *
 * @author eaqLe
 */
public abstract class Pokemon {
    public String PokemonID;
    public String PokemonAdi;
    public String PokemonTip;
    private String dosyayolu;
    public int hasarPuani;

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    public void setResim(ImageIcon resim) {
        this.resim = resim;
    }

    public int getHasarPuani() {
        return hasarPuani;
    }

    public ImageIcon getResim() {
        return resim;
    }
    public ImageIcon resim=new ImageIcon(dosyayolu);
    abstract void hasarPuaniGoster();
    public Pokemon(String PokemonAdi,String PokemonTip)
    {
        this.PokemonAdi=PokemonAdi;
        this.PokemonTip=PokemonTip;
    }
    public void setDosyayolu(String dosyayolu) {
        this.dosyayolu = dosyayolu;
    }

    public String getDosyayolu() {
        return dosyayolu;
    }
    
    public Pokemon()
    {
        
    }
    public Pokemon(String dosyayolu)
    {
        this.dosyayolu=dosyayolu;
    }
    public String getPokemonID() {
        return PokemonID;
    }
    public void setPokemonID(String PokemonID) {
        this.PokemonID = PokemonID;
    }

    public String getPokemonAdi() {
        return PokemonAdi;
    }

    public void setPokemonAdi(String PokemonAdi) {
        this.PokemonAdi = PokemonAdi;
    }

    public String getPokemonTip() {
        return PokemonTip;
    }

    public void setPokemonTip(String PokemonTip) {
        this.PokemonTip = PokemonTip;
    }
    
}
