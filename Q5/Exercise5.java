package Labbook3q.Q5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {
	
	 public static void main(String args[])throws IOException
	    {
	                int numberOfLine=1,numberOfWords=0;          
	                char ch;
	                Scanner sc=new Scanner(System.in);
	                System.out.print("\nEnter File name: ");
	                String str=sc.nextLine();
	                sc.close();
	                FileInputStream file=new FileInputStream(str);
	                int numberOfCharacters=file.available();
	                
	                
	                for(int i=0;i<numberOfCharacters;i++)
	                {
	                            ch=(char)file.read();
	                            if(ch=='\n')
	                                 numberOfLine++;
	                            else if(ch==' ')
	                                numberOfWords++;
	                                                               
	                }
	                System.out.println("\nNumber of lines : "+numberOfLine);
	                System.out.println("\nNumber of words : "+(numberOfLine+numberOfWords));
	                System.out.println("\nNumber of characters : "+numberOfCharacters);
	    }

}
