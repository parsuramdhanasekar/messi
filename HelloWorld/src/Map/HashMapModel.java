package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapModel {
	public static void main(String[] S) {
		Map<String, String> names = new HashMap<String, String>();
		names.put("Number", "123");
		names.put("names", "Scaloni");
		names.put("No", "100");
		for (Map.Entry<String, String> entry : names.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}

	}

}
