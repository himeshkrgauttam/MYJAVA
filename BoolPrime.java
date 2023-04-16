import java.util.Scanner;
class BoolPrime {
public static void main(String args[]){
boolean bb = false;
int i;
System.out.println("Enter a number to check if it is a PRIME NO. or NOT");
Scanner sc = new Scanner (System.in);
int num = sc.nextInt();
// scanner.close();

i = 2;
// System.out.println(num%i);

while ( i < (num - 1))
{
if ((num % i) != 0)
	bb = true;
i=i+1;
};

if (bb = false)
	System.out.println("PRIME");
else
	System.out.println("NOT PRIME");
}
}

	