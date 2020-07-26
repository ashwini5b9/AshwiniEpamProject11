package epamcom.LamdasandStreamsJava8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StringsWithAandSize3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of list");
		int size = s.nextInt();
		System.out.println("Enter the values");
		List<String> strings  = new ArrayList<String>();
		for(int i = 0; i < size; i++) {
			strings.add(s.next());
		}
		List<String> resStrings  = find(strings, (String str) -> str.charAt(0) == 'a' && str.length() == 3);
		System.out.println("Strings starting with 'a' character and have length 3 are " + resStrings);
	}
	public static List<String> find(List<String> strings, Predicate<String> predicate) {
		List<String> result = new ArrayList<String>();
		for(String str : strings) {
			if(predicate.test(str)) {
				result.add(str);
			}
		} return result;
	}

}

