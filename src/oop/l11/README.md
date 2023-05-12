# Лабораторна робота №11
# Регулярні вирази. Перевірка даних

### Мета:
- Ознайомлення з принципами використання регулярних виразів для перевірки рядка на відповідність шаблону.

## 1 ВИМОГИ
### 1.1 Розробник
- Погребний Максим Русланович
- КН-921В

### 1.2 Загальне завдання
Продемонструвати ефективне (оптимальне) використання регулярних виразів для перевірки коректності (валідації) даних, що вводяться, перед записом в domain-об'єкти відповідно до призначення кожного поля для заповнення розробленого контейнера:

1) при зчитуванні даних з текстового файла в автоматичному режимі;
2) при введенні даних користувачем в діалоговому режимі.

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
    private static final Pattern price_Pattern = Pattern.compile("^0-9\\+");
    private static final Pattern name_Pattern = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern company_Pattern = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern specifications_Pattern = Pattern.compile("^[a-zA-Z]+$");

    // Метод для перевірки registerNumber
    public static boolean validate_name(String name) {
        Matcher matcher = name_Pattern.matcher(name);
        return matcher.matches();
    }

    // Метод для перевірки experience_job
    public static boolean validate_company(String company) {
        Matcher matcher = company_Pattern.matcher(company);
        return matcher.matches();
    }

    // Метод для перевірки experience_time
    public static boolean validate_specifications(String specifications) {
        Matcher matcher = specifications_Pattern.matcher(specifications);
        return matcher.matches();
    }

    // Метод для перевірки requirement_job
    public static boolean validate_price(String price) {
        Matcher matcher = price_Pattern.matcher(price);
        return matcher.matches();
    }

    public static void Try_From_File(){
        try {
            File inputFile = new File("date.txt");
            Scanner scanner = new Scanner(inputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                Car car = new Car(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]), new ArrayList<>());

                boolean valid = validate_price(Integer.toString(car.getPrice())) &&
                        validate_name(car.getName()) &&
                        validate_company(car.getCompany()) &&
                        validate_specifications(car.getSpecifications());

                System.out.println("Car: " + car + " is " + (valid ? "valid" : "invalid"));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }




    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {

            Car car = new Car(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), new ArrayList<>());

            boolean valid = validate_price(Integer.toString(car.getPrice())) &&
                    validate_name(car.getName()) &&
                    validate_company(car.getCompany()) &&
                    validate_specifications(car.getSpecifications());

            System.out.println("Car: " + car + " is " + (valid ? "valid" : "invalid"));
        }
    }
}
```
# ВАРІАНТИ ВИКОРИСТАННЯ
-

# Висновки
Ми набули навичи у розробці параметризованих контейнерів.
