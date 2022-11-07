package l04;


import java.util.Scanner;
public class uiInterface {
	replaceText uiInterface = new replaceText();
	
	private static String st2;
	private static String st1;
	
	private Scanner scanner;
	
	
	/**
     * method to print help information
     * */
    public void help() {
    	System.out.println("Author: Pogrebnyi Maksym KN-921V\n");
    	System.out.println("1:\nSetting a value for the program\n");
    	System.out.println("2:\nShow entered values\n");
    	System.out.println("3:\nWe start the program\n");
    	System.out.println("4:\nExit program\n");
    	System.out.println("Task: Використовуючи програму рішення завдання лабораторної роботи №3, відповідно до прикладної задачі забезпечити обробку команд користувача у вигляді текстового меню:\r\n"
    			+ "\r\n"
    			+ "введення даних;\r\n"
    			+ "перегляд даних;\r\n"
    			+ "виконання обчислень;\r\n"
    			+ "відображення результату;\r\n"
    			+ "завершення програми і т.д.\r\n"
    			+ "Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:\r\n"
    			+ "\r\n"
    			+ "параметр \"-h\" чи \"-help\": відображається інформація про автора програми, призначення (індивідуальне завдання), детальний опис режимів роботи (пунктів меню та параметрів командного рядка);\r\n"
    			+ "параметр \"-d\" чи \"-debug\": в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та перевірку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.\r\n");
    }

    public void debug() {
    	replaceText.replace(st1, st2);
    }

	
	private boolean matchOptions(String values) {
        boolean result = false;
        switch (values) {
        case "1":
        	scanner = new Scanner(System.in);
    		System.out.println("Enter the string1: ");
    		st1 = scanner.nextLine();
    		System.out.println("Enter the string2: ");
    		st2 = scanner.nextLine();
            	break;
            case "2":
            	System.out.print(st1 + "\n");
            	System.out.print(st2 + "\n");
                break;
            case "3":
            	replaceText.replace(st1, st2);
            	break;
            case "4":
                System.exit(0);
                break;
            case "-h":
            case "-help":
            	help();
                break;
            case "-d":
            case "-debug":
            	debug();
                break;
            default:
                System.out.println("You printed wrong value!");
        }
        return result;
    }
    public void start() {
        System.out.println();
        System.out.println("Words changing");
        System.out.println("[Enter a number to choose an action]");
        System.out.println("1 - Enter the string");
        System.out.println("2 - Display values");
        System.out.println("3 - Run program");
        System.out.println("4 - Exit");
        System.out.println();
        scanner = new Scanner(System.in);
		String value = scanner.nextLine();
        if (matchOptions(value)) {
        	System.out.print("Done");
        } else {
            start();
        }
    }
}
