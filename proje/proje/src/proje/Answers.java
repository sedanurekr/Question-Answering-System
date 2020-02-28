/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projefull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Answers {    
    public void getAnswer(ArrayList<ArrayList<String>> istenen2) throws FileNotFoundException, IOException{
        //sehirlerin adlarının tanımlandığı liste        
        String[] takımİsimleri = {"BAŞAKŞEHİR", "GALATASARAY", "BEŞİKTAS", "TRABZONSPOR", "KONYASPOR", 
            "ANTALYASPOR", "RİZESPOR", "MALATYASPOR","SİVASSPOR", "KASIMPAŞA", "ALANYASPOR",
            "KAYSERİSPOR", "FENERBAHÇE", "ANKARAGÜCÜ", "BURSASPOR", "GÖZTEPE", "ERZURUMSPOR","AKHİSAR"};    
        //dosya islemleri icin dosya nesnesi        
        readFile readFile = new readFile();      
        ArrayList<String> takımbilgiler = new ArrayList<>();
        //burada dosya.java içindeki flVeriCekme metodunu kullandım.
        takımbilgiler = readFile.readFile(takımbilgiler, "information.txt");        
       
        ArrayList<teamİnfo> takımTut = new ArrayList<>();//takımların bilgilerini ttutmak icin liste
        
        //tüm takımları nesne olarak listeye attım
        for(int i = 0; i<18; i++){
            String[] dizi=takımbilgiler.get(i).split(",");            
            teamİnfo takımlar = new teamİnfo(dizi[0],dizi[1],dizi[2],dizi[3],dizi[4],Integer.parseInt(dizi[5]));     //nesne yaratma ve atama islemleri      
            takımTut.add(takımlar);            
        }
        ArrayList<String> takımAdi = istenen2.get(1);
        ArrayList<String> istenen = istenen2.get(0);
        int takımKonum = 0;
        for (int j=0;j<takımAdi.size();j++){//sorumuzun icinden gelen takımın hangi konumda oldugunu bulduk 
            for (int a=0;a<takımİsimleri.length;a++){
                if (takımİsimleri[a].toString().equals(takımAdi.get(j).toString())){
                     takımKonum=a;
                    }
            }
        }     
        ArrayList<String> cevaplar =new ArrayList<>();
        // yazdırma işlemleri          
            for(int i = 0 ; i<istenen.size();i++){
                //icinde gecen kelimelere gore daha once atatıgımız sey varsa ve takımın konumunu bulmak icin if else
                if(istenen.get(i).equals ("Director"))  {       
                    System.out.print(takımİsimleri[takımKonum] +" Teknik direktoru " + takımTut.get(takımKonum).getDirector()+"\n");
                cevaplar.add(takımTut.get(takımKonum).getDirector());}
                else if(istenen.get(i).equals ("Colors")) {       
                    System.out.print(takımİsimleri[takımKonum] +" Renkleri " + takımTut.get(takımKonum).getColor()+"\n");                    
                    cevaplar.add(takımTut.get(takımKonum).getColor());                
                }
                else if(istenen.get(i).equals ("Date"))
                {System.out.print(takımİsimleri[takımKonum] +" Kurulus Yili " + takımTut.get(takımKonum).getDate()+"\n");
                cevaplar.add(takımTut.get(takımKonum).getDate());
                }
                else if(istenen.get(i).equals ("Stadium"))   
                {System.out.print(takımİsimleri[takımKonum] +" Stad İsmi " + takımTut.get(takımKonum).getStadium()+"\n");
                cevaplar.add(takımTut.get(takımKonum).getStadium());
                }
                else if(istenen.get(i).equals ("championship")) 
                {System.out.print(takımİsimleri[takımKonum] +" sampiyonluk Sayisi " + takımTut.get(takımKonum).getSayi()+"\n");
                String l=takımTut.get(takımKonum).toString();
                cevaplar.add(l);
                }
                
                else if (istenen.get(i).equalsIgnoreCase("who")||istenen.get(i).equalsIgnoreCase("am")||istenen.get(i).equalsIgnoreCase("have")//bazı cumle ,c,nde gecebilecek onemsiz kelimeler
                        ||istenen.get(i).equalsIgnoreCase("has")||istenen.get(i).equalsIgnoreCase("got")
                        ||istenen.get(i).equalsIgnoreCase("is")||istenen.get(i).equalsIgnoreCase("of")
                        ||istenen.get(i).equalsIgnoreCase("name")||istenen.get(i).equalsIgnoreCase("are")||
                        istenen.get(i).equalsIgnoreCase("which")||istenen.get(i).equalsIgnoreCase("where")||
                        istenen.get(i).equalsIgnoreCase("what")||istenen.get(i).equalsIgnoreCase("how")||istenen.get(i).equalsIgnoreCase("many"));
                
            }  if (cevaplar.size()==0) {
                    WebSource arama = new WebSource();
                    arama.SearchAnswer(istenen);                   
                }  
        System.out.println("-------------------------------------");
        
    }
    
  
}
