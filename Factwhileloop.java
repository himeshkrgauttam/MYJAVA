//Finding Factorial using While loop
import java.util.Scanner;
public class  FwlP{
  public static void main (String args[]) {
//we will find the factorial of this number
int num = 0, i = 0;
System.out.print("\nEnter a number : ");
Scanner mynum = new Scanner(System.in);
num = mynum.nextInt();
mynum.close();
i = num;
long  fact = 1;

While (num > 0)
{
	fact = fact * num;
	 num --;
};
System.out.println("Factorial of "+ i +" is : " +fact);  
}}