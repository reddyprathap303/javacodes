package com.javacodes;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfWord {

	public static void main(String[] args) {

		String str = "I am learning java along with java codes";

		Map<String, Long> occur = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(occur);
	}

}
