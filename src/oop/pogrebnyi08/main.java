package l08;


import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class l08 {
	private static Scanner scanner;
	public static void main(final String[] arguments) {
		
        final vacancies vacancies = new vacancies();
        
        ArrayList<String> terms = new ArrayList<String>();
        
        // Initialize an ArrayList with add()
        terms.add("Автосалон");
        
        vacancies.setName("BMW M8");
        vacancies.setData("July, 2019 year");
        vacancies.setSpecifications("Fuel consumption urban	- 15.2-15.3 (l/100 km), Fuel consumption extra urban - 7.7-8.0 (l/100 km)");
        vacancies.setPrice(134100);
        vacancies.setTerms(terms);
        
        final vacancies vacancies1 = new vacancies();
        
        ArrayList<String> terms1 = new ArrayList<String>();
        
        // Initialize an ArrayList with add()
        terms1.add("Sales manager");
        
        vacancies1.setName("Sales manager");
        vacancies1.setData("AUTOGROUP");
        vacancies1.setSpecifications("Office");
        vacancies1.setPrice(1355);
        vacancies1.setTerms(terms1);
       
        
        List<vacancies> list = new ArrayList<>();
        list.add(vacancies);
        list.add(vacancies1);
        
        fullVacanises full = new fullVacanises();
        full.setVacancies(list);
        	
        scanner = new Scanner(System.in);
        System.out.print("Вхідний шлях: ");
		String path = scanner.nextLine();

       
        try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(path + ".xml")));
			x.writeObject(full);
			x.close();
			System.out.println("Готово");
        } catch (FileNotFoundException e) {
		
			e.printStackTrace();
			System.out.println("Помилка");
		}
        
        
    }

	

}
