# 4. Інтерактивні консольні програми для платформи Java SE∗

# Тема

Реалізація діалогового режиму роботи з користувачем в консольних програмах мовою Java.

# 1. Вимоги

Використовуючи програму рішення завдання лабораторної роботи №3, відповідно до прикладної задачі забезпечити обробку команд користувача у вигляді текстового меню:

введення даних;

перегляд даних;

виконання обчислень;

відображення результату;

завершення програми і т.д.

Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:

параметр "-h" чи "-help": відображається інформація про автора програми, призначення (індивідуальне завдання), детальний опис режимів роботи (пунктів меню та параметрів командного рядка);

параметр "-d" чи "-debug": в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та перевірку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.

# 1.1 Розробник

Погребний Максим Русланович

КН-921в

15 варіант

# 1.2 Загальне завдання

Розробити прогрму

Оформити роботу

# 1.3 Задача

див. у 1

# 2. Опис програми

Структура программи:

Головний клас з точкою входа в програму знаходиться у пакеті: l04

Графичний інтерфейс знаходится у классі uiInterface;

Робота з текстом реалізована у классі replaceText;

Компіляція програми у терміналі:

	{
	Words changing
	[Enter a number to choose an action]
	1 - Enter the string
	2 - Display values
	3 - Run program
	4 - Exit

	1
	Enter the string1: 
	fire
	Enter the string2: 
	member
	
	Words changing
	[Enter a number to choose an action]
	1 - Enter the string
	2 - Display values
	3 - Run program
	4 - Exit
	
	2
	fire
	member
	
	Words changing
	[Enter a number to choose an action]
	1 - Enter the string
	2 - Display values
	3 - Run program
	4 - Exit
	
	3
	Not palindrome

	Words changing
	[Enter a number to choose an action]
	1 - Enter the string
	2 - Display values
	3 - Run program
	4 - Exit
	
	-d
	Not palindrome
	
	Words changing
	[Enter a number to choose an action]
	1 - Enter the string
	2 - Display values
	3 - Run program
	4 - Exit
	
	-debug
	Not palindrome
	
	Words changing
	[Enter a number to choose an action]
	1 - Enter the string
	2 - Display values
	3 - Run program
	4 - Exit
	
	-h
	Author: Pogrebnyi Maksym KN-921V
	
	1:
	Setting a value for the program
	
	2:
	Show entered values
	
	3:
	We start the program
	
	4:
	Exit program

	Task: Використовуючи програму рішення завдання лабораторної роботи №3, відповідно до прикладної задачі забезпечити обробку команд користувача у вигляді текстового меню:
	
	введення даних;
	перегляд даних;
	виконання обчислень;
	відображення результату;
	завершення програми і т.д.
	Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:

	параметр "-h" чи "-help": відображається інформація про автора програми, призначення (індивідуальне завдання), детальний опис режимів роботи (пунктів меню та параметрів командного рядка);
	параметр "-d" чи "-debug": в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та перевірку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.


	Words changing
	[Enter a number to choose an action]
	1 - Enter the string
	2 - Display values
	3 - Run program
	4 - Exit
	
	-help
	Author: Pogrebnyi Maksym KN-921V
	
	1:
	Setting a value for the program
	
	2:
	Show entered values
	
	3:
	We start the program
	
	4:
	Exit program
	
	Task: Використовуючи програму рішення завдання лабораторної роботи №3, відповідно до прикладної задачі забезпечити обробку команд користувача у вигляді текстового меню:
	
	введення даних;
	перегляд даних;
	виконання обчислень;
	відображення результату;
	завершення програми і т.д.
	Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:
	
	параметр "-h" чи "-help": відображається інформація про автора програми, призначення (індивідуальне завдання), детальний опис режимів роботи (пунктів меню та параметрів командного рядка);
	параметр "-d" чи "-debug": в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та перевірку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.
	
	
	Words changing
	[Enter a number to choose an action]
	1 - Enter the string
	2 - Display values
	3 - Run program
	4 - Exit

	4
	
# 2.1 Засоби ООП

Java code convention

JDK:

StringBuiler

OOP

# 2.2 Ієрархія та структура класів

l04

uiInterface

replaceText

2.3 Важливі фрагменти програми:

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
  
# Варіанти використання

--

# Висновки

На цій лабораторній роботі навчились працювати з основами ООП
