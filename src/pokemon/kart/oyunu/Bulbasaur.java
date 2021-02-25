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
public class Bulbasaur extends Pokemon {
    public int hasarPuani=50;
    private String dosyayolu="src\\img\\Bulbasaur.jpeg";
    public ImageIcon resim=new ImageIcon(dosyayolu);
    public boolean kartKullanildiMi;
    public Bulbasaur()
    {
        this.hasarPuani=50;
    }

    public String getDosyayolu() {
        return dosyayolu;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }
    
    @Override
    public void hasarPuaniGoster() {
        System.out.println("Hasar Puani= "+this.hasarPuani); //To change body of generated methods, choose Tools | Templates.
    }
    public Bulbasaur(String PokemonAdi, String PokemonTip) {
        super(PokemonAdi, PokemonTip);
    }

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }
}
