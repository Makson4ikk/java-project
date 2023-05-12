# Лабораторна робота №16
# Модульне тестування

### Мета:
- Розробка модульних тестів з використанням JUnit 5.

## 1 ВИМОГИ
### 1.1 Розробник
- Погребний Максим Русланович
- КН-921В

### 1.2 Загальне завдання
1) Розробити та додати модульні тести до програм попередніх лабораторних робіт. Забезпечити розділення на рівні початкового коду, тести розташовувати в директоріях з назвою test.

2) Перевірити всі public-методи власного контейнера та його ітератора, які були створені при віконанні завдання лабораторної роботи "9. Параметризація в Java". Забезпечити покриття коду не менше 80%.

3) Перевірити методи, що забезпечують валідацію даних в програмі рішення завдання лабораторної роботи "11. Регулярні вирази. Перевірка даних".

4) Перевірити вирішення прикладної задачі лабораторної роботи "12. Регулярні вирази. Обробка тексту".

5) Перевірити методи обробки контейнера лабораторної роботи "13. Паралельне виконання. Multithreading". Перевіряти тільки обробку даних, виключаючи multithreading (див. п.4).

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
public class AverageCalculator implements Runnable {
    private final List<Integer> numbers;
    private int count;
    private double sum;

    public AverageCalculator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (Integer number : numbers) {
            if (Thread.interrupted()) {
                return; // завершити потік, якщо він був перерваний
            }
            count++;
            sum += number;
        }
    }
}

public class CarContainerTest {

    private CarContainer carContainer;
    private Car car1;
    private Car car2;
    private Car car3;
    private Car car4;
    private Car car5;

    @Before
    public void setUp() {
        carContainer = new CarContainer();
        car1 = new Car("Car1", "Company1", "Specs1", 10000, new ArrayList<>());
        car2 = new Car("Car2", "Company2", "Specs2", 20000, new ArrayList<>());
        car3 = new Car("Car3", "Company3", "Specs3", 30000, new ArrayList<>());
        car4 = new Car("Car4", "Company1", "Specs4", 40000, new ArrayList<>());
        car5 = new Car("Car5", "Company2", "Specs5", 50000, new ArrayList<>());
        carContainer.add(car1);
        carContainer.add(car2);
        carContainer.add(car3);
        carContainer.add(car4);
        carContainer.add(car5);
    }

    @Test
    public void testAddCarContainer() {
        Car newCar = new Car("NewCar", "NewCompany", "NewSpecs", 60000, new ArrayList<>());
        carContainer.add(newCar);
        assertEquals(6, carContainer.size());
        assertEquals(newCar, carContainer.getCarContainer(5));
    }

    @Test
    public void testRemoveCarContainer() {
        carContainer.remove(car3);
        assertEquals(4, carContainer.size());
        assertEquals(car4, carContainer.getCarContainer(2));
    }

    @Test
    public void testGetCarContainer() {
        assertEquals(car2, carContainer.getCarContainer(1));
    }

    @Test
    public void testGetAllCarContainers() {
        List<Car> allCars = carContainer.getAllCarContainers();
        assertEquals(5, allCars.size());
        assertTrue(allCars.contains(car1));
        assertTrue(allCars.contains(car2));
        assertTrue(allCars.contains(car3));
        assertTrue(allCars.contains(car4));
        assertTrue(allCars.contains(car5));
    }

    @Test
    public void testSortByCompanyName() {
        carContainer.sortByCompanyName(carContainer.getAll(), true);
        assertEquals(car1, carContainer.getCarContainer(0));
        assertEquals(car4, carContainer.getCarContainer(1));
        assertEquals(car2, carContainer.getCarContainer(2));
        assertEquals(car5, carContainer.getCarContainer(3));
        assertEquals(car3, carContainer.getCarContainer(4));
        carContainer.sortByCompanyName(carContainer.getAll(), false);
        assertEquals(car3, carContainer.getCarContainer(0));
        assertEquals(car5, carContainer.getCarContainer(1));
        assertEquals(car2, carContainer.getCarContainer(2));
        assertEquals(car4, carContainer.getCarContainer(3));
        assertEquals(car1, carContainer.getCarContainer(4));
    }

    @Test
    public void testSortByCarName() {
        carContainer.sortByCarName(carContainer.getAll(), true);
        assertEquals(car1, carContainer.getCarContainer(0));
        assertEquals(car2, carContainer.getCarContainer(1));
        assertEquals(car3, carContainer.getCarContainer(2));
        assertEquals(car4, carContainer.getCarContainer(3));
        carContainer.sortByCarName(carContainer.getAll(), false);
        assertEquals(car4, carContainer.getCarContainer(0));
        assertEquals(car3, carContainer.getCarContainer(1));
        assertEquals(car2, carContainer.getCarContainer(2));
        assertEquals(car1, carContainer.getCarContainer(3));
    }


    @Test
    public void testSortBySpecifications() {
        carContainer.sortBySpecifications(carContainer.getAll(), true);
        assertEquals(car1, carContainer.getCarContainer(0));
        assertEquals(car4, carContainer.getCarContainer(1));
        assertEquals(car2, carContainer.getCarContainer(2));
        assertEquals(car3, carContainer.getCarContainer(3));
        carContainer.sortBySpecifications(carContainer.getAll(), false);
        assertEquals(car3, carContainer.getCarContainer(0));
        assertEquals(car2, carContainer.getCarContainer(1));
        assertEquals(car4, carContainer.getCarContainer(2));
        assertEquals(car1, carContainer.getCarContainer(3));
    }
}

public class MainTest {
    @Test
    public void testValidateNameValid() {
        assertTrue(Main.validate_name("Toyota"));
    }

    @Test
    public void testValidateNameInvalid() {
        assertFalse(Main.validate_name("Toyota123"));
    }

    @Test
    public void testValidateCompanyValid() {
        assertTrue(Main.validate_company("Ford"));
    }

    @Test
    public void testValidateCompanyInvalid() {
        assertFalse(Main.validate_company("Ford#"));
    }

    @Test
    public void testValidateSpecificationsValid() {
        assertTrue(Main.validate_specifications("Hybrid"));
    }

    @Test
    public void testValidateSpecificationsInvalid() {
        assertFalse(Main.validate_specifications("Hybrid123"));
    }

    @Test
    public void testValidatePriceValid() {
        assertTrue(Main.validate_price("25000+"));
    }

    @Test
    public void testValidatePriceInvalid() {
        assertFalse(Main.validate_price("25000"));
    }

    @Test
    public void testTryFromFile() {
        String data = "Toyota,Camry,2019,25000+,Hybrid\n" +
                "Ford,Mustang,2022,30000+,Gasoline\n" +
                "Chevrolet,Camaro,2021,35000+,Gasoline\n";

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.Try_From_File();

        System.setIn(stdin);
    }

    @Test
    public void testMainValid() {
        String data = "Toyota\nCamry\n2019\n25000+\nHybrid\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);

        System.setIn(stdin);
    }

    @Test
    public void testMainInvalid() {
        String data = "Toyota123\nCamry\n2019\n25000\nHybrid\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);

        System.setIn(stdin);
    }
}

```

# ВАРІАНТИ ВИКОРИСТАННЯ
-

# Висновки
Ми набули навичи у розробці параметризованих контейнерів.
