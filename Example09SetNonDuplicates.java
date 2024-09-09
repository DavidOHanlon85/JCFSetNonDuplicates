package slideDeckChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example09SetNonDuplicates {

	public static void main(String[] args) {
		
		String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "peach", "white", "cyan", "peach", "gray", "orange"};
		
		List<String> list = new ArrayList<String>(Arrays.asList(colors));
		
		System.out.printf("List: %s\n", list);
		
		printNonDuplicates(list);
		
	}
	
	private static void printNonDuplicates(Collection<String> values) {
		
		Set<String> set = new HashSet<String>(values);
		
		System.out.print("Non duplicates are: ");
		
		for (String s: set) {
			System.out.printf("%s ", s);
			
			
		}
		
		System.out.println();
		
	}

}
