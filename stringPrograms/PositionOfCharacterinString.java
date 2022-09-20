package stringPrograms;
import java.util.Scanner;
public class PositionOfCharacterinString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		int indexPosition=s.indexOf(ch);
		System.out.println("The Index Position Of The Given Character:"+indexPosition);
	}

}
