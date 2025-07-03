package com.javacodes;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		String s = "abcdfdsf";
		
		s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
		Arrays.stream(s.split("")).distinct().forEach(System.out::println);
	}

}
