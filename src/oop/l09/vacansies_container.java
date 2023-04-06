package l09;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class vacansies_container implements Serializable {
    private List<vacancies> RecruitmentAgencies;

    public vacansies_container() {
        RecruitmentAgencies = new ArrayList<>();
    }

    public void add(vacancies ListItem) {
        RecruitmentAgencies.add(ListItem);
    }

    public void remove(vacancies ListItem) {
        RecruitmentAgencies.remove(ListItem);
    }

    public vacancies get(int index) {
        return RecruitmentAgencies.get(index);
    }

    public List<vacancies> getAll() {
        return new ArrayList<>(RecruitmentAgencies);
    }

    public int size() {
        return RecruitmentAgencies.size();
    }

    public boolean isEmpty() {
        return RecruitmentAgencies.isEmpty();
    }

    public void clear() {
        RecruitmentAgencies.clear();
    }

    public <T extends Comparable<T>> void sortBySpecification(List<vacancies> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = v1.getSpecifications().compareTo(v2.getSpecifications());
            return ascending ? result : -result;
        });
    }

    public <T extends Comparable<T>> void sortByPrice(List<vacancies> list, boolean ascending) {
        list = null;
        list.sort((v1, v2) -> {
            int result = Boolean.compare(v1.getPrice() > v2.getPrice(), false);
            return ascending ? result : -result;
        });
    }

    public <T extends Comparable<T>> void sortByName(List<vacancies> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = v1.getName().compareTo(v2.getName());
            return ascending ? result : -result;
        });
    }
}
