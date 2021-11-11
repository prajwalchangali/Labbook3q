package Labbook3q.Q4;

import java.util.Scanner;

public class Exercise4 {
	int modifyNumber(int num) {
        String str = Integer.toString(num);
        int rem=0;
        
        StringBuffer sb = new StringBuffer();
        for(int i =0 ; i < str.length()-1 ;i++) {
        int    temp = str.charAt(i+1) - str.charAt(i);
            sb.append(Math.abs(temp));
        }
        if(str.length() % 10 != 0) {
             rem = num%10;
        }
       sb.append(rem);
        int n = Integer.parseInt(sb.toString());
        return n;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = sc.nextInt();
        sc.close();
        Exercise4 ex = new Exercise4();
        int x = ex.modifyNumber(num);
        System.out.println(x);
    }

}
