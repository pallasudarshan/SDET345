package Stringsprogramms;

import java.util.HashSet;

public class OccurenceOfDuplicates {
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
			if(count>1)
			System.out.println(string+"==="+count);
		}
		
	}

}
