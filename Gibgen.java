import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

/**
 *  Title:   Gibberish Generator (GE SWEAP) 
 *  Author:  Paul Montelepre
 *  Date:    11-10-13
 */


/**
 *  Models a simple Gibberish generator for the GE Software Engineering Apprenticeship Program.
 *  
 */

public class Gibgen{
  
  private Scanner in;                                    
  
  public Gibgen(FileReader fb){
    in= new Scanner(fb);                                  // in = new Scanner
  }
  
/**
 *  Method that gets (from STDIN) tokens and manipulates (giberates) each token one at a 
 *  time and prints them to console one at a time.
 * 
 */
   
  
  public void getString(){
    int length = 0;
    
    while(in.hasNext()){                                  //loop to determine when input from scanner is no more
      StringBuilder token = new StringBuilder(in.next());      //token = new StringBuilder
      
      length = token.length();                             //set length of incoming token
      if (!Character.isLetter(token.charAt(length-1))) {   //loop to take care of punctuation at END of tokens
        length = length - 1;
      }
      
      int base=0;                                 //set the base to deal with punctuation at the beggining of token
      if (!Character.isLetter(token.charAt(0))) {         
        base = base + 1;                             
      }
      
      if (length >= 4) {                              //only move letters of words > 4 
        
        int j = (length - 2);                          //set j to second to last letter of length
        int i=base + 1;                                //set i to second from front letter of length
        while(j>=i) {
          
          if ((Character.isLowerCase(token.charAt(i))) &&       //loop to only only swap lowercase Characters
              Character.isLowerCase(token.charAt(j)))  { 
            char temp;        
            temp = token.charAt(j);
            token.replace(j,j+1,Character.toString(token.charAt(i)));         
            token.replace(i,i+1,Character.toString(temp));   
            i++;
            j--;
          }else {
            i++;
            j--;
          }
        }
      }
      System.out.print(token + " ");                      //print to console token + space
    }
  }
 
  
  /**
   *  Method to start my Gibberish generator.
   * 
   */
    
  
  public static void main (String args[]) {
    FileReader fb= null;
    
    try {
      fb = new FileReader(args[0]);                         //fb = new FileReader of file name from STNDIN
    } catch (FileNotFoundException e) { 
      System.out.println(e);
    }
    
    Gibgen gib = new Gibgen(fb);                       //run getString() function
    gib.getString();
    
    try {
      fb.close();                                             //close FileReader
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  
}