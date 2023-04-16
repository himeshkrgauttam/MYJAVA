//WACP TO DISPLAY A TABLE OF 5*//

public class TableExample
{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");
//reading a number whose table is to be print
int num = sc.nextInt();
//loop start execution form and excute untill the condiucting
for(int i=1; i<=10;i++)
{
//print table of the entered number 
System.out.print(num+"*"+i+"="+num*i);
}
}
}
                                         