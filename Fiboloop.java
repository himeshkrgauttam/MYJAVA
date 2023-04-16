//Program to find the fibonacci series using for loop*/
public class  Fiboloop{
  public static void main (String args[]) {
int count = 14,num1 = 0, num2 =1;
System.out.println("Fibonacci series of "+count+" numbers:");
    for (int i = 1; i <= count; ++i)  {
     System.out.println(num1+" ");
//On each iteration, we are assigining secound number to the first number and assignmentthe sum of last two numbers to the secound no.*/
	int sumofpervTwo =num1 + num2;
	num1 = num2;
	num2 = sumofpervTwo; }}}