import java.util.Scanner;
class classquadratic
{
	public static void main(String[] args)
	{
	System.out.println("enter the coefficients of x^2,x and constant");
	int a,b,c;
	Scanner coefficient = new Scanner(System.in);
	System.out.println("Enter a:");
	a=coefficient.nextInt();
	System.out.println("Enter b:");
	b=coefficient.nextInt();
	System.out.println("Enter c:");
	c=coefficient.nextInt();
	double d=b*b-4*a*c;
	double root1,root2;
	if(d>0)
	{System.out.println("roots are real and unequal that are");
    root1=(-b+Math.pow(d,1/2))/(2*a);
    root2=(-b-Math.pow(d,1/2))/(2*a);
    System.out.println(root1+" "+root2);}
	else 
	if(d==0)
	{System.out.println("roots are real and equal that are");
    root1=(-b)/(2*a);
    root2=root1;
    System.out.println(root1+" "+root2);}
	else
	System.out.println("roots are imaginary and thus not available");
	}
}