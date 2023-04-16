class javafibo{
public static void main(String[] args){
//numbers of element to generate in a series
int limit = 20;
long[] series = new long[limit];
//create first 2 series elements
series[0] = 0;
series[1] = 1;
//create the fibonacci series and store it is an array
for(int i=2; i < limit; i++){
series[i] = series[i-1] + series[i-2];}
//print the fibonacci series numbers
System.out.println("Fibonacci series upto" + limit);
for (int i=0; i < limit;i++)
{
System.out.print(series[i]+"\n");

}}}



