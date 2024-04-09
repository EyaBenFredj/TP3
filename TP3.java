/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 import java.io.FileNotFoundException;
 import java.util.ArrayList;
 
 /**
  *
  * @author eyabe
  */
 public class TP3 {
 
     public static void main(String[] args) throws FileNotFoundException {
        JavaFiles fileHandler = new JavaFiles("file.log");
        int lineIndexToReverse = 1;
        fileHandler.reverseString(lineIndexToReverse);
        
        int lineIndexToRemoveDuplicates = 2;
        fileHandler.removeDuplicates(lineIndexToRemoveDuplicates);
        String pattern = "epoch";
        ArrayList<String> linesWithPattern = fileHandler.findLinesWithPattern(pattern);
        String str1 = "tpjava";
        String str2 = "Tpjava";
        System.out.println("Comparaison avec equals : " + fileHandler.compareString1(str1,str2));
        
        String str5= "tpjava";
        String str6 = "TPJAVA";
        System.out.println(fileHandler.compareString2(str5,str6) + "Compare using equalsIgnoreCase : ");
        
        String str7 = "tpjava";
        String str8 = "tpjava";
        System.out.println("Compare using ==" + fileHandler.compareString3(str7,str8));
        System.out.println("Compare using ==" + fileHandler.compareString3("tpjava","tpjava"));
        System.out.println("Compare using ==" + fileHandler.compareString3("tpjava", "tpjava"));
        
        System.out.println("Ligne concernée" + pattern + " : " + linesWithPattern.get(0) );
        
        
 
          // Clé de chiffrement
          String key = "secret";
          // Texte clair à chiffrer
          String plaintext = "Hello, world";
          // Création de l’objet XORCipher
            ChiffrementXOR ChiffrementXOR;
         ChiffrementXOR = new ChiffrementXOR(key);
          // Chiffrement du texte clair
          String encryptedText = ChiffrementXOR.encrypt(plaintext);
          System.out.println("Texte chiffré : " + encryptedText);
           // Déchiffrement du texte chiffré
         String decryptedText;
         decryptedText = ChiffrementXOR.decrypt(encryptedText);
         System.out.println("Texte déchiffré : " + decryptedText);
 
 
        
        
     }
 }
 