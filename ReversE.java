import java.util.Scanner;
public class ReversE{
   public static void main(String[] args) {
Scanner a = new Scanner(System.in);
System.out.print("Enter any number : ");
int num = a.nextInt();
a.close();
int dup = 0, rev = 0, dum = 0;
dup = num;
while (num > 0)
{
dum = num % 10;
rev = rev * 10 + dum;
num = num / 10;
};

System.out.println("The reverse of " + dup + " is " + rev);}}