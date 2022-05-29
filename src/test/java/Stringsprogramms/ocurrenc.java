package Stringsprogramms;

import java.util.HashSet;

public class ocurrenc {
	public static void main(String[] args) {
		String str="kahtam ta ta bye bye ";
		String[] s = str.split("");
		String s1="";
		HashSet<String> lhs=new HashSet<String>();
		
		for(int i=0;i<s.length;i++)
		{
			lhs.add(s[i]);
		}
		for(String allele:lhs)
		{
			int count=0;
			for(int i=0;i<s.length;i++)
			{
				
				if(allele.equals(s[i]))
				{
					String s2=s[i];
					char[] ch=s2.toCharArray();
					for(int j=ch.length-1;j>=0;j--)
					{
 						System.out.print(ch[j]);
					}
					System.out.print(" ");
				}
			}
		}
	}

}
