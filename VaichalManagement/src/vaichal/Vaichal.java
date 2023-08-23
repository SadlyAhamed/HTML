                        
package vaichal;


public abstract class Vaichal {
    private String regestratinNumber;
    private String brands;
    private int year;

    public Vaichal() {
    }

    public Vaichal(String regestratinNumber, String brands, int year) {
        this.regestratinNumber = regestratinNumber;
        this.brands = brands;
        this.year = year;
    }

    public String getRegestratinNumber() {
        return regestratinNumber;
    }

    public void setRegestratinNumber(String regestratinNumber) {
        this.regestratinNumber = regestratinNumber;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public abstract void start();
    
    public abstract void stop();
    
    
    
}
