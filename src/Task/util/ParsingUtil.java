package Task.util;

import Task.Purchase;
import Task.WeekDays;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ParsingUtil {
    public static int PURCHASES_NUMBER;

    public static Purchase[] readInputFile() {
        Purchase[] purchases = null;
        try (Scanner sc = new Scanner(new FileReader("src/in.txt"))) {
            sc.useLocale(Locale.ENGLISH);
            PURCHASES_NUMBER = sc.nextInt();
            purchases = new Purchase[PURCHASES_NUMBER];
            sc.nextLine();
            for (int i = 0; i < PURCHASES_NUMBER; i++) {
                String line = sc.nextLine();
                String[] data = line.split(" ");
                purchases[i] = new Purchase(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[4]),
                        Integer.parseInt(data[2]), WeekDays.values()[Integer.parseInt(data[3])]);
            }
            System.out.println(PURCHASES_NUMBER);
        } catch (FileNotFoundException e) {
            System.err.println("Input file is not found");
        }
        return purchases;
    }

    public static void main(String[] args) {
        Purchase purchases[] = readInputFile();
        System.out.println(Arrays.toString(purchases));
       Arrays.sort(purchases);
        System.out.println(Arrays.toString(purchases));
    }
}
