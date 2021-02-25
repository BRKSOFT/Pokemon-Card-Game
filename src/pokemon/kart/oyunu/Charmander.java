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
public class Charmander extends Pokemon {
    public int hasarPuani=60;
    private String dosyayolu="src\\img\\Charmander.jpeg";
    private ImageIcon resim=new ImageIcon(dosyayolu);
    public boolean kartKullanildiMi;
    public Charmander()
    {
        this.hasarPuani=60;
    }
    @Override
    public void hasarPuaniGoster() {
        System.out.println("Hasar Puani= "+this.hasarPuani); //To change body of generated methods, choose Tools | Templates.
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
    public Charmander(String PokemonAdi, String PokemonTip) {
        super(PokemonAdi, PokemonTip);
    }

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }
}
