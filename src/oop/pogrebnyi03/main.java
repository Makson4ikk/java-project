package l03;

/**
 * Ввести декілька рядків. Упорядкувати, а потім вивести рядки за алфавітом (перший пріоритет) та в порядку зростання їх довжини (другий пріоритет).
 * @author Pogrebnyi Maksym KN-921V
 */

import java.util.*; 


public class l03 {

	private static Scanner scanner;
	private static String textTwo;
	private static String textOne;
	
	/**
     Start function
     */
	
	static void sortText (String textOne, String textTwo) {
		System.out.print("\n");
		sortAplphabet(textOne, textTwo);
		count(textOne, textTwo);
	}
	
	/**
      Sorting text
     */
	
	static void sortAplphabet (String textOne, String textTwo) {		
		String letterOne = Character.toString(textOne.charAt(0));
		String letterTwo = Character.toString(textTwo.charAt(0));

		ArrayList<String> abc = new ArrayList<String>(); 
		abc.add(letterOne); 
		abc.add(letterTwo); 

		Collections.sort(abc); 
		Iterator<String> itr=abc.iterator();  
		
		if (itr.next() == letterOne) {
			System.out.println("First letter is: "+letterOne);
			System.out.println(textOne);
			System.out.println("Second letter is: "+letterTwo);
			System.out.println(textTwo);
		} else {
			System.out.println("Second letter is: "+letterTwo);
			System.out.println(textTwo);
			System.out.println("First letter is: "+letterOne);
			System.out.println(textOne);
		}
		System.out.println("\n");

	}
	/**
     Count letter in sting
     */
	
	static void count (String textOne, String textTwo) {
		
		int lengthOne = textOne.length();
		int lengthTwo = textTwo.length();
	
		if (lengthOne > lengthTwo) {
			System.out.println("Count length text One: " +  textOne.length());
			System.out.println(textOne);
			System.out.println("Count length text Two: " +  textTwo.length());
			System.out.println(textTwo);

		} else {
			System.out.println("Count length text Two: " +  textTwo.length());
			System.out.println(textTwo);
			System.out.println("Count length text One: " +  textOne.length());
			System.out.println(textOne);
		}
			
	}
 	
    /**
     Console application entry point
     */
	
    public static void main(String[] args) {

    	scanner = new Scanner(System.in);
		System.out.println("1 line: ");
		textOne = scanner.nextLine();
		System.out.println("2 line: ");
		textTwo = scanner.nextLine();
		
		sortText(textOne, textTwo);
    }

}
