package l10;

import java.util.ArrayList;
import java.util.List;

public class CarContainer {

    private String name;
    private String company;
    private String specifications;
    private int price;
    private List<String> requirements;

    public CarContainer(String string, String string2, String string3, int i, String[] strings) {
    }

    public CarContainer(String name, String company, String specifications, int price, List<String> requirements) {
        this.name = name;
        this.company = company;
        this.specifications = specifications;
        this.price = price;
        this.requirements = requirements;
    }

    public String getDescription() {
        String description = "Job vacancy: " + name +
                "\nCompany: " + company +
                "\nSpecifications: " + specifications +
                "\nPrice: " + price +
                "\nRequirements: ";
        for (String requirement : requirements) {
            description += "\n- " + requirement;
        }
        return description;
    }

    public void displayCarContainer() {
        System.out.println(getDescription());
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

}