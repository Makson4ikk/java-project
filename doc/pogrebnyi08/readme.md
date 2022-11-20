# 8. Основи введення/виведення Java SE

# Тема

Оволодіння навичками управління введенням/виведенням даних з використанням класів платформи Java SE.

# 1. Вимоги

Забезпечити можливість збереження і відновлення масива об'єктів рішення завдання лабораторної роботи №7.

Забороняється використання стандартного протокола серіалізації.

Продемонструвати використання моделі Long Term Persistence.

Забезпечити діалог з користувачем у вигляді простого текстового меню.

При збереженні та відновленні даних забезпечити діалоговий режим вибору директорії з відображенням вмісту і можливістю переміщення по підкаталогах.

# 1.1 Розробник

Погребний Максим Русланович

КН-921в

15 варіант

# 1.2 Загальне завдання

Розробити програму

Оформити роботу

# 1.3 Задача

див. у 1

# 2. Вивід у консоль
```
Вхідний шлях: D:\Учёба\vacancies
Готово
```

![Image alt](https://github.com/Makson4ikk/java-project/blob/main/doc/pogrebnyi08/assets/file.png)

![Image alt](https://github.com/Makson4ikk/java-project/blob/main/doc/pogrebnyi08/assets/code1.png)

![Image alt](https://github.com/Makson4ikk/java-project/blob/main/doc/pogrebnyi08/assets/code2.png)

# 2.1 Засоби ООП 
Java code convention 

JDK

ООП  

# 2.2 Ієрархія та структура класів

1. l08

2. fullVacanises

3. vacanices

# 2.3 Важливі фрагменти програми:

Введення пасу сейвінгу xml

```
    scanner = new Scanner(System.in);
    System.out.print("Вхідний шлях: ");
		String path = scanner.nextLine();

```

Генерація XML

```
  try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(path + ".xml")));
			x.writeObject(full);
			x.close();
			System.out.println("Готово");
        } catch (FileNotFoundException e) {
		
			e.printStackTrace();
			System.out.println("Помилка");
		}
```

# Варіанти використання

--

# Висновки

На цій лабораторній роботі навчились працювати з ООП
