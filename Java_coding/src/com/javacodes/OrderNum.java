package com.javacodes;

import java.util.Arrays;
import java.util.Collections;

public class OrderNum {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,5,4,6};
		
		Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::print);
	}

}
