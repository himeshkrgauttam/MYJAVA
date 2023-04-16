/*THIS PROGRAM SHOWS HOW TO CALCULATE FACTORIAL OF A NUMBERS.*/
class NumberFactorial{
public static void main(String[] args){
int number = 5;
/**Factorial of any number is !n .for example,factorial of 4 is 4*3*2*1.*/
int factorial = number;
for(int i =(number - 1);i > 1; i--)
{factorial = factorial * i;}
System.out.println("Factorial of a numbers is " + factorial);}}
