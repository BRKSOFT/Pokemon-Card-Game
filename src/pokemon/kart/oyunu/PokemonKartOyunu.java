/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.kart.oyunu;

import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author eaqLe
 */
public class PokemonKartOyunu {
    
    /**
     *
     */
    public static ArrayList <String> kartlistesi = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random= new Random();
        Pokemon Pikachu = new Pikachu("Pikachu","Elektrik");
        Pokemon Bulbasaur=new Bulbasaur("Bulbasaur","Çim");
        Pokemon Charmander=new Charmander("Charmander","Ateş");
        Pokemon Squirtle=new Squirtle("Squirtle","Su");
        Pokemon Zubat=new Zubat("Zubat","Hava");
        Pokemon Psyduck=new Psyduck("Psyduck","Su");
        Pokemon Snorlax=new Snorlax("Snorlax","Normal");
        Pokemon Butterfree=new Butterfree("Butterfree","Hava");
        Pokemon Jigglypuff=new Jigglypuff("Jigglypuff","Ses");
        Pokemon Meowth=new Meowth("Meowth","Normal");
        Menu anaMenu=new Menu();
        
        /*Pikachu Pikachu = new Pikachu("Pikachu","Elektrik");
        Bulbasaur Bulbasaur=new Bulbasaur("Bulbasaur","Çim");
        Charmander Charmander=new Charmander("Charmander","Ateş");
        Squirtle Squirtle=new Squirtle("Squirtle","Su");
        Zubat Zubat=new Zubat("Zubat","Hava");
        Psyduck Psyduck=new Psyduck("Psyduck","Su");
        Snorlax Snorlax=new Snorlax("Snorlax","Normal");
        Butterfree Butterfree=new Butterfree("Butterfree","Hava");
        Jigglypuff Jigglypuff=new Jigglypuff("Jigglypuff","Ses");
        Meowth Meowth=new Meowth("Meowth","Normal");*/
        
        kartlistesi.add("Pikachu");
        kartlistesi.add("Bulbasaur");
        kartlistesi.add("Charmander");
        kartlistesi.add("Squirtle");
        kartlistesi.add("Zubat");
        kartlistesi.add("Psyduck");
        kartlistesi.add("Snorlax");
        kartlistesi.add("Butterfree");
        kartlistesi.add("Jigglypuff");
        kartlistesi.add("Meowth");
        Oyuncu Bilgisayar=new Bilgisayar(1,"Bilgisayar",20);
        Oyuncu Kullanici=new Kullanici(2,"Kullanici",20);
        //System.out.println(Pikachu.hasarPuani);
        //System.out.println(kartlistesi.size());
        for(int i=0;i<3;i++)
        {
            int r=random.nextInt(kartlistesi.size());
            Kullanici.kartVer((kartlistesi.get(r)));
            kartlistesi.remove((int)r);
        }
        //Kullanici.kartEsitle();
        for(int i=0;i<3;i++)
        {
            int r=random.nextInt(kartlistesi.size());
            Bilgisayar.kartVer((kartlistesi.get(r)));
            kartlistesi.remove((int)r);
        }
        //System.out.println("\n\nORTADAKİ KARTLAR:");
        /*for(int i=0;i<4;i++)
        {   
            int r=1+random.nextInt(kartlistesi.size()-1);
            Bilgisayar.kartVer((kartlistesi.get(r)));
            kartlistesi.remove((int)r);
        }*/
        
        //Kullanici.kartGoster();
        //System.out.println(Kullanici.getKartListesi(1));
        for(int i=0;i<6;i++)
            anaMenu.yolBulk(Kullanici.getKartListesi(i),i);
        for(int i=0;i<4;i++)
            anaMenu.yolBulb(kartlistesi.get(i),i);
        //Bilgisayar.kartGoster();
        //Kullanici.SkorGoster();
        //Bilgisayar.SkorGoster();
        anaMenu.setVisible(true);
    }
    
}
