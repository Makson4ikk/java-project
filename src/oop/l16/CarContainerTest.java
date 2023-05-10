package l16;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

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
