package Task;


public class Purchase implements Comparable<Purchase> {
    private String productName;
    private double priceInEuro;
    private int numberOfPurchasedUnits;
    private int discountPercent;
    private WeekDays weekDay;


    public Purchase() {

    }

    public Purchase(String productName, double priceInEuro, int numberOfPurchasedUnits, int discountPercent, WeekDays weekDay) {
        this.productName = productName;
        this.priceInEuro = priceInEuro;
        this.numberOfPurchasedUnits = numberOfPurchasedUnits;
        this.discountPercent = discountPercent;
        this.weekDay = weekDay;
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

    public WeekDays getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    public double getCost() {
        return Math.round(priceInEuro * numberOfPurchasedUnits * (100 - discountPercent) / 100);
    }

    public String toString() {
        return priceInEuro + ";" + numberOfPurchasedUnits + ";" + discountPercent + ";" + weekDay + ";" + getCost();
    }


    @Override
    public int compareTo(Purchase purchase) {
        return this.getNumberOfPurchasedUnits() - purchase.getNumberOfPurchasedUnits();
    }

}
