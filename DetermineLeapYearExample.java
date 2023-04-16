/*DETERMINE IF YEAR IS LEAP YEAR JAVA EXAMPLS THIS DETERMINE IF YEAR IS YEAR IS LEAP YEAR JAVA EXAMPLE SHOWS HOW TO DETERMINE WHETHER THE GIVEN YEAR IS LEAP YEAR OR NOT.*/

class DetermineLeapYearExample{
public static void main(String [] args){
//Year we want to check
int year = 2004;
//If year is divisible by 4, it is a leap year
if((year % 400 == 0) || ( (year % 4 == 0) && (Year % 100 != 0)) )
System.out.println("year" + year +" is a leap year");
else 
System.out.println("year" + year +" is Not a leap year ");}}



