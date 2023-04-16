//Displaying fibonacci sequence using while loop*/
public class  FiboWhileloop{
  public static void main (String args[]) {
     int count = 7, num1 = 0, num2 = 1;
System.out.print("Fibonacci series of " + count + " numbers : ");
int i = 1;
while (i <= count) 
{
        System.out.println(num1+" ");
	int sumofpervTwo =num1 + num2;
	num1 = num2;
	num2 = sumofpervTwo; 
          i++; 
}}}