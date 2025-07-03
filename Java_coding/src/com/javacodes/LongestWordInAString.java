package com.javacodes;

import java.util.Comparator;
import java.util.List;
 
public class LongestWordInAString {
	
	public static void main(String[] args) {
		
		String str = "I am learning java streams";
		String[] st = str.split(" ");
		List<String> list = List.of(st);
		
		String res = list.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(res);
		}

}
