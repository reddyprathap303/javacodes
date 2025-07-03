package com.javacodes;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "prathapr";

		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
		System.out.println(map);
		
	System.out.println( map.entrySet().stream().filter(res->res.getValue()==1).findFirst().get().getKey());
		
	}

}
