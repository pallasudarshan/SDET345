package Stringsprogramms;

public class InterviewQ {

	public static void main(String[] args) {
		String s="abc123efg456";
		String temp="";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
		
				int temp1=Character.getNumericValue(s.charAt(i));
				sum=sum+temp1;
			}
		}
		System.out.println(sum);
	}
}
