class BooleanPrime {
public static void main(string args[]){
static boolean is prime(int n)
{
	//corner case 
	if (n <= 1)
         return false;
        
	//check from 2 to n-1
	for (int i = 2; i < n; i++) 
	  if (n % i == 0)
 		return false;
	return true;
  }
//driver program

	if (isPrime(11))
	system.out.println(" true"):
	else
	system.out.println(" false"):
	if (isPrime(15))
	system.out.println(" true"):
	else
	system.out.println(" false"):
}
}

	