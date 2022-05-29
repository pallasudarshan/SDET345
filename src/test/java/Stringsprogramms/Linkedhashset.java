package Stringsprogramms;

import java.util.LinkedHashSet;

public class Linkedhashset {
	public static void main(String[] args) {
		String s="Superstar";
		LinkedHashSet<Character>link=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			link.add(s.charAt(i));
		}
		for(Character ch:link)
		{   
			
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch.equals(s.charAt(i)))
				{
					count++;
				}
			}
			
			System.out.println(ch+"  "+"count0 is"+"  "+count);
		}
	}

}
