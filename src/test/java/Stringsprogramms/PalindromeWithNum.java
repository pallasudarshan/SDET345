package Stringsprogramms;

public class PalindromeWithNum {
	public static void main(String[] args) {
		String s="323";
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
