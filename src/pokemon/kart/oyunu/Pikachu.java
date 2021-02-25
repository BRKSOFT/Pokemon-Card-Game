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
public class Pikachu extends Pokemon{
    public int hasarPuani=40;
    private String dosyayolu="src\\img\\Pikachu.jpeg";
    private ImageIcon resim=new ImageIcon(dosyayolu);
    public boolean kartKullanildiMi;
    /**
     *
     */
    public void hasarPuaniGoster() {
        System.out.println("Hasar Puani= "+this.hasarPuani); //To change body of generated methods, choose Tools | Templates.
    }
    public Pikachu(String PokemonAdi, String PokemonTip) {
    super(PokemonAdi, PokemonTip);
    }
    public Pikachu()
    {
        
    }

    public void setDosyayolu(String dosyayolu) {
        this.dosyayolu = dosyayolu;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public String getDosyayolu() {
        return dosyayolu;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }
    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }
    
}
