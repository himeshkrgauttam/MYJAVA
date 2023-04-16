class SwitchmDemo{
public static void main(String args[]){
int marks = Integer.parselnt(args[0]);
//Take Marks as command line argument.
switch(marks/10){
case 10:
case 9:
case 8:
System.out.println("Excellent");
break;
case 7:
System.out.println("Very good");
break;
case 6:
System.out.println("Good");
break;
case 5:
System.out.println("Work Hard");
break;
case 4:
System.out.println("Poor"); 
break;
case 3:
case 2:
case 1:
case 0:
System.out.println("Very Poor"); 
break;
default:
System.out.println("Invalid Value Entered"); }}}
