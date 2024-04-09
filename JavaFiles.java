/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eyabe
 */
public class JavaFiles {
    private String filePath;
  private int fileSizeKb ;
  private int nbLines;
  private ArrayList<String> Content;
  public JavaFiles (String filePath){
      File file = new File(filePath);
      if(file.exists()){
         
          this.fileSizeKb = 0;
          this.nbLines = 0;
          this.Content =new ArrayList<>();
          }
      else 
          System.out.println("Le fichier n'existe pas");
      
  }
  private void readFile() throws FileNotFoundException{
      File myObj = new File(filePath);
      Scanner myReader = new Scanner(myObj);
      while(myReader.hasNextLine()){
          String data = myReader.nextLine();
           this.nbLines += 1 ;
           this.Content.add(data);
      }
      this.fileSizeKb = (int) myObj.length()/1024;
       
  }
public ArrayList<String> findLinesWithPattern(String Pattern) throws FileNotFoundException{
      ArrayList<String> listPattern = new ArrayList<>();
     for(String A : Content){
          if(A.contains(Pattern))
              listPattern.add(A);
          
              
      }
     return listPattern;
 }
public boolean compareString2(String str1,String str2){
      return str1.equalsIgnoreCase(str2);
  }
  public boolean compareString3(String str1,String str2){
      return (str1 == null ? str2 == null : str1.equals(str2));
  }
  
  
 public boolean compareString1(String str1,String str2){
     return str1.equals(str2);
 }
  
 
  public String reverseString(int lineIndex){
        String Line = Content.get(lineIndex);
        String LineRev = null;
        for (int i = Line.length();i>0;i--){
            LineRev += Line.charAt(i);
        }
        return LineRev;
    
  }
  public String removeDuplicates(int lineIndex){
      String Line = Content.get(lineIndex);
      String LineDeleteDup = null;
      for (int i = 0 ; i<Line.length();i++){
          for (int j = Line.length(); j>0 ; j--){
          if(Line.charAt(i)!=Line.charAt(j)){
            LineDeleteDup += Line.charAt(i);
          }
              
          }
          
      }
      return LineDeleteDup;
  }
 
  
}
