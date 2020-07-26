package epamcom.LamdasandStreamsJava8;

import java.util.*;
import java.util.function.Predicate;

class PalindromeCheck {
	 public static boolean isPalindrome(String str) {
			StringBuilder string = new StringBuilder(str);
			string.reverse();
			return string.toString().equals(str);
		}

}
 class  CheckingPalindromes {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			List<String> strings  = new ArrayList<String>();
			System.out.println("Enter size of the list");
			int size = s.nextInt();
			System.out.println("Enter the strings");
			for(int i = 0; i < size; i++) {
				strings.add(s.next());
			}
			List<String> palindromeStr = CheckingPalindromes.filter(strings, PalindromeCheck::isPalindrome);
			System.out.println("Strings that are palindromes are : " + palindromeStr);	
		}
		public static List<String> filter(List<String> strings, Predicate<String> palinPredicate) {
			List<String> palinList = new ArrayList<String>();
			for(String str:strings) {
				if(palinPredicate.test(str)) {
					palinList.add(str);
				}
			} return palinList;
		}
 }