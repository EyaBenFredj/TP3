/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eyabe
 */
public class ChiffrementXOR {
     private final String clé;
   public ChiffrementXOR (String clé){
       this.clé = clé;
   } 
   
   
   
   public String encrypt(String plaintext){
       StringBuilder ciphertext = new StringBuilder();
       for(int i=0 ; i<plaintext.length() ; i++){
           char plaintextChar = plaintext.charAt(i);
           char keyChar = clé.charAt(i % clé.length());
           int XorResult = plaintextChar ^ keyChar;
           ciphertext.append((char) XorResult);
       }
      return ciphertext.toString();
   }
   
   
    public String decrypt(String ciphertext) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < ciphertext.length(); i++) {
            char cipherChar = ciphertext.charAt(i);
            char keyChar;
            keyChar = clé.charAt(i % clé.length());
            int xorResult = cipherChar ^ keyChar;
            decryptedText.append((char) xorResult);
        }
        return decryptedText.toString();
    }
}