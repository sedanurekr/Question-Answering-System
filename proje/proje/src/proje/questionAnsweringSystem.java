
package projefull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class questionAnsweringSystem {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {        
        while(true){
            Scanner input2=new Scanner(System.in);
            System.out.println("Soru sormak için 1/ soru eklemek için 2 giriniz");
            int secenek=input2.nextInt();
           
            //Şimdi kullanıcıdan soruyu alıyoruz.        
           
            if(secenek==2){  
                Scanner input3 = new Scanner(System.in,"ISO-8859-9");
                System.out.print("Soru kalıplarına uygun soru giriniz===>>>");
                String soruKalıbı = input3.nextLine();  
                AddQuestion add = new AddQuestion();
                add.addQ(soruKalıbı);
                
            }

            else{
                Scanner input = new Scanner(System.in,"ISO-8859-9");
                System.out.print("Soru kalıplarına uygun soru giriniz===>>>");
                String soru = input.nextLine();      
                soru=soru.toUpperCase();
                //Soruyu parçalayıp gerekli keywordleri bulmak için
                QuestionParser Parser = new QuestionParser();            
                ArrayList<ArrayList<String>> istenen2 = Parser.Parse(soru);
                Answers answer = new Answers();
                //Parçalanmış soruda cevapları bulmak için
                answer.getAnswer(istenen2);  
            }
            
            
        }
        
        
    }
    
}

