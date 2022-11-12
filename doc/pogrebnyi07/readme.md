# 7. Об'єктно-орієнтована декомпозиція

# Тема

Використання об'єктно-орієнтованого підходу для розробки об'єкта предметної (прикладної) галузі.

# 1. Вимоги

Використовуючи об'єктно-орієнтований аналіз, реалізувати класи для представлення сутностей відповідно прикладної задачі - domain-об'єктів.

Забезпечити та продемонструвати коректне введення та відображення кирилиці.

Продемонструвати можливість управління масивом domain-об'єктів.

# 1.1 Розробник

Погребний Максим Русланович

КН-921в

15 варіант

# 1.2 Загальне завдання

Розробити прогрму

Оформити роботу

# 1.3 Задача

див. у 1

# 2. Вивід у консоль

  ```
  BMW M8
  
  July, 2019 year
  
  Fuel consumption urban	- 15.2-15.3 (l/100 km), Fuel consumption extra urban - 7.7-8.0 (l/100 km)
  
  134100$
  
  [Автосалон]
  ```

# 2.1 Засоби ООП

Java code convention

JDK:

Ітератор

# 2.2 Ієрархія та структура класів

l07

vacancies

# 2.3 Важливі фрагменти програми:

Занесення у класс інформацію:

  ```
public void setName(final String value) {
        this.name = value;
    }

    public void setData(final String value) {
    	this.company = value;
    }
    public void setSpecifications(final String value) {
    	this.Specifications = value;
    }
    public void setPrice(final int value) {
    	this.Price = value;
    }
    public void setTerms(final List list) {
    	this.Terms = list;
    }
```
    
Отримання інформації:

```
    public String getName() {
        return name;
    }
    public String getData() {
        return company;
    }
    public String getSpecifications() {
    	return Specifications;
    }
    public int getPrice() {
    	return Price;
    }
    public List getTerms() {
        return Terms;
    }
```

# Варіанти використання

--

# Висновки

На цій лабораторній роботі навчились працювати з ооп
