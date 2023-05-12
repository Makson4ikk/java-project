# Лабораторна робота №13
# Паралельне виконання. Multithreading

### Мета:
- Ознайомлення з моделлю потоків Java.
- Організація паралельного виконання декількох частин програми.

## 1 ВИМОГИ
### 1.1 Розробник
- Погребний Максим Русланович
- КН-921В

### 1.2 Загальне завдання
1) Використовуючи програми рішень попередніх задач, продемонструвати можливість паралельної обробки елементів контейнера: створити не менше трьох додаткових потоків, на яких викликати відповідні методи обробки контейнера.

2) Забезпечити можливість встановлення користувачем максимального часу виконання (таймаута) при закінченні якого обробка повинна припинятися незалежно від того знайдений кінцевий результат чи ні.

3) Для паралельної обробки використовувати алгоритми, що не змінюють початкову колекцію.

4) Кількість елементів контейнера повинна бути досить велика, складність алгоритмів обробки колекції повинна бути зіставна, а час виконання приблизно однаковий, наприклад:

- пошук мінімуму або максимуму;
- обчислення середнього значення або суми;
- підрахунок елементів, що задовольняють деякій умові;
- відбір за заданим критерієм;
- власний варіант, що відповідає обраній прикладної області.

### 1.3 Задача
Автосалон

Автомобіль: марка, рік випуску, технічні характеристики у вигляді "параметр - значення" (серед яких витрата палива в міському і заміському циклі), технічний стан, ціна.

## 2 ОПИС ПРОГРАМИ

### 2.1 Засоби ООП
...

### 2.2 Ієрархія та структура класів
...

### 2.3 Важливі фрагменти програми
```
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int timeout = 3000;
        int number_of_threads = 3;


        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            numbers.add(random.nextInt(100));
        }


        List<Thread> threads = new ArrayList<>();
        List<AverageCalculator> calculators = new ArrayList<>();
        int chunkSize = numbers.size() / number_of_threads;
        for (int i = 0; i < number_of_threads; i++) {
            int start = i * chunkSize;
            int end = (i == number_of_threads - 1) ? numbers.size() : (i + 1) * chunkSize;
            List<Integer> chunk = numbers.subList(start, end);
            AverageCalculator calculator = new AverageCalculator(chunk);
            Thread thread = new Thread(calculator);
            threads.add(thread);
            calculators.add(calculator);
            thread.start();
        }


        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {

        }


        for (Thread thread : threads) {
            thread.interrupt();
        }


        int count = 0;
        double sum = 0;
        for (AverageCalculator calculator : calculators) {
            count += calculator.getCount();
            sum += calculator.getSum();
        }
        double average = sum / count;


        System.out.println("Average: " + average);
    }
}
```
# ВАРІАНТИ ВИКОРИСТАННЯ
-

# Висновки
Ми набули навичи у розробці програм з моделлю потоків Java.
