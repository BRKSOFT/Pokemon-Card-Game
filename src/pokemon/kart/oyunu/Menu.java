/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.kart.oyunu;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import static javax.swing.UIManager.getIcon;
import static javax.swing.text.StyleConstants.getIcon;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pokemon.kart.oyunu.PokemonKartOyunu.kartlistesi;

/**
 *
 * @author eaqLe
 */
public class Menu extends javax.swing.JFrame {
    Pokemon pokemon = new Pokemon() {
        @Override
        void hasarPuaniGoster() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    
    };
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
    Oyuncu Kullanici = new Kullanici();
    Oyuncu Bilgisayar = new Bilgisayar();
    int bilgisayar=0;
    int kullanici=0;
    public int b1hasar;
    public int b2hasar;
    public int b3hasar;
    public int b4hasar;
    public int b5hasar;
    public int b6hasar;
    public int b7hasar;
    public int b8hasar;
    public int b9hasar;
    public int b10hasar;
    public int hasar;
    public int yerdenkartal;
    int yok1=0;
    int yok2=0;
    int yok3=0;
    int yok4=0;
    int yok5=0;
    int yok6=0;
    int yok7=0;
    int yok8=0;
    int yok9=0;
    int yok10=0;
    int yerdekikartsayisi=4;
    public int kartat=2;
    boolean turu= true;
    int acilankart=0;
    int kartverdi=0;
    public static String dosyaYolu;
    public void yolBulk(String gelen,int i)
    {
        if(gelen.equals("Pikachu"))
            dosyaYolu=Pikachu.getDosyayolu();
        else if(gelen.equals("Bulbasaur"))
            dosyaYolu=Bulbasaur.getDosyayolu();
        else if(gelen.equals("Charmander"))
            dosyaYolu=Charmander.getDosyayolu();
        else if(gelen.equals("Squirtle"))
            dosyaYolu=Squirtle.getDosyayolu();
        else if(gelen.equals("Zubat"))
            dosyaYolu=Zubat.getDosyayolu();
        else if(gelen.equals("Psyduck"))
            dosyaYolu=Psyduck.getDosyayolu();
        else if(gelen.equals("Snorlax"))
            dosyaYolu=Snorlax.getDosyayolu();
        else if(gelen.equals("Butterfree"))
            dosyaYolu=Butterfree.getDosyayolu();
        else if(gelen.equals("Jigglypuff"))
            dosyaYolu=Jigglypuff.getDosyayolu();
        else if(gelen.equals("Meowth"))
            dosyaYolu=Meowth.getDosyayolu();
        ImageIcon imageimiz=new ImageIcon(dosyaYolu);
        Image img1=imageimiz.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth()+1,jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageicon=new ImageIcon(img2);
        if(gelen.equals("Pikachu"))
            hasar=Pikachu.getHasarPuani();
        else if(gelen.equals("Bulbasaur"))
            hasar=Bulbasaur.getHasarPuani();
        else if(gelen.equals("Charmander"))
            hasar=Charmander.getHasarPuani();
        else if(gelen.equals("Squirtle"))
            hasar=Squirtle.getHasarPuani();
        else if(gelen.equals("Zubat"))
            hasar=Zubat.getHasarPuani();
        else if(gelen.equals("Psyduck"))
            hasar=Psyduck.getHasarPuani();
        else if(gelen.equals("Snorlax"))
            hasar=Snorlax.getHasarPuani();
        else if(gelen.equals("Butterfree"))
            hasar=Butterfree.getHasarPuani();
        else if(gelen.equals("Jigglypuff"))
            hasar=Jigglypuff.getHasarPuani();
        else if(gelen.equals("Meowth"))
            hasar=Meowth.getHasarPuani();
        if(i==3)
        {
            b1hasar=hasar;
            jButton1.setIcon(imageicon);
        } 
        if(i==4)
        {
            b2hasar=hasar;
            jButton2.setIcon(imageicon);
        } 
        if(i==5)
        {
            b3hasar=hasar;
            jButton3.setIcon(imageicon);
        } 
        if(i==0)
        {
            b4hasar=hasar;
            jButton4.setIcon(imageicon);
        } 
        if(i==1)
        {
            b5hasar=hasar;
            jButton5.setIcon(imageicon);
        } 
        if(i==2)
        {
            b6hasar=hasar;
            jButton6.setIcon(imageicon);
        } 
    }
    public void yolBulb(String gelen,int i)
    {
        if(gelen.equals("Pikachu"))
            dosyaYolu=Pikachu.getDosyayolu();
        else if(gelen.equals("Bulbasaur"))
            dosyaYolu=Bulbasaur.getDosyayolu();
        else if(gelen.equals("Charmander"))
            dosyaYolu=Charmander.getDosyayolu();
        else if(gelen.equals("Squirtle"))
            dosyaYolu=Squirtle.getDosyayolu();
        else if(gelen.equals("Zubat"))
            dosyaYolu=Zubat.getDosyayolu();
        else if(gelen.equals("Psyduck"))
            dosyaYolu=Psyduck.getDosyayolu();
        else if(gelen.equals("Snorlax"))
            dosyaYolu=Snorlax.getDosyayolu();
        else if(gelen.equals("Butterfree"))
            dosyaYolu=Butterfree.getDosyayolu();
        else if(gelen.equals("Jigglypuff"))
            dosyaYolu=Jigglypuff.getDosyayolu();
        else if(gelen.equals("Meowth"))
            dosyaYolu=Meowth.getDosyayolu();
        ImageIcon imageimiz=new ImageIcon(dosyaYolu);
        Image img1=imageimiz.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth()+1,jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageicon=new ImageIcon(img2);
        if(gelen.equals("Pikachu"))
            hasar=Pikachu.getHasarPuani();
        else if(gelen.equals("Bulbasaur"))
            hasar=Bulbasaur.getHasarPuani();
        else if(gelen.equals("Charmander"))
            hasar=Charmander.getHasarPuani();
        else if(gelen.equals("Squirtle"))
            hasar=Squirtle.getHasarPuani();
        else if(gelen.equals("Zubat"))
            hasar=Zubat.getHasarPuani();
        else if(gelen.equals("Psyduck"))
            hasar=Psyduck.getHasarPuani();
        else if(gelen.equals("Snorlax"))
            hasar=Snorlax.getHasarPuani();
        else if(gelen.equals("Butterfree"))
            hasar=Butterfree.getHasarPuani();
        else if(gelen.equals("Jigglypuff"))
            hasar=Jigglypuff.getHasarPuani();
        else if(gelen.equals("Meowth"))
            hasar=Meowth.getHasarPuani();
        if(i==0)
        {
            b7hasar=hasar;
            jButton7.setIcon(imageicon);
        }
        if(i==1)
        {
            b8hasar=hasar;
            jButton8.setIcon(imageicon);
        }
        if(i==2)
        {
            b9hasar=hasar;
            jButton9.setIcon(imageicon);
        }
        if(i==3)
        {
            b10hasar=hasar;
            jButton10.setIcon(imageicon);
        }
    }

    public int secimyap(javax.swing.JButton buton,int hasar)
    {
                    if(yerdenkartal==0||yerdekikartsayisi==0)
                    {
                        System.out.println("\n\n\n\n\n\n\n");
                        while(true)
                    {
                    int r=random.nextInt(3);
                    if(r==0&&yok1==0)
                    {
                       jButton1.setLocation(jButton1.getLocation().x,jButton1.getLocation().y+30);
                       buton.setLocation(buton.getLocation().x,buton.getLocation().y-30);
                       if(b1hasar>this.hasar)
                       {
                           System.out.println("Bilgisayarin Karti daha yuksek");
                           Bilgisayar.Skor+=5;
                       }
                       else if(this.hasar>b1hasar)
                       {    
                           System.out.println("Kullanicinin Karti daha yuksek");
                           Kullanici.Skor+=5;
                       }
                       else if(this.hasar==b1hasar)
                       {
                           System.out.println("Hasar Puanlari Esit");
                       }
                       jButton1.setVisible(false);
                       buton.setVisible(false);
                       buton.setLocation(buton.getLocation().x,buton.getLocation().y+30);
                       jButton1.setLocation(jButton1.getLocation().x,jButton1.getLocation().y-30);
                       yok1=1;
                       yerdenkartal=1;
                       break;
                    }
                    else if(r==1&&yok2==0)
                    {
                        jButton2.setLocation(jButton2.getLocation().x,jButton2.getLocation().y+30);
                        buton.setLocation(buton.getLocation().x,buton.getLocation().y-30);
                        if(b2hasar>this.hasar)
                       {
                           System.out.println("Bilgisayarin Karti daha yuksek");
                           Bilgisayar.Skor+=5;
                       }
                       else if(this.hasar>b2hasar)
                       {    
                           System.out.println("Kullanicinin Karti daha yuksek");
                           Kullanici.Skor+=5;
                       }
                       else if(this.hasar==b2hasar)
                       {
                           System.out.println("Hasar Puanlari Esit");
                       }
                        jButton2.setVisible(false);
                       buton.setVisible(false);
                       buton.setLocation(buton.getLocation().x,buton.getLocation().y+30);
                       jButton2.setLocation(jButton2.getLocation().x,jButton2.getLocation().y-30);
                       yok2=1;
                       yerdenkartal=1;
                       break;
                    }
                    else if(r==2&&yok3==0)
                    {
                        jButton3.setLocation(jButton3.getLocation().x,jButton3.getLocation().y+30);
                        buton.setLocation(buton.getLocation().x,buton.getLocation().y-30);
                        if(b3hasar>this.hasar)
                       {
                           System.out.println("Bilgisayarin Karti daha yuksek");
                           Bilgisayar.Skor+=5;
                       }
                       else if(this.hasar>b3hasar)
                       {    
                           System.out.println("Kullanicinin Karti daha yuksek");
                           Kullanici.Skor+=5;
                       }
                       else if(this.hasar==b3hasar)
                       {
                           System.out.println("Hasar Puanlari Esit");
                       }
                        jButton3.setVisible(false);
                        buton.setVisible(false);
                        buton.setLocation(buton.getLocation().x,buton.getLocation().y+30);
                        yok3=1;
                        yerdenkartal=1;
                        jButton3.setLocation(jButton3.getLocation().x,jButton3.getLocation().y-30);
                        break;
                    }
                    System.out.println("Kullanici Puan="+Kullanici.getSkor());
                    System.out.println("Bilgisayar Puan="+Bilgisayar.getSkor());
                    }
                        acilankart=acilankart+1;
                    }
                    else
                     JOptionPane.showMessageDialog(this,"Yerden kart al.");
                    if(acilankart==5)
                    {
                        System.out.println("Oyun Bitti@@@@@");
                        jButton1.setVisible(false);
                        jButton2.setVisible(false);
                        jButton3.setVisible(false);
                        jButton4.setVisible(false);
                        jButton5.setVisible(false);
                        jButton6.setVisible(false);
                        jButton7.setVisible(false);
                        jButton8.setVisible(false);
                        jButton9.setVisible(false);
                        jButton10.setVisible(false);
                        if(Kullanici.getSkor()>Bilgisayar.getSkor())
                        JOptionPane.showMessageDialog(this,"Kullanici Kazandi");
                        else if(Bilgisayar.getSkor()>Kullanici.getSkor())
                        JOptionPane.showMessageDialog(this,"Bilgisayar Kazandi");
                        else
                        JOptionPane.showMessageDialog(this,"Berabere");
                        System.exit(0);
                    }
        kartat=0;
        return 1;
    }
    
    public void yerdenkartAl(javax.swing.JButton buton,int hasar,int gelen)
        {
            if(kartat==0)
            {
                if(yok4==1)
            {
                jButton4.setVisible(true);
                jButton4.setIcon(buton.getIcon());
                yerdenkartal=0;
                yok4=0;
                if(gelen==7)
                {
                    yok7=1;
                    jButton7.setVisible(false);
                }
                else if(gelen==8)
                {
                    yok8=1;
                    jButton8.setVisible(false);
                }
                else if(gelen==9)
                {
                    yok9=1;
                    jButton9.setVisible(false);
                }
                else if(gelen==10)
                {
                    yok10=1;
                    jButton10.setVisible(false);
                }
                kartat=1;
                b4hasar=hasar;
                yerdekikartsayisi-=1;
            }
           else if(yok5==1)
            {
                jButton5.setVisible(true);
                jButton5.setIcon(buton.getIcon());
                yerdenkartal=0;
                yok5=0;
                if(gelen==7)
                {
                    yok7=1;
                    jButton7.setVisible(false);
                }
                else if(gelen==8)
                {
                    yok8=1;
                    jButton8.setVisible(false);
                }
                else if(gelen==9)
                {
                    yok9=1;
                    jButton9.setVisible(false);
                }
                else if(gelen==10)
                {
                    yok10=1;
                    jButton10.setVisible(false);
                }
                kartat=1;
                b5hasar=hasar;
                yerdekikartsayisi-=1;
            }
           else if(yok6==1)
            {
                jButton6.setVisible(true);
                jButton6.setIcon(buton.getIcon());
                yerdenkartal=0;
                yok6=0;
                
                if(gelen==7)
                {
                    yok7=1;
                    jButton7.setVisible(false);
                }
                else if(gelen==8)
                {
                    yok8=1;
                    jButton8.setVisible(false);
                }
                else if(gelen==9)
                {
                    yok9=1;
                    jButton9.setVisible(false);
                }
                else if(gelen==10)
                {
                    yok10=1;
                    jButton10.setVisible(false);
                }
                kartat=1;
                b6hasar=hasar;
                yerdekikartsayisi-=1;
            }
                    if(yok1==1)
            {
                while(true)
                {
                   
                 if(yok7==0)
                 {
                     
                     jButton1.setIcon(jButton7.getIcon());
                     yok7=1;
                     jButton1.setVisible(true);
                     jButton7.setVisible(false);
                     b1hasar=b7hasar;
                 }
                else if(yok8==0)
                 {
                     jButton1.setIcon(jButton8.getIcon());
                     jButton1.setVisible(true);
                     jButton8.setVisible(false);
                     yok8=1;
                     b1hasar=b8hasar;
                 }
                else if(yok9==0)
                 {
                     jButton1.setIcon(jButton9.getIcon());
                     jButton1.setVisible(true);
                     jButton9.setVisible(false);
                     yok9=1;
                     b1hasar=b9hasar;
                 }
                 else if(yok10==0)
                 {
                     jButton1.setIcon(jButton10.getIcon());
                     jButton1.setVisible(true);
                     jButton10.setVisible(false);
                     yok10=1;
                     b1hasar=b10hasar;
                 }
                 break;
                }
                yok1=0;
                yerdekikartsayisi-=1;
            }
                else if(yok2==1)
            {
                while(true)
                {
                 if(yok7==0)
                 {
                     jButton2.setIcon(jButton7.getIcon());
                     yok7=1;
                     jButton2.setVisible(true);
                     jButton7.setVisible(false);
                     b2hasar=b7hasar;
                 }
                else if(yok8==0)
                 {
                     jButton2.setIcon(jButton8.getIcon());
                     jButton2.setVisible(true);
                     jButton8.setVisible(false);
                     yok8=1;
                     b2hasar=b8hasar;
                 }
                else if(yok9==0)
                 {
                     jButton2.setIcon(jButton9.getIcon());
                     jButton2.setVisible(true);
                     jButton9.setVisible(false);
                     yok9=1;
                     b2hasar=b9hasar;
                 }
                 else if(yok10==0)
                 {
                     jButton2.setIcon(jButton10.getIcon());
                     jButton2.setVisible(true);
                     jButton10.setVisible(false);
                     yok10=1;
                     b2hasar=b10hasar;
                 }
                 break;
                }
                yok2=0;
                yerdekikartsayisi-=1;
            }
                else if(yok3==1)
            {
                while(true)
                {
                 if(yok7==0)
                 {
                     jButton3.setIcon(jButton7.getIcon());
                     yok7=1;
                     jButton3.setVisible(true);
                     jButton7.setVisible(false);
                     b3hasar=b7hasar;
                 }
                else if(yok8==0)
                 {
                     jButton3.setIcon(jButton8.getIcon());
                     jButton3.setVisible(true);
                     jButton8.setVisible(false);
                     yok8=1;
                     b3hasar=b8hasar;
                 }
                else if(yok9==0)
                 {
                     jButton3.setIcon(jButton9.getIcon());
                     jButton3.setVisible(true);
                     jButton9.setVisible(false);
                     yok9=1;
                     b3hasar=b9hasar;
                 }
                 else if(yok10==0)
                 {
                     jButton3.setIcon(jButton10.getIcon());
                     jButton3.setVisible(true);
                     jButton10.setVisible(false);
                     yok10=1;
                     b3hasar=b10hasar;
                 }
                 break;
                }
                yok3=0;
                yerdekikartsayisi-=1;
            }
                //Timer.schedule(pckartat,1000,2500);
            buton.setVisible(false);
            }
            
            else
              JOptionPane.showMessageDialog(this,"Kart At.");   
            
        }
    public void bilgisayarvs()
    {
        while(true)
        {
            JOptionPane.showMessageDialog(this,"Devam Et");
            int r=random.nextInt(3);
            //kartverdi=0;
        if(r==0&&yok4==0)//kullanıcıya kart seçtirme işlemi
        {
            jButton4.setLocation(jButton4.getLocation().x,jButton4.getLocation().y-50);
            kartverdi=0;
            while(true)
            {
                int t=random.nextInt(3);
            if(t==0&&yok1==0)//bilgisayara kart seçtirme
            {
                if(b4hasar>b1hasar)
                {
                    Kullanici.Skor+=5;
                }
                else if(b1hasar>b4hasar)
                {
                    Bilgisayar.Skor+=5;
                }
                jButton4.setVisible(false);
                yok4=1;
                jButton1.setVisible(false);
                jButton1.setLocation(jButton1.getLocation().x,jButton1.getLocation().y+50);
                JOptionPane.showMessageDialog(this,"Devam Et");
                yok1=1;
                
                while(true)
                {
                int z=random.nextInt(4);
                    yerdekikartsayisi-=1;
                if(z==0&&yok7==0)//7. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton7.getIcon());
                        b1hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton7.getIcon());
                        b4hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton7.getIcon());
                        b2hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton7.getIcon());
                        b5hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton7.getIcon());
                        b3hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton7.getIcon());
                        b6hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok8==0)//8. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);

                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton8.getIcon());
                        b1hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton8.getIcon());
                        b4hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton8.getIcon());
                        b2hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton8.getIcon());
                        b5hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton8.getIcon());
                        b3hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton8.getIcon());
                        b6hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==2&&yok9==0)//9. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton9.getIcon());
                        b1hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton9.getIcon());
                        b4hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton9.getIcon());
                        b2hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton9.getIcon());
                        b5hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton9.getIcon());
                        b3hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton9.getIcon());
                        b6hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                    
                }
                else if(z==3&&yok10==0)//10. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton10.getIcon());
                        b1hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton10.getIcon());
                        b4hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton10.getIcon());
                        b2hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton10.getIcon());
                        b5hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton10.getIcon());
                        b3hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton10.getIcon());
                        b6hasar=b8hasar;
                        jButton10.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                if(kartverdi==2)
                        break;
                }
            }
            else if(t==1&&yok2==0)//bilgisayara kart seçtirme
            {
                if(b4hasar>b2hasar)
                {
                    Kullanici.Skor+=5;
                }
                else if(b2hasar>b4hasar)
                {
                    Bilgisayar.Skor+=5;
                }
                jButton2.setLocation(jButton2.getLocation().x,jButton2.getLocation().y+50);
                JOptionPane.showMessageDialog(this,"Devam Et");
                jButton2.setLocation(jButton2.getLocation().x,jButton2.getLocation().y-50);
                jButton4.setVisible(false);
                yok4=1;
                jButton2.setVisible(false);
                yok2=1;
                while(true)
                {
                int z=random.nextInt(4);
                    yerdekikartsayisi-=1;
                if(z==0&&yok7==0)//7. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton7.getIcon());
                        b1hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton7.getIcon());
                        b4hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton7.getIcon());
                        b2hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton7.getIcon());
                        b5hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton7.getIcon());
                        b3hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton7.getIcon());
                        b6hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok8==0)//8. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton8.getIcon());
                        b1hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton8.getIcon());
                        b4hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton8.getIcon());
                        b2hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton8.getIcon());
                        b5hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton8.getIcon());
                        b3hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton8.getIcon());
                        b6hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==2&&yok9==0)//9. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton9.getIcon());
                        b1hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton9.getIcon());
                        b4hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton9.getIcon());
                        b2hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton9.getIcon());
                        b5hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton9.getIcon());
                        b3hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton9.getIcon());
                        b6hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                    
                }
                else if(z==3&&yok10==0)//10. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton10.getIcon());
                        b1hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton10.getIcon());
                        b4hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton10.getIcon());
                        b2hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton10.getIcon());
                        b5hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton10.getIcon());
                        b3hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton10.getIcon());
                        b6hasar=b8hasar;
                        jButton10.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                if(kartverdi==2)
                        break;
                }
            }
           else if(t==2&&yok3==0)//bilgisayara kart seçtirme
            {
                if(b4hasar>b3hasar)
                {
                    Kullanici.Skor+=5;
                }
                else if(b3hasar>b4hasar)
                {
                    Bilgisayar.Skor+=5;
                }
                jButton3.setLocation(jButton3.getLocation().x,jButton3.getLocation().y+50);
                JOptionPane.showMessageDialog(this,"Devam Et");
                jButton3.setLocation(jButton3.getLocation().x,jButton3.getLocation().y-50);
                jButton4.setVisible(false);
                yok4=1;
                jButton3.setVisible(false);
                yok3=1;

                while(true)
                {
                int z=random.nextInt(4);
                    yerdekikartsayisi-=1;
                if(z==0&&yok7==0)//7. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton7.getIcon());
                        b1hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton7.getIcon());
                        b4hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton7.getIcon());
                        b2hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton7.getIcon());
                        b5hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton7.getIcon());
                        b3hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton7.getIcon());
                        b6hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok8==0)//8. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton8.getIcon());
                        b1hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton8.getIcon());
                        b4hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton8.getIcon());
                        b2hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton8.getIcon());
                        b5hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton8.getIcon());
                        b3hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton8.getIcon());
                        b6hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==2&&yok9==0)//9. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton9.getIcon());
                        b1hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton9.getIcon());
                        b4hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton9.getIcon());
                        b2hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton9.getIcon());
                        b5hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton9.getIcon());
                        b3hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton9.getIcon());
                        b6hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                    
                }
                else if(z==3&&yok10==0)//10. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);

                       if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton10.getIcon());
                        b1hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton10.getIcon());
                        b4hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton10.getIcon());
                        b2hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton10.getIcon());
                        b5hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton10.getIcon());
                        b3hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton10.getIcon());
                        b6hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                }
                if(kartverdi==2)
                        break;
                }
            }
            break;
            }
            jButton4.setLocation(jButton4.getLocation().x,jButton4.getLocation().y+50);
        }
        else if(r==1&&yok5==0)//5. kart kullanıcıya kart seçtirme işlemi
        {
            jButton5.setLocation(jButton5.getLocation().x,jButton5.getLocation().y-50);
            JOptionPane.showMessageDialog(this,"Devam Et");
            kartverdi=0;
            while(true)
            {
                int t=random.nextInt(3);
            if(t==0&&yok1==0)//bilgisayara kart seçtirme
            {
                if(b5hasar>b1hasar)
                {
                    Kullanici.Skor+=5;
                }
                else if(b1hasar>b5hasar)
                {
                    Bilgisayar.Skor+=5;
                }
                jButton1.setLocation(jButton1.getLocation().x,jButton1.getLocation().y+50);
                JOptionPane.showMessageDialog(this,"Devam Et");
                jButton1.setLocation(jButton1.getLocation().x,jButton1.getLocation().y-50);
                jButton5.setVisible(false);
                yok5=1;
                jButton1.setVisible(false);
                yok1=1;
                while(true)
                {
                int z=random.nextInt(4);
                    yerdekikartsayisi-=1;
                if(z==1&&yok7==0)//7. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton7.getIcon());
                        b1hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton7.getIcon());
                        b4hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton7.getIcon());
                        b2hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton7.getIcon());
                        b5hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton7.getIcon());
                        b3hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton7.getIcon());
                        b6hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                }
                else if(z==1&&yok8==0)//8. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton8.getIcon());
                        b1hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton8.getIcon());
                        b4hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton8.getIcon());
                        b2hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton8.getIcon());
                        b5hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton8.getIcon());
                        b3hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton8.getIcon());
                        b6hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok8=1;
                        kartverdi+=1;
                    }
                    }
                    
                }
                else if(z==1&&yok9==0)//9. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton9.getIcon());
                        b1hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton9.getIcon());
                        b4hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton9.getIcon());
                        b2hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton9.getIcon());
                        b5hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton9.getIcon());
                        b3hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton9.getIcon());
                        b6hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                    
                }
                else if(z==1&&yok10==0)//10. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton10.getIcon());
                        b1hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton10.getIcon());
                        b4hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton10.getIcon());
                        b2hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton10.getIcon());
                        b5hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton10.getIcon());
                        b3hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton10.getIcon());
                        b6hasar=b8hasar;
                        jButton10.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                if(kartverdi==2)
                        break;
                }
                
            }
            else if(t==1&&yok2==0)//bilgisayara kart seçtirme
            {
                if(b5hasar>b2hasar)
                {
                    Kullanici.Skor+=5;
                }
                else if(b2hasar>b5hasar)
                {
                    Bilgisayar.Skor+=5;
                }
                jButton2.setLocation(jButton2.getLocation().x,jButton2.getLocation().y+50);
                JOptionPane.showMessageDialog(this,"Devam Et");
                jButton2.setLocation(jButton2.getLocation().x,jButton2.getLocation().y-50);
                jButton5.setVisible(false);
                yok5=1;
                jButton2.setVisible(false);
                yok2=1;
                while(true)
                {
                int z=random.nextInt(4);
                    yerdekikartsayisi-=1;
                if(z==1&&yok7==0)//7. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton7.getIcon());
                        b1hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton7.getIcon());
                        b4hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton7.getIcon());
                        b2hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton7.getIcon());
                        b5hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton7.getIcon());
                        b3hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton7.getIcon());
                        b6hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                }
                else if(z==1&&yok8==0)//8. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton8.getIcon());
                        b1hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton8.getIcon());
                        b4hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton8.getIcon());
                        b2hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton8.getIcon());
                        b5hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton8.getIcon());
                        b3hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton8.getIcon());
                        b6hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok9==0)//9. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton9.getIcon());
                        b1hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton9.getIcon());
                        b4hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton9.getIcon());
                        b2hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton9.getIcon());
                        b5hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton9.getIcon());
                        b3hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton9.getIcon());
                        b6hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                    
                }
                else if(z==1&&yok10==0)//10. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton10.getIcon());
                        b1hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton10.getIcon());
                        b4hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton10.getIcon());
                        b2hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton10.getIcon());
                        b5hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton10.getIcon());
                        b3hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton10.getIcon());
                        b6hasar=b8hasar;
                        jButton10.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                if(kartverdi==2)
                        break;
                }
                
            }
            else if(t==2&&yok3==0)//bilgisayara kart seçtirme
            {
                if(b5hasar>b3hasar)
                {
                    Kullanici.Skor+=5;
                }
                else if(b3hasar>b5hasar)
                {
                    Bilgisayar.Skor+=5;
                }
                jButton3.setLocation(jButton3.getLocation().x,jButton3.getLocation().y+50);
                JOptionPane.showMessageDialog(this,"Devam Et");
                jButton3.setLocation(jButton3.getLocation().x,jButton3.getLocation().y-50);
                jButton5.setVisible(false);
                yok5=1;
                jButton3.setVisible(false);
                yok3=1;
                while(true)
                {
                int z=random.nextInt(4);
                    yerdekikartsayisi-=1;
                if(z==1&&yok7==0)//7. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton7.getIcon());
                        b1hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton7.getIcon());
                        b4hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton7.getIcon());
                        b2hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton7.getIcon());
                        b5hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton7.getIcon());
                        b3hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton7.getIcon());
                        b6hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                }
                else if(z==1&&yok8==0)//8. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton8.getIcon());
                        b1hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton8.getIcon());
                        b4hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton8.getIcon());
                        b2hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton8.getIcon());
                        b5hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton8.getIcon());
                        b3hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton8.getIcon());
                        b6hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok9==0)//9. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton9.getIcon());
                        b1hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton9.getIcon());
                        b4hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok9=1;
                       kartverdi+=1;
                       break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton9.getIcon());
                        b2hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton9.getIcon());
                        b5hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton9.getIcon());
                        b3hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton9.getIcon());
                        b6hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                    
                }
                else if(z==1&&yok10==0)//10. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton10.getIcon());
                        b1hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton10.getIcon());
                        b4hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton10.getIcon());
                        b2hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton10.getIcon());
                        b5hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton10.getIcon());
                        b3hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton10.getIcon());
                        b6hasar=b8hasar;
                        jButton10.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    
                    }
                    
                }
                if(kartverdi==2)
                        break;
                }
                
            }
            break;
            }
            jButton5.setLocation(jButton5.getLocation().x,jButton5.getLocation().y+50);
        }
        else if(r==2&&yok6==0)//kullanıcıya kart seçtirme işlemi
        {
            jButton6.setLocation(jButton6.getLocation().x,jButton6.getLocation().y-50);
            JOptionPane.showMessageDialog(this,"Devam Et");
            kartverdi=0;
            while(true)
            {
                int t=random.nextInt(3);
            if(t==0&&yok1==0)//bilgisayara kart seçtirme
            {
                if(b6hasar>b1hasar)
                {
                    Kullanici.Skor+=5;
                }
                else if(b1hasar>b6hasar)
                {
                    Bilgisayar.Skor+=5;
                }
                jButton1.setLocation(jButton1.getLocation().x,jButton1.getLocation().y+50);
                JOptionPane.showMessageDialog(this,"Devam Et");
                jButton1.setLocation(jButton1.getLocation().x,jButton1.getLocation().y-50);
                jButton6.setVisible(false);
                yok6=1;
                jButton1.setVisible(false);
                yok1=1;

                while(true)
                {
                int z=random.nextInt(4);
                    yerdekikartsayisi-=1;
                    
                if(z==0&&yok7==0)//7. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton7.getIcon());
                        b1hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton7.getIcon());
                        b4hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton7.getIcon());
                        b2hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton7.getIcon());
                        b5hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton7.getIcon());
                        b3hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton7.getIcon());
                        b6hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok8==0)//8. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton8.getIcon());
                        b1hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton8.getIcon());
                        b4hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton8.getIcon());
                        b2hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton8.getIcon());
                        b5hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton8.getIcon());
                        b3hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton8.getIcon());
                        b6hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok9==0)//9. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton9.getIcon());
                        b1hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton9.getIcon());
                        b4hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton9.getIcon());
                        b2hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton9.getIcon());
                        b5hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton9.getIcon());
                        b3hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton9.getIcon());
                        b6hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                    
                }
                else if(z==1&&yok10==0)//10. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton10.getIcon());
                        b1hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton10.getIcon());
                        b4hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton10.getIcon());
                        b2hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton10.getIcon());
                        b5hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton10.getIcon());
                        b3hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton10.getIcon());
                        b6hasar=b8hasar;
                        jButton10.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                if(kartverdi==2)
                        break;
                }
                
            }
            else if(t==1&&yok2==0)//bilgisayara kart seçtirme
            {
                if(b6hasar>b2hasar)
                {
                    Kullanici.Skor+=5;
                }
                else if(b2hasar>b6hasar)
                {
                    Bilgisayar.Skor+=5;
                }
                jButton2.setLocation(jButton2.getLocation().x,jButton2.getLocation().y+50);
                JOptionPane.showMessageDialog(this,"Devam Et");
                jButton2.setLocation(jButton2.getLocation().x,jButton2.getLocation().y-50);
                jButton6.setVisible(false);
                yok6=1;
                jButton2.setVisible(false);
                yok2=1;
                while(true)
                {
                int z=random.nextInt(4);
                    yerdekikartsayisi-=1;
                if(z==0&&yok7==0)//7. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton7.getIcon());
                        b1hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton7.getIcon());
                        b4hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton7.getIcon());
                        b2hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton7.getIcon());
                        b5hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton7.getIcon());
                        b3hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton7.getIcon());
                        b6hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok8==0)//8. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton8.getIcon());
                        b1hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton8.getIcon());
                        b4hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton8.getIcon());
                        b2hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton8.getIcon());
                        b5hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton8.getIcon());
                        b3hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton8.getIcon());
                        b6hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok9==0)//9. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton9.getIcon());
                        b1hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton9.getIcon());
                        b4hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton9.getIcon());
                        b2hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok9=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton9.getIcon());
                        b5hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok9=1;
                        kartverdi+=1;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton9.getIcon());
                        b3hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok9=1;
                        kartverdi+=1;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton9.getIcon());
                        b6hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                    
                }
                else if(z==1&&yok10==0)//10. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton10.getIcon());
                        b1hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton10.getIcon());
                        b4hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton10.getIcon());
                        b2hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton10.getIcon());
                        b5hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton10.getIcon());
                        b3hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton10.getIcon());
                        b6hasar=b8hasar;
                        jButton10.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    
                    }
                    
                }
                if(kartverdi==2)
                        break;
                }
                
            }
            else if(t==2&&yok3==0)//bilgisayara kart seçtirme
            {
                if(b6hasar>b2hasar)
                {
                    Kullanici.Skor+=5;
                }
                else if(b2hasar>b6hasar)
                {
                    Bilgisayar.Skor+=5;
                }
                jButton3.setLocation(jButton3.getLocation().x,jButton3.getLocation().y+50);
                JOptionPane.showMessageDialog(this,"Devam Et");
                jButton3.setLocation(jButton3.getLocation().x,jButton3.getLocation().y-50);
                jButton6.setVisible(false);
                yok6=1;
                jButton2.setVisible(false);
                yok2=1;
                while(true)
                {
                int z=random.nextInt(4);

                    yerdekikartsayisi-=1;
                if(z==0&&yok7==0)//7. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton7.getIcon());
                        b1hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton7.getIcon());
                        b4hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton7.getIcon());
                        b2hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton7.getIcon());
                        b5hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok7=1;
                        kartverdi+=1;;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton7.getIcon());
                        b3hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton7.getIcon());
                        b6hasar=b7hasar;
                        jButton7.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok7=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                else if(z==1&&yok8==0)//8. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                        System.out.println("Kullanici="+Kullanici.Skor);
                        System.out.println("Bilgisayar="+Bilgisayar.Skor);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton8.getIcon());
                        b1hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton8.getIcon());
                        b4hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton8.getIcon());
                        b2hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton8.getIcon());
                        b5hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton8.getIcon());
                        b3hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok8=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton8.getIcon());
                        b6hasar=b8hasar;
                        jButton8.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok8=1;
                         kartverdi+=1;
                         break;
                    }
                    }
                    
                }
                else if(z==1&&yok9==0)//9. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                        System.out.println("Kullanici="+Kullanici.Skor);
                        System.out.println("Bilgisayar="+Bilgisayar.Skor);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton9.getIcon());
                        b1hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton9.getIcon());
                        b4hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton9.getIcon());
                        b2hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton9.getIcon());
                        b5hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton9.getIcon());
                        b3hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton9.getIcon());
                        b6hasar=b9hasar;
                        jButton9.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok9=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                    
                }
                else if(z==1&&yok10==0)//10. kartı dağıtma işlemi
                {
                    while(true)
                    {
                        int y=random.nextInt(6);
                        System.out.println("Kullanici="+Kullanici.Skor);
                        System.out.println("Bilgisayar="+Bilgisayar.Skor);
                    if(y==0&&yok1==1)
                    {
                        jButton1.setIcon(jButton10.getIcon());
                        b1hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton1.setVisible(true);
                        yok1=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==1&&yok4==1)
                    {
                        jButton4.setIcon(jButton10.getIcon());
                        b4hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton4.setVisible(true);
                        yok4=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==2&&yok2==1)
                    {
                        jButton2.setIcon(jButton10.getIcon());
                        b2hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton2.setVisible(true);
                        yok2=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==3&&yok5==1)
                    {
                        jButton5.setIcon(jButton10.getIcon());
                        b5hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton5.setVisible(true);
                        yok5=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==4&&yok3==1)
                    {
                        jButton3.setIcon(jButton10.getIcon());
                        b3hasar=b10hasar;
                        jButton10.setVisible(false);
                        jButton3.setVisible(true);
                        yok3=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    else if(y==5&&yok6==1)
                    {
                        jButton6.setIcon(jButton10.getIcon());
                        b6hasar=b8hasar;
                        jButton10.setVisible(false);
                        jButton6.setVisible(true);
                        yok6=0;
                        yok10=1;
                        kartverdi+=1;
                        break;
                    }
                    }
                    
                }
                if(kartverdi==2)
                        break;

                }
                
            }
            break;
            }
            jButton6.setLocation(jButton6.getLocation().x,jButton6.getLocation().y+50);
        }
        if(acilankart==5)
                    {
                        jButton1.setVisible(false);
                        jButton2.setVisible(false);
                        jButton3.setVisible(false);
                        jButton4.setVisible(false);
                        jButton5.setVisible(false);
                        jButton6.setVisible(false);
                        jButton7.setVisible(false);
                        jButton8.setVisible(false);
                        jButton9.setVisible(false);
                        jButton10.setVisible(false);
                        if(Kullanici.getSkor()>Bilgisayar.getSkor())
                        JOptionPane.showMessageDialog(this,"Kullanici Kazandi");
                        else if(Bilgisayar.getSkor()>Kullanici.getSkor())
                        JOptionPane.showMessageDialog(this,"Bilgisayar Kazandi");
                        else
                        JOptionPane.showMessageDialog(this,"Berabere");
                        System.exit(0);
                    }
        }
    }
    
    /**
     * Creates new form Menu
     */
    
    public Menu() {
        /*Image img1=imageimiz.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth()+1,jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageicon=new ImageIcon(img2); */
        initComponents();
        
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bilgisayarvs = new javax.swing.JButton();
        Kullanicivs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        setBounds(new java.awt.Rectangle(255, 255, 1920, 1080));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(960, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        Bilgisayarvs.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bilgisayarvs.setText("Bilgisayar vs Bilgisayar");
        Bilgisayarvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BilgisayarvsActionPerformed(evt);
            }
        });
        getContentPane().add(Bilgisayarvs);
        Bilgisayarvs.setBounds(250, 140, 460, 80);

        Kullanicivs.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Kullanicivs.setText("Bilgisayar vs Kullanici");
        Kullanicivs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KullanicivsActionPerformed(evt);
            }
        });
        getContentPane().add(Kullanicivs);
        Kullanicivs.setBounds(250, 296, 460, 80);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 90, 140);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(745, 185, 90, 140);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(845, 185, 90, 140);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(110, 185, 90, 140);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 185, 90, 140);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(660, 350, 90, 140);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(430, 350, 90, 140);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(200, 350, 90, 140);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(660, 20, 90, 140);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 20, 90, 140);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 20, 90, 140);

        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 510);

        Arkaplan.setBackground(new java.awt.Color(0, 153, 51));
        getContentPane().add(Arkaplan);
        Arkaplan.setBounds(0, 0, 960, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KullanicivsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KullanicivsActionPerformed
        kullanici=1;
        // TODO add your handling code here:
        Bilgisayarvs.setVisible(false);
        Kullanicivs.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
    }//GEN-LAST:event_KullanicivsActionPerformed

    private void BilgisayarvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BilgisayarvsActionPerformed
        // TODO add your handling code here:
        bilgisayar=1;
        Bilgisayarvs.setVisible(false);
        Kullanicivs.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        bilgisayarvs();
    }//GEN-LAST:event_BilgisayarvsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println(b3hasar);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(kullanici==1){
            yok4=secimyap(jButton4,b4hasar);
        System.out.println(b4hasar);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(kullanici==1){
        yok5=secimyap(jButton5,b5hasar);    
        System.out.println(b5hasar);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(kullanici==1){
        yok6=secimyap(jButton6,b6hasar);
        System.out.println(b6hasar);
        } 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        yerdenkartAl(jButton7,b7hasar,7);
        yok7=1;
        System.out.println(b7hasar);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    yerdenkartAl(jButton8,b8hasar,8);
    yok8=1;
        System.out.println(b8hasar);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    yerdenkartAl(jButton9,b9hasar,9);
    yok9=1;
        System.out.println(b9hasar);

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        yerdenkartAl(jButton10,b10hasar,10);
        yok10=1;
        System.out.println(b10hasar);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println(b2hasar);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(b1hasar);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arkaplan;
    private javax.swing.JButton Bilgisayarvs;
    private javax.swing.JButton Kullanicivs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
