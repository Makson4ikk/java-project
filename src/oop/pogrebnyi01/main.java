package l01;


/**
 * Завдання: Обрати тип змінних та встановити за допомогою констант та літералів початкові значення.
 * Використовуючи десятковий запис цілочисельного значення кожної змінної знайти і підрахувати кількість парних і непарних цифр.
 * Використовуючи двійковий запис цілочисельного значення кожної змінної підрахувати кількість одиниць.
 *
 * @author Pogrebnyi Maksym KN-921V
 */


public class l01 {
	/** Number in the record book */
	
	static int decentNumber = 0x000F; // 15 => F
	
    /** Mobile phone number */
    static long phoneNumber = 380977122742L; //
    
    /** The last two non-zero digits in the phone number */
    static int twoLastNumber = 0b101010; // 42 => 101010
    
    /** The last four non-zero digits of the phone number */
    static int fourLastNumber = 5266; // 2742 => 5266
    
    /** determine the increased by one value of the remainder from dividing by 26 the decreased by one student number in the group log */
    static int someName = ((15 - 1) % 26) + 1;
    
    /** A character of the English alphabet in upper case, the number of which corresponds to the previously found value */
    static char letter = 'A';
    
    /**
     * Counts odd numbers
     * @return number of odd
     * @param  a set of numbers from which odd numbers will be counted */

    static int oddCount(long... value) {
        int oddCount = 0;
        for (int i = 0; i < value.length; i++)
            if (value[i] % 2 == 0)
                oddCount++;
        return oddCount;
    }
    
    /**
     * Counting units
     * @return the number of units
     * @param a set of numbers from which units will be counted */

    static int oneCount(long... value) {
        int oneCount = 0;
        for (int i = 0; i < value.length; i++) {
            while (value[i] != 0) {
                if (value[i] % 2 != 0)
                    oneCount++;
                value[i] /= 2;
            }
        }
        return oneCount;
    }
    

    /** Entry point */

	public static void main(String... args) {
        System.out.println("Непарні: " + oddCount(decentNumber, phoneNumber,twoLastNumber, fourLastNumber, someName, letter));
        System.out.println("Одиниці: " + oneCount(decentNumber, phoneNumber,twoLastNumber, fourLastNumber, someName, letter));
	}

}
