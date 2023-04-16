import java.io.*;
import java.util.Scanner;
class  REVword {
public static void main (String[] args) {        
  String str = "HIMESH KUMAR GAUTTAM", nstr="";
  char ch;        
  System.out.print("Original word:");  
  System.out.println("HIMESH KUMAR GAUTTAM"); 
//Example word        
  for (int i = 0; i < str.length(); i++) {
  ch = str.charAt(i); 
//extracts each character
  nstr = ch+nstr; 
//adds each character in front of the existing   string //
  }
  System.out.println("Reversed word:"+ nstr);
  }
}
