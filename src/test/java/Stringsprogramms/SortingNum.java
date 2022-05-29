package Stringsprogramms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SortingNum {
	public static void main(String[] args) {
		String s="123123123";
		
		HashSet<Character>link=new HashSet<Character>();
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
			
			System.out.println(" ");
		}
	}
	}

