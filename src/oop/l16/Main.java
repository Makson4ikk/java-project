package l16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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