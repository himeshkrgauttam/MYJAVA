class preposT{

public static void main(String args[]) {
int x=0;
int y=0;

System.out.println("x and y are "+x+"and"+y);
x++;
System.out.println("x++results in"+ x);
++x;
System.out.println("++xresults in"+ x);
System.out.println("Resetting x back to 0");
x=0;
System.out.println("____________");
y =x++;
System.out.println("y=x++(postfix)result in:");
System.out.println("x is"+ x);
System.out.println("y is"+ y);
System.out.println("______________");

y = ++x;
System.out.println("y=++x(prefix)result in:");
System.out.println("x is"+ x);
System.out.println("y is"+ y);
System.out.println("______________");

}
}




