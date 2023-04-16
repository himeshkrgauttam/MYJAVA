//Display Reverse String using Byte Array.
import java.lang.*;
import java.io.*;
import java.util.*;
// Class of ReverseString
class REVString {
public static void main(String[] args){
  String input = "CDAC GIT CHAPRA";
// getBytes() method to convert string
// into bytes[].
   byte[] strAsByteArray = input.getBytes();
   byte[] result = new byte[strAsByteArray.length];
// Store result in reverse order into the
// result byte[]
   for (int i = 0; i < strAsByteArray.length; i++)
   result[i] = strAsByteArray[strAsByteArray.length - i - 1];  
   System.out.println(new String(result));
    }
}
