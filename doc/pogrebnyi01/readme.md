# 1. Структура програми мовою Java. Типи даних, літерали, операції і оператори

# Тема

Ознайомлення з JDK платформи Java SE та середовищем розробки Eclipse IDE.

# 1. Вимоги

Вирішити три прикладні задачі на мові Java в середовищі Eclipse
Продемонструвати покрокове виконання програми та результати роботи в режимі налагодження, не використовуючи виведення до консолі
Виконати компіляцію і запуск програми в командному рядку за допомогою відповідних утиліт JDK

1.1 Розробник

Погребний Максим Русланович
КН-921в
15 варіант

1.2 Загальне завдання

Продемонструвати роботу відлагодника
Скомпілювати проект у терміналі
Оформити роботу

1.3 Задача

Обрати тип змінних та встановити за допомогою констант та літералів початкові значення:
число, що відповідає номеру залікової книжки за допомогою шістнадцяткового літералу;
число, що відповідає номеру мобільного телефона (починаючи з 380...) за допомогою десяткового літералу;
число, яке складається з останніх двох ненульових цифр номера мобільного телефону за допомогою двійкового літералу;
число, яке складається з останніх чотирьох ненульових цифр номера мобільного телефону за допомогою вісімкового літералу;
визначити збільшене на одиницю значення залишку від ділення на 26 зменшеного на одиницю номера студента в журналі групи;
символ англійського алфавіту в верхньому регістрі, номер якого відповідає знайденому раніше значенню.
Використовуючи десятковий запис цілочисельного значення кожної змінної знайти і підрахувати кількість парних і непарних цифр.
Використовуючи двійковий запис цілочисельного значення кожної змінної підрахувати кількість одиниць.

# 2. Опис програми
Особливості рішення не має;

Структура программи:

Головний клас з точкою входа в програму знаходиться у пакеті: l01;
Код програми та брейкпоінти, що будуть використовуватись відлагодником для перевірки роботи програми:
![Alt text](https://github.com/Makson4ikk/java-project/blob/main/doc/pogrebnyi01/assets/debug1.png)
Відлагодження програми та показ результатів виконання:
![Alt text](https://github.com/Makson4ikk/java-project/blob/main/doc/pogrebnyi01/assets/debug2.png)
![Alt text](https://github.com/Makson4ikk/java-project/blob/main/doc/pogrebnyi01/assets/debug3.png)

Компіляція програми у терміналі:
![Alt text](https://github.com/Makson4ikk/java-project/blob/main/doc/pogrebnyi01/assets/console.png)
# 2.1 Засоби ООП
Java code convention
JDK:
# 2.2 Ієрархія та структура класів
Програма має лише один клас
# 2.3 Важливі фрагменти програми:
package l01;


/**
 * Завдання: Обрати тип змінних та встановити за допомогою констант та літералів початкові значення.
 * Використовуючи десятковий запис цілочисельного значення кожної змінної знайти і підрахувати кількість парних і непарних цифр.
 * Використовуючи двійковий запис цілочисельного значення кожної змінної підрахувати кількість одиниць.
 *
 * @author Pogrebnyi Maksym KN-921V
 *
 * @Version 1.0
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

# Варіанти використання
-

# Висновки
На цій лабораторній роботі навчились працювати з дебагером, літералами, консолью
