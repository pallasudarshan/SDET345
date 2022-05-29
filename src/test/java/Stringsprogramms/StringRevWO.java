package Stringsprogramms;

public class StringRevWO {

	public static void main(String[] args) {
		String s = "khatam ta ta bye bye";
		char[] a = s.toCharArray();
		int count=0;
		String rev="";
		for (char c : a) {
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
}
