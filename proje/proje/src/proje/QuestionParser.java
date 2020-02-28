/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projefull;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class QuestionParser {
    
    public ArrayList<ArrayList<String>> Parse(String soru){
        //takımşların adlarının tanımlandığı liste        
            String[] takımlar = {"BAŞAKŞEHİR", "GALATASARAY", "BEŞİKTAS", "TRABZONSPOR", "KONYASPOR", 
            "ANTALYASPOR", "RİZESPOR", "MALATYASPOR","SİVASSPOR", "KASIMPAŞA", "ALANYASPOR",
            "KAYSERİSPOR", "FENERBAHÇE", "ANKARAGÜCÜ", "BURSASPOR", "GÖZTEPE", "ERZURUMSPOR","AKHİSAR"};
         //keywordlerın bulundugu regex kuralları listesi   
        String[] keyWords = {".*BAŞAKŞEHİR.*",".*GALATASARAY.*",".*BEŞİKTAS.*",".*TRABZONSPOR.*",".*KONYASPOR.*",".*ANTALYASPOR.*",".*RİZESPOR.*",".*MALATYASPOR.*",".*SİVASSPOR.*",".*KASIMPAŞA.*",
            ".*ALANYASPOR.*",".*KAYSERİSPOR*.",".*FENERBAHÇE.*",".*ANKARAGÜCÜ.*",".*BURSASPOR.*",".*GÖZTEPE.*",".*ERZURUMSPOR.*",".*AKHİSAR.*",".*DİRECTOR.*",".*COLOR.*",".*DATE.*",".*STADİUM.*",".*CHAMPİONSHİP.*"};
        
        
          ArrayList<String> takımAdi = new ArrayList<>();
        ArrayList<String> keywordTut = new ArrayList<>();
        
 
         //StringTokenizer ile tüm cümleyi kelimelere ayırma işlemini yapıyoruz.

        StringTokenizer st = new StringTokenizer(soru," ");

        while (st.hasMoreTokens()){
            //matcherdaKul değişkeni macher işleminde kullanılacak.
            String soruKelime = st.nextToken();
            //for döngüsü ile RegEx kontrol işlemini yapıyorum.
            //kelimenin regexteki konumu
            int kelimeninKonumu = 0;
            for(int j = 0 ; j<keyWords.length;j++){
                //Kontrol edilecek olan RegEx kelimesinin seçilme işlemi
                Pattern pattern = Pattern.compile(keyWords[j]);              
                Matcher matcher = pattern.matcher(soruKelime);
                //Eğer bulduysa daha fazla bakmaması için break komutu.
                if(matcher.find()){                
                    kelimeninKonumu=j;
                    break;
                }
                
            }            
            if (kelimeninKonumu==18){
                keywordTut.add("Director");
            }
            else if (kelimeninKonumu==19){
                keywordTut.add("Colors");
            }
              else if (kelimeninKonumu==20){
                keywordTut.add("Date");
            }
              else if (kelimeninKonumu==21){
                keywordTut.add("Stadium");
            }
              else if (kelimeninKonumu==22){
                keywordTut.add("championship");
            }             
            else if(0<kelimeninKonumu && kelimeninKonumu<18){  //takımın ismini ve sırasını alıyoruz diger taraftan rahat ulasmak icin             
                takımAdi.add(takımlar[kelimeninKonumu]); 
              
            }
          else{
                    keywordTut.add(soruKelime);
                }
        }
        ArrayList<ArrayList<String>> veriGönder = new ArrayList<>();        
        veriGönder.add(keywordTut);
        veriGönder.add(takımAdi);  
       
        return veriGönder;
    }
    
}
