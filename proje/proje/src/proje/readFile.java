package projefull;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class readFile {
    public ArrayList<String> readFile(ArrayList<String> list, String dosyaAdi) throws FileNotFoundException, IOException{
        //dosya okuma islemleri
            BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));//dosyanın ismi ve verilerin tutulacagı liste paremetre olarak gelir ve satır satır
            //veriler listeye eklenir ve dondurulur
            list.addAll(oku.lines().collect(Collectors.toList())); // listeye ekleme islemi yapildi
            oku.close();              
        return list;
        
    }
    
    
    
}
