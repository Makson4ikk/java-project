package l08;

import java.util.List;

public class vacancies implements java.io.Serializable {
	
    
    private String name = null;
    private String data = null;
    private String Specifications = null;
    private int Price;
    private List Terms;
    
    public String getName() {
        return name;
    }
    public String getData() {
        return data;
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

    
    public void setName(final String value) {
        this.name = value;
    }

    public void setData(final String value) {
    	this.data = value;
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

}
