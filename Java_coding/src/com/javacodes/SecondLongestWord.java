package com.javacodes;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLongestWord {
	public static void main(String[] args) {

		String str = "I am lerning java streams";

		String res = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1)
				.findFirst().get();
		System.out.println(res);

		// -----------------------------------------
		// Second highest length word

		long len = Arrays.stream(str.split(" ")).map(x -> x.length()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println(len);

	}

}
