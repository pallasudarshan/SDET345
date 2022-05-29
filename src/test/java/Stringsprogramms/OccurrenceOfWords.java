package Stringsprogramms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccurrenceOfWords {
	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		String[] str = s.split(" ");
		//int strlen=slength.length;
		
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<str.length;i++)//adding data to hashset coollection
		{
			hs.add( str[i]);
			
		}
		for(String string:hs)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(string.equals(str[i]))
				{
					count++;
				}
			}
			
			System.out.println(string+"==="+count);
		}
		
	}
	
}
