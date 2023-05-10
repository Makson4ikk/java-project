import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CarContainer implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Car> vacancies;

    public CarContainer() {
        vacancies = new ArrayList<>();
    }

    public void addCarContainer(Car vacancy) {
        vacancies.add(vacancy);
    }

    public void removeCarContainer(Car vacancy) {
        vacancies.remove(vacancy);
    }

    public Car getCarContainer(int index) {
        return vacancies.get(index);
    }

    public List<Car> getAllCarContainers() {
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

    public <T extends Comparable<T>> void sortByCompanyName(List<Car> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = v1.getCompany().compareTo(v2.getCompany());
            return ascending ? result : -result;
        });
    }

    public <T extends Comparable<T>> void sortByCarName(List<Car> vacancies, boolean ascending) {
        vacancies.sort((v1, v2) -> {
            int result = v1.getName().compareTo(v2.getName());
            return ascending ? result : -result;
        });
    }

    public <T extends Comparable<T>> void sortBySpecifications(List<Car> vacancies, boolean ascending) {
        vacancies.sort((v1, v2) -> {
            int result = v1.getSpecifications().compareTo(v2.getSpecifications());
            return ascending ? result : -result;
        });
    }

    public void add(Car carContainer) {
        vacancies.add(carContainer);

    }

    public List<Car> getAll() {
        // TODO Auto-generated method stub
        return new ArrayList<Car>(vacancies);
    }

    public Car get(int i) {
        // TODO Auto-generated method stub
        return vacancies.get(i);
    }

    public void remove(Car object) {
        vacancies.remove(object);
    }
}