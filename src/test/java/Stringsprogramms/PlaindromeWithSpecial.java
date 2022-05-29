package Stringsprogramms;

public class PlaindromeWithSpecial {
	public static void main(String[] args) {
		String s="#&#";
		int count=0;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) 
	
			
			System.out.println(rev+" is Palindrome");
	
			
	
		else 
			System.out.println(rev+" is not Pallindrome");
			
	}

}
