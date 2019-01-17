import java.util.Scanner;
class classmonth
{
	public static void main(String[] args)
	{ int ch;
	System.out.println("enter a no. between 1 and 12");
	Scanner s=new Scanner(System.in);
	ch=s.nextInt();
	switch(ch)
	{
	case 1:
	{if(ch==1)
	System.out.println("the month is january");
	break;}
	case 2:
	{if(ch==2)
	System.out.println("the month is february");
	break;}	
	case 3:
    {if(ch==3)
    	System.out.println("the month is march");
    	break;}
    case 4:
    {if(ch==4)
    	System.out.println("the month is april");
    break;}
    case 5:
    {if(ch==5)
    	System.out.println("the month is may");
    	break;}
    	case 6:
    {if(ch==6)
    System.out.println("the month is june");
    break;}
    case 7:
    {if(ch==7)
    System.out.println("the month is july");
    break;}
    case 8:
    {if(ch==8)
    System.out.println("the month is august");
    break;}
    case 9:
    {if(ch==9)
    System.out.println("the month is september");
    break;}
    case 10:
    {if(ch==10)
    System.out.println("the month is october");
    break;}
    case 11:
    {if(ch==11)
    System.out.println("the month is november");
    break;}
    case 12:
    {if(ch==12)
    System.out.println("the month is december");
    break;}
    default:
    System.out.println("error choice");
    }
    }	
	

}