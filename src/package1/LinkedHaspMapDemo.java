package package1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHaspMapDemo {

	public static void main(String[] args) {

		String input = "aaabccddddaa";
		String output = "a3b1c2d4a2";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		int counter = 1;
		Character c = null;
		for (int i = 0; i < input.length(); i++) {

			c = input.charAt(i);

			if (i + 1 == input.length() - 1) {
				if (input.charAt(i) == input.charAt(i + 1)) {
					counter++;
					System.out.println("" + c + counter);
					map.put(c, counter);
				} else {
					counter = 1;
					System.out.println("" + c + counter);
					map.put(c, counter);
					
				}
				break;
			}

			if (input.charAt(i) == input.charAt(i + 1)) {
				counter++;
			} else {
				System.out.println("" + c + counter);
				map.put(c, counter);
				counter = 1;
			}
		}
	}

}
