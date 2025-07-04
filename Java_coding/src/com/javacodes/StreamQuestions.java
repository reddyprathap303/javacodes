package com.javacodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamQuestions {

	public static void main(String[] args) {

		var str = "HelloWorld";

		if (str instanceof String s) {
			System.out.println(s.toUpperCase());
		}

		String res = str.chars().filter(ch -> !"aeiouAEIOU".contains(String.valueOf((char) ch)))
				.mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
		System.out.println(res);

		List<String> names = Arrays.asList("prathap", "amma", "shiva", "ram");
		List<String> toUpper = names.stream().map(String::toUpperCase).toList();
		System.out.println(toUpper);

		// length of each word
		String str1 = "Welcome to india";
		Map<String, Integer> wordLength = Arrays.stream(str1.split(" "))
				.collect(Collectors.toMap(word -> word, String::length));
		System.out.println(wordLength);
	}

}
