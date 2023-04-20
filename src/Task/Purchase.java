package Task;

public class Purchase {
    private String productName;
    private double priceInEuro;
    private int numberOfPurchasedUnits;
    private int discountPercent;
    private enum weekDay{
       MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }


    public Purchase() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPriceInEuro() {
        return priceInEuro;
    }

    public void setPriceInEuro(double priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

    public int getNumberOfPurchasedUnits() {
        return numberOfPurchasedUnits;
    }

    public void setNumberOfPurchasedUnits(int numberOfPurchasedUnits) {
        this.numberOfPurchasedUnits = numberOfPurchasedUnits;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public double getCost() {
        return Math.round(priceInEuro * numberOfPurchasedUnits * (100 - discountPercent) / 100);
    }

    public String toString() {
        return priceInEuro + ";" + numberOfPurchasedUnits + ";" + discountPercent + ";" + weekDay + ";" + getCost();
    }
public int compareTo(){
        return 0;
}


}
