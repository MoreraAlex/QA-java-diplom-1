package Unit_tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunUnitTest {
    private Bun bun;
    private final String expectedName;
    private final float expectedPrice;


    public BunUnitTest(String expectedName, float expectedPrice) {
        this.expectedName = expectedName;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"zeroBun", 0f},
                {"floatBun", 222.111f},
                {"Regular Bun name and price", 1.99f},
        };
    }



    @Test
    public void bunConstructorTest() {
        bun = new Bun(expectedName, expectedPrice);

        Assert.assertEquals("Имя не соответствует ожидаемому",expectedName, bun.getName());
        Assert.assertEquals("Цена не соответствует ожидаемой", expectedPrice, bun.getPrice(), 0.001F);

    }

    @Test
    public void getNameTest() {
        bun = new Bun(expectedName, expectedPrice);

        Assert.assertEquals("Имя не соответствует ожидаемому",expectedName, bun.getName());
    }

    @Test
    public void getPriceTest() {
        bun = new Bun(expectedName, expectedPrice);

        Assert.assertEquals("Цена не соответствует ожидаемой", expectedPrice, bun.getPrice(), 0.001F);
    }


}
