package epamcom.LamdasandStreamsJava8;

import java.util.*;
import java.util.function.Consumer;
public class FindingAverage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		System.out.println("Enter all the elements and enter a character at the end");
		List<Integer> a = new ArrayList<Integer>();
		try {
			while(true) {
				a.add(s.nextInt());
			}
		} catch(Exception e) {
			
		}
		
		findAverage(a,(Integer n) -> System.out.println("Average of Integers: "+ (n / (float)size)));
	}
	
	public static void  findAverage(List<Integer> a, Consumer<Integer> consumer) {
		int sum = 0;
		for(int i : a) {
			sum=sum+i;
		}
		consumer.accept(sum);
	}

}