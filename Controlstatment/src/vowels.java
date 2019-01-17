import java.util.Scanner;
class vowel
{public static void main (String args[]){
	System.out.println("enter the character to be checked");
	Scanner s=new Scanner(System.in);
	char b=s.next().charAt(0);
	if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
	System.out.println("its a vowel");
	else
	System.out.println("not a vowel");
}


}