package l10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

	public void add(CarContainer carContainer) {
		vacancies.add(carContainer);
		
	}

	public List<CarContainer> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<CarContainer>(vacancies);
	}

	public CarContainer get(int i) {
		// TODO Auto-generated method stub
		return vacancies.get(i);
	}

	public void remove(CarContainer object) {
		vacancies.remove(object);
	}
}