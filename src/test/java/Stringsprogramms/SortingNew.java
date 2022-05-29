package Stringsprogramms;

import java.util.LinkedHashSet;

public class SortingNew {
	public static void main(String[] args) {
		String s="abcabcabc";
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
				System.out.print(ch);
				}
			}
			
			System.out.println("");
		}
	}
}

