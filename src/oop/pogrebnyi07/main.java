package l07;

import java.util.ArrayList;

public class l07 {

	public static void main(final String[] arguments) {
        final vacancies vacancies = new vacancies();
        
        ArrayList<String> terms = new ArrayList<String>();
        
        terms.add("Автосалон");
        
        vacancies.setName("BMW M8");
        vacancies.setData("July, 2019 year");
        vacancies.setSpecifications("Fuel consumption urban	- 15.2-15.3 (l/100 km), Fuel consumption extra urban - 7.7-8.0 (l/100 km)");
        vacancies.setPrice(134100);
        vacancies.setTerms(terms);
        
        System.out.print(vacancies.getName() 
        		+ "\n" 
        		+ vacancies.getData() 
        		+ "\n" 
        		+ vacancies.getSpecifications()
        		+ "\n" 
        		+ vacancies.getPrice() + "$"
        		+ "\n" 
        		+ vacancies.getTerms());
    }
	
}

