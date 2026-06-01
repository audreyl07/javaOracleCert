package CollectionsS12;

public class CarsEx {
    String carName;
    int year;
    int price;

    public CarsEx(String carName, int year, int price) {
        this.carName = carName;
        this.year = year;
        this.price = price;
    }

    public String getCarName(){ return carName;}
    public int getYear(){ return year;}
    public int getPrice(){ return price;}
}
