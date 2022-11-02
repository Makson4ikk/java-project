package l02;
import java.util.Random;

/**
 * Завдання: Знайти найбільшу цифру в десятковому запису цілочисельного значення.
 *
 * @author Pogrebnyi Maksym KN-921B
 */


public class l02 {
	 /** An instance of a class Random */
    static Random random = new Random();
    
    /**
     * Finding the largest digit in a number
     */
    static int findBiggestNumber(int number) {
        if(number < 0) 
        	number *= -1;
        int biggestNumber = 0;
        while (number != 0) {
            if (number % 10 > biggestNumber)
            	biggestNumber = number % 10;
            number /= 10;
        }
        return biggestNumber;
    }
    
    /** Output variables to the console */

    static void print(int i, int number, int biggestNumber) {
    	System.out.println( "\n___________________________________________________\n");
        System.out.println("|#" + (i+1) +"| | Число: " + number + "| | Найбільша цифра: " + biggestNumber + "|");
        System.out.println("___________________________________________________");
    }
    
    /** Program Entry Point */

	public static void main(String... args) {
		for(int i = 0; i < 10; i++){
            int number = random.nextInt();
            int biggestNumber = findBiggestNumber(number);
            
            print(i, number, biggestNumber);
        }
		
	}

}
