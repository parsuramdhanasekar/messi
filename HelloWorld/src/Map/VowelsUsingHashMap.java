package Map;

import java.util.LinkedHashMap;

public class VowelsUsingHashMap {
	public static void main(String[] args) {
		String input = "FIFA";
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
		hashMap.put('A', 0);

		hashMap.put('E', 0);
		hashMap.put('I', 0);
		hashMap.put('O', 0);
		hashMap.put('U', 0);
		for (int i = 0; i < input.length(); i++) {
			if (hashMap.containsKey(input.charAt(i))) {
				int count = hashMap.get(input.charAt(i));
				hashMap.put(input.charAt(i), ++count);
				{
					System.out.println(hashMap);
				}
			}

		}
	}
}
