package l09;

import java.util.List;

public class l09 {
    public static void main(String args[]) {
    	vacansies_container container = new vacansies_container();
        vacancies vacancies1 = new vacancies("Name_1", "Company_1", "Specifications_1", 500);
        vacancies vacancies2 = new vacancies("Name_2", "Company_2", "Specifications_2", 700);
        vacancies vacancies3 = new vacancies("Name_3", "Company_3", "Specifications_3", 900);
        container.add(vacancies1);
        container.add(vacancies2);
        container.add(vacancies3);

        // get
        System.out.println(container.get(0).toString());

        // get all
        List<vacancies> vacanciesList = container.getAll();
        for (vacancies vacancies : vacanciesList) {
            System.out.println(vacancies.toString());
        }

        // remove
        container.remove(container.get(0));

        // clear
        container.clear();

        // isEmpty
        System.out.println(container.isEmpty());
    }
}