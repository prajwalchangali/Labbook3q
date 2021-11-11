package Labbook3q.Q2;

import java.util.Scanner;

public class Exercise2 {
	public void getImage(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(str + "|" + sb);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		Exercise2 lb = new Exercise2();
		lb.getImage(str);
	}
}
