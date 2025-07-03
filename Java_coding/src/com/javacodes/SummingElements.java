package com.javacodes;

import java.util.Arrays;

public class SummingElements {
	public static void main(String[] args) {
		
		int[] arr = {1,3,4,5,6,7,3,2,7};
		
		int ans = Arrays.stream(arr).distinct().sum();

		System.out.print(ans);
	}

}
