
package vaical;


public abstract class Vaichal {
    public String registrationNumber;
    public String brand;
    public int year;

    public Vaichal() {
    }

    public Vaichal(String registrationNumber, String brand, int year) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.year = year;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
