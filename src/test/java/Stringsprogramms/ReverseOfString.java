package Stringsprogramms;

public class ReverseOfString {
	public static void main(String[] args) {
		String s="TestYantra";
		int count=s.length()-1;
		String rev="";
		for(int i=0 ;i<=count;i++)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
