import Task.Purchase;
import Task.WeekDays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class TestRunner {
    @Test
    public void testPurchaseConstructor() {
        try {
            Purchase purchase = new Purchase();
        } catch (Exception e) {
            fail("Can't create");
        }
    }

    @Test
    public void testPurchaseAllArgConstructor() {
        try {
            Purchase purchase = new Purchase("steel", 20, 3, 30, WeekDays.FRIDAY);
            assertTrue(purchase.getProductName().equals("steel")
                    && purchase.getPriceInEuro() == 20
                    && purchase.getNumberOfPurchasedUnits() == 3
                    && purchase.getDiscountPercent() == 30
                    && purchase.getWeekDay().equals(WeekDays.FRIDAY));
        } catch (Exception e) {
            fail("Can't create");
        }
    }

    @Test
    public void getCostTest() {
        Purchase purchase = new Purchase("steel", 20, 3, 30, WeekDays.MONDAY);
        assertTrue(purchase.getCost() == 42);
    }
}
