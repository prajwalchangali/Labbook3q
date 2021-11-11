package Labbook3q.Q1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
        int temp,sum=0;
        String str=sc.nextLine();
        sc.close();
        StringTokenizer ex=new StringTokenizer(str," ");
        while(ex.hasMoreTokens())
        {
        	temp=Integer.parseInt(ex.nextToken());
        	sum+= temp;        	
        }
        System.out.println("sum: "+sum);
	}

}
