# Лабораторна робота №10
# Обробка параметризованих контейнерів

### Мета:
- Розширення функціональності параметризованих класів.

## 1 ВИМОГИ
### 1.1 Розробник
- Погребний Максим Русланович
- КН-921В

### 1.2 Загальне завдання
Використовуючи програму рішення завдання лабораторної роботи №9:

1) Розробити параметризовані методи (Generic Methods) для обробки колекцій об'єктів згідно прикладної задачі.
2) Продемонструвати розроблену функціональність (створення, управління та обробку власних контейнерів) в діалоговому та автоматичному режимах.
3) Автоматичний режим виконання програми задається параметром командного рядка -auto. Наприклад, java ClassName -auto.
4) В автоматичному режимі діалог з користувачем відсутній, необхідні данні генеруються, або зчитуються з файлу.
5) Забороняється використання алгоритмів з Java Collections Framework.

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
public class CarInfoContainer implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<CarContainer> vacancies;

    public CarInfoContainer() {
        vacancies = new ArrayList<>();
    }

    public void addCarContainer(CarContainer vacancy) {
        vacancies.add(vacancy);
    }

    public void removeCarContainer(CarContainer vacancy) {
        vacancies.remove(vacancy);
    }

    public CarContainer getCarContainer(int index) {
        return vacancies.get(index);
    }

    public List<CarContainer> getAllCarContainers() {
        return new ArrayList<>(vacancies);
    }

    public int size() {
        return vacancies.size();
    }

    public boolean isEmpty() {
        return vacancies.isEmpty();
    }

    public void clear() {
        vacancies.clear();
    }

    public <T extends Comparable<T>> void sortByCompanyName(List<CarContainer> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = v1.getCompany().compareTo(v2.getCompany());
            return ascending ? result : -result;
        });
    }

    public <T extends Comparable<T>> void sortByCarName(List<CarContainer> vacancies, boolean ascending) {
        vacancies.sort((v1, v2) -> {
            int result = v1.getName().compareTo(v2.getName());
            return ascending ? result : -result;
        });
    }

    public <T extends Comparable<T>> void sortBySpecifications(List<CarContainer> vacancies, boolean ascending) {
        vacancies.sort((v1, v2) -> {
            int result = v1.getSpecifications().compareTo(v2.getSpecifications());
            return ascending ? result : -result;
        });
    }
```
# 3 ВАРІАНТИ ВИКОРИСТАННЯ
-

# Висновки
Ми набули навичи у розробці параметризованих контейнерів.
