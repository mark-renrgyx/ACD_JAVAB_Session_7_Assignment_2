package week1.day7.assignment2;

public class SortingMain {

	public static void main(String[] args) {
		String test1 = "let's try it";
		StringBuilder r1 = StringSorter.sortEverything(test1);
		System.out.println(r1);
		
		String test2 = "fga dca acb";
		StringBuilder r2 = StringSorter.sortEverything(test2);
		System.out.println(r2);
		
		String test3 = null;
		StringBuilder r3 = StringSorter.sortEverything(test3);
		System.out.println(r3);
		
		test3 = "b";
		r3 = StringSorter.sortEverything(test3);
		System.out.println(r3);
	}
}
