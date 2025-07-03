package com.javacodes;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsInAString {

	public static void main(String[] args) {

		String str = "I am learning java";

		Map<Object, Object> vowelsCount = Arrays.stream(str.split(" "))
				.collect(Collectors.toMap(word -> word,
						word -> word.chars().mapToObj(c -> (char) c).filter(c -> "aeiouAEIOU".indexOf(c) != -1).count(),
						(e2, e1) -> e1, LinkedHashMap::new));
		System.out.println(vowelsCount);

	}

}
