package Stringsprogramms;

import java.util.ArrayList;
import java.util.List;

public class Vowels {
	public static void main(String[] args) {
		String s="india";
		int count=0;
		ArrayList<Character> lhs=new ArrayList<Character>();//india -3//duplicates
		
		//		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();//india -2
	    for(int i=0;i<s.length();i++)
	    {
	    	lhs.add(s.charAt(i));
	    }
	    for(Character ch:lhs)
	    {
	    
	    	 if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
	    	 {
	    		 count++;
	    	 }
	    	     		    
	    }
	  
	   
	    System.out.println(s+": "+count);
	}

}
