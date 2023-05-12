# Лабораторна робота №14
# Multithreading. Ефективність використання

### Мета:
- Вимірювання часу паралельних та послідовних обчислень.
- Демонстрація ефективності паралельної обробки.

## 1 ВИМОГИ
### 1.1 Розробник
- Погребний Максим Русланович
- КН-921В

### 1.2 Загальне завдання
1) Забезпечити вимірювання часу паралельної обробки елементів контейнера за допомогою розроблених раніше методів.

2) Додати до алгоритмів штучну затримку виконання для кожної ітерації циклів поелементної обробки контейнерів, щоб загальний час обробки був декілька секунд.

3) Реалізувати послідовну обробку контейнера за допомогою методів, що використовувались для паралельної обробки та забезпечити вимірювання часу їх роботи.

4) Порівняти час паралельної і послідовної обробки та зробити висновки про ефективність розпаралелювання:

- результати вимірювання часу звести в таблицю;
- обчислити та продемонструвати у скільки разів паралельне виконання швидше послідовного.

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
    public static void main(String[] args) {
        List<Integer> container = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            container.add(i);
        }


        long startParallel = System.currentTimeMillis();
        container.parallelStream().forEach(element -> {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long endParallel = System.currentTimeMillis();
        System.out.println("Час паралельної обробки: " + (endParallel - startParallel) + " ms");

        long startSequential = System.currentTimeMillis();
        for (Integer element : container) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endSequential = System.currentTimeMillis();
        System.out.println("Час паралельної обробки: " + (endSequential - startSequential) + " ms");

        if ((endSequential - startSequential) == 0) {
            System.out.println("Послідовна обробка займала менше 1 мс, тому ефективність розпаралелювання неможливо розрахувати.");
        } else {
            double efficiency = (double) (endParallel - startParallel) / (double) (endSequential - startSequential);
            System.out.println("Ефективність розпаралелювання: " + efficiency + " разів швидше, ніж послідовна обробка.");
        }
    }
}
```
# ВАРІАНТИ ВИКОРИСТАННЯ
-

# Висновки
Ми набули навичи у розробці програм з моделлю потоків Java.
