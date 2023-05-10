package l12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class main {

    public static void main(String args[]) {
        Car car1 = new Car("Toyota", "company", "specifications", 25000, new ArrayList<>());
        Car car2 = new Car("Nissan", "company", "specifications", 40000, new ArrayList<>());
        Car car3 = new Car("Mazda", "company", "specifications", 27000, new ArrayList<>());

        List<Car> list = new ArrayList<Car>();
        list.add(car1);
        list.add(car2);
        list.add(car3);

        // Задання умов пошуку
        Pattern reg_price = Pattern.compile("^0-9\\+");

        for (Car car: list) {
            if(reg_price.matcher(Integer.toString(car.getPrice())).matches()) {
                System.out.println("Car: " + car.toString());
            }
        }
    }
}