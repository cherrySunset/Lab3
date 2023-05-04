package Task;

import java.util.Arrays;
import static Task.util.ParsingUtil.readInputFile;


public class Runner {
    public static void main(String[] args) {
        Purchase purchases[] = readInputFile();
        System.out.println(Arrays.toString(purchases));
        Double average = Arrays.stream(purchases).mapToDouble(p -> p.getPriceInEuro()).average().getAsDouble();
        System.out.println(roundAvoid(average, 3));
        Arrays.sort(purchases);
        for (Purchase purchase : purchases) {
            System.out.println(purchase);

        }
        Purchase searchVal = new Purchase("TV", 130, 5,
                4, WeekDays.WEDNESDAY);

        Purchase fiveUnits = purchases[Arrays.binarySearch(purchases, searchVal)];
        System.out.println(fiveUnits);

    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
