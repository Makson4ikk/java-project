# 5. Розробка власних контейнерів. Ітератори

# Тема

Набуття навичок розробки власних контейнерів.

Використання ітераторів.

# 1. Вимоги

Розробити клас-контейнер, що ітерується для збереження початкових даних завдання л.р. №3 у вигляді масиву рядків з можливістю додавання, видалення і зміни елементів.

В контейнері реалізувати та продемонструвати наступні методи:

String toString() повертає вміст контейнера у вигляді рядка;

void add(String string) додає вказаний елемент до кінця контейнеру;

void clear() видаляє всі елементи з контейнеру;

boolean remove(String string) видаляє перший випадок вказаного елемента з контейнера;

Object[] toArray() повертає масив, що містить всі елементи у контейнері;

int size() повертає кількість елементів у контейнері;

boolean contains(String string) повертає true, якщо контейнер містить вказаний елемент;

boolean containsAll(Container container) повертає true, якщо контейнер містить всі елементи з зазначеного у параметрах;

public Iterator iterator() повертає ітератор відповідно до Interface Iterable.

В класі ітератора відповідно до Interface Iterator реалізувати методи:

public boolean hasNext();

public String next();

public void remove().

Продемонструвати роботу ітератора за допомогою циклів while и for each.

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
toString():[Буває, таке, мовчання, коли, слова, не, потрібні, і, це, означає, не, кінець, а, початок, розуміння] 
 
add(String string):true

remove(String string):false

Item in Object[] toArray() = Буває

Item in Object[] toArray() = таке

Item in Object[] toArray() = мовчання

Item in Object[] toArray() = коли

Item in Object[] toArray() = слова

Item in Object[] toArray() = не

Item in Object[] toArray() = потрібні

Item in Object[] toArray() = і

Item in Object[] toArray() = це

Item in Object[] toArray() = означає

Item in Object[] toArray() = не

Item in Object[] toArray() = кінець

Item in Object[] toArray() = а

Item in Object[] toArray() = початок

Item in Object[] toArray() = розуміння

Item in Object[] toArray() = Джонатан Коу

size():16

contains(String string):true

containsAll(Container container):false

Iterator has next, word is - Буває

Iterator has next, word is - таке

Iterator has next, word is - мовчання

Iterator has next, word is - коли

Iterator has next, word is - слова

Word 'слова' was be deleted

Iterator has next, word is - не

Iterator has next, word is - потрібні

Iterator has next, word is - і

Iterator has next, word is - це

Iterator has next, word is - означає

Iterator has next, word is - не

Iterator has next, word is - кінець

Iterator has next, word is - а

Iterator has next, word is - початок

Iterator has next, word is - розуміння

Iterator has next, word is - Джонатан Коу
```
# 2.1 Засоби ООП

Java code convention

JDK:

Ітератор

# 2.2 Ієрархія та структура класів

l05

# 2.3 Важливі фрагменти програми:
```
System.out.println("toString():" + arrayList1.toString());
	    
	    System.out.println("add(String string):" + arrayList1.add("Джонатан Коу"));
	    
	    System.out.println("remove(String string):" + arrayList1.remove("початок розуміння"));
	    
	    String arraylist2[] = new String[arrayList1.size()];
	    arraylist2 = arrayList1.toArray(arraylist2);
	    arrayList1.toArray(arraylist2);
	    for (String item : arraylist2) {
	        System.out.println("Item in Object[] toArray() = " + item);
	    }
	    
	    System.out.println("size():" + arrayList1.size());
	    
	    System.out.println("contains(String string):" + arrayList1.contains("Буває"));
	    
	    List<String> listTemp = new ArrayList<String>();
        listTemp.add("Найпростіші речі");
        listTemp.add("можуть змусити");
        listTemp.add("вмирати від щастя.");
	    System.out.println("containsAll(Container container):" + arrayList1.contains(listTemp));
	    
	    String wordDel = "слова";
	    String word;
	    
	    Iterator<String> iterator = arrayList1.iterator();
	   
	    while(iterator.hasNext()) {
	    	word = iterator.next();
	    	System.out.println("Iterator has next, word is - " + word);
	    	if (wordDel.equals(word)) {
	    		iterator.remove();
	    		System.out.println("Word '" + word + "' was be deleted");
	    	}
	    }
```

# Варіанти використання

--

# Висновки

На цій лабораторній роботі навчились працювати з ітератором
