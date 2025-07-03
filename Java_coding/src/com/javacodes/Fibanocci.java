package com.javacodes;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int n1 = 0;
		int n2 = 1;

		int res = 0;
		while (i < n) {
			System.out.println(n1);

			res = n1 + n2;
			n1 = n2;
			n2 = res;
			i++;

		}

		for(int j = 0;j<n; j++) {
			System.out.println("\t"+  fib(j) + " ");
		}
	}
	

	public static int fib(int n) {
		if(n<=1)
			return n;
		
		return fib(n-1) + fib(n-2);
	}


}
