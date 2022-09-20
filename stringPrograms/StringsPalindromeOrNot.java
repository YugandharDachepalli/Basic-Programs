package stringPrograms;

public class StringsPalindromeOrNot 
{
  public static void main(String[] args) 
  {
	  String s="Mom";
	  String s1="";
	  for (int i = s.length()-1;i>=0; i--)
	 {
		char ch=s.charAt(i);
		s1=s1+ch;
	 }
	 // if(s.equals(s1))
	  if(s.equalsIgnoreCase(s1))//Ignore the case
	  {
		  System.out.println("The Given String is Palindrome");
	  }
	  else
		  System.out.println("The Given String is Not a palindrome");
		
  }

}
