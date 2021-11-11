package Labbook3q.Q6;

public class Exercise6 {
	
	public static void main(String[] args)
	{
	String str="abcdef";
	System.out.println(PositiveString(str));

	}

	public static Boolean PositiveString(String str)
	{
	str.toLowerCase();
	   int count=0;
	  for(int i=0;i<str.length();i++){

	      if(i<str.length()-1 && (int)str.charAt(i) < (int)str.charAt(i+1)) {
	          count++;
	       }
	}
	count++;
	if(count==str.length())
	return true;

	return false;
	}

}
