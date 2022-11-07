package l04;

/**
 * Ввести текст. У тексті знайти та вивести всі слова-паліндроми (однаково читається в обох напрямках - зліва направо та справа наліво. 
 * Наприклад: "noon", "civic", "radar", "level", "rotor", "refer").
 * @author Pogrebnyi Maksym KN-921V
 */

public class replaceText {
		
	 static void replace(String s1, String s2) {
				String st1 = Palindrome(s1);
				String st2 = Palindrome(s2);
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

		static boolean isPalindrome(String s1, String s2){
		    if (s1.equals(s2))
		    {
		        return true;
		    }
		    else {
		        return false;
		    }
		}

	}
