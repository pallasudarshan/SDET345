package Stringsprogramms;

public class OccurenceOfLetter {

	public static void main(String[] args) {
		String s="mahabharat";
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			char ch1=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2 && i>j)
				{
					break;
				}
				if(ch1==ch2)
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(ch1 +" is present "+count+" times");
		}
	}
}
