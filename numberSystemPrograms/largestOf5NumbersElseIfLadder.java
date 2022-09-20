package numberSystemPrograms;
public class largestOf5NumbersElseIfLadder 
{
	public static void main(String[] args) 
	{
		int a=99;
		int b=999;
		int c=900;
		int d=22;
		int e=555;
		if(a>b&&a>c&&a>d&&a>e)
		{
			System.out.println(a+" Is A LargerNumber");
		}
		else if(b>c&&b>d&&b>e)
		{
			System.out.println(b+" Is A LargerNumber");
		}
		else if(c>d&&c>e)
		{
			System.out.println(c+" Is A LargerNumber");
		}
		else if(d>e)
		{
			System.out.println(d+" Is A LargerNumber");
		}
		else
			System.out.println(e+" Is A LargerNumber");
		
	}

}
