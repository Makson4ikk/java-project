package l02;
import java.util.Random;

/**
 * Завдання: Знайти найбільшу цифру в десятковому запису цілочисельного значення.
 *
 * @author Pogrebnyi Maksym KN-921B
 */


public class l02 {

	 static Random random = new Random();
		 
	 public static void main(String... args) {
	 int n = (int) ( Math.random() * 30 );
	 int i;           
	 	for(i=2; i<n ;i++) {
	         if (n%i==0)
	            System.out.println(" "+ n +" - является составным ");
	          else
	            System.out.println(" "+ n +"  - является простым ");
	        }
	        
	    }
	 
}
