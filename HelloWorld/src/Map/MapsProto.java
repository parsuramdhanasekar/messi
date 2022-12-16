package Map;

import java.util.HashMap;
import java.util.Map;

public class MapsProto {
	public static void Messi(String name) {
		Map<Character, Integer> hash = new HashMap<>();
		char[] input = name.toCharArray();
		for (char a : input) {

			if (hash.containsKey(a)) {
				hash.put(a, hash.get(a) + 1);
				

			} else {
				hash.put(a, 1);
			}

		}
		System.out.println(name + " " + hash);

	}

	public static void main(String[] args) {
		Messi("Arsenal" + "" + "");
	}
}
