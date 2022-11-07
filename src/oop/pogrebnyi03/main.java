package l03;

/**
 * Ввести текст. У тексті знайти та вивести всі слова-паліндроми (однаково читається в обох напрямках - зліва направо та справа наліво. 
 * Наприклад: "noon", "civic", "radar", "level", "rotor", "refer").
 * @author Pogrebnyi Maksym KN-921V
 */

import java.util.*;
public class l03 {
	

	public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);

		    System.out.println("Enter the string");

		    String st1 = s.nextLine();

		    String st2 = Palindrome(st1);
		    if (isPalindrome(st1,st2)==true)
		    {
		        System.out.println("palindrome");
		    }
		    else {
		        System.out.println("Not palindrome");
		    }
		}

		private static String Palindrome(String s) {
		    StringBuilder stringBuilder = new StringBuilder(s);
		    return String.valueOf(stringBuilder.reverse());
		}

		private static boolean isPalindrome(String s1, String s2){
		    if (s1.equals(s2))
		    {
		        return true;
		    }
		    else {
		        return false;
		    }
		}
	}
