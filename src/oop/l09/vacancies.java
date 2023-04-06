package l09;

import java.util.List;

public class vacancies implements java.io.Serializable {
	
    
    private String name = null;
    private String company = null;
    private String Specifications = null;
    private int Price;
    private List Terms;
    
	public String getName() {
        return name;
    }
    public String getData() {
        return company;
    }
    public String getSpecifications() {
    	return Specifications;
    }
    public int getPrice() {
    	return Price;
    }
    public List getTerms() {
        return Terms;
    }

    public void vacancies() {
    	
    }
    
    public vacancies(String name, String company, String Specifications, int Price) {
    	this.name = name;
    	this.company = company;
    	this.Specifications = Specifications;
    	this.Price = Price;
    }
    
    public void setName(final String value) {
        this.name = value;
    }

    public void setData(final String value) {
    	this.company = value;
    }
    public void setSpecifications(final String value) {
    	this.Specifications = value;
    }
    public void setPrice(final int value) {
    	this.Price = value;
    }
    public void setTerms(final List list) {
    	this.Terms = list;
    }
    
    public String vacanies() {
    	return "Name: " + name  + "\nData: " + company + "\nSpecifications " + Specifications + "\nPrice " + Price;
    }
}
