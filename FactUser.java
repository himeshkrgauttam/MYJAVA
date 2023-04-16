//Finding Factorial of a number entered by user 
import java.util.Scanner;
public class FactUser{
public static void main (String args[]) {
//we will find factorial of this number 
	int number;
System.out.println("Enter the number:");
Scanner scanner = new Scanner(System.in);
	number = scanner.nextInt();
	scanner.close();
	long fact = 1;
	int i = 1;
	while(i<=number)  {
	fact = fact * i; 
	i++;  }
    System.out.println("Factotrial of "+ number +" is :"+fact);     }}