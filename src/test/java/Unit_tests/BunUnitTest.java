package Unit_tests;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunUnitTest {

    @Test
    public void bunConstructorTest() {
        Bun cinnabon = new Bun("Синнабон", 2.99F);

        Assert.assertEquals("Имя не соответствует ожидаемому","Синнабон", cinnabon.getName());
        Assert.assertEquals("Цена не соответствует ожидаемой", 2.99F, cinnabon.getPrice(), 0.001F);

    }

    @Test
    public void getNameTest() {
        Bun cinnabon = new Bun("Синнабон", 2.99F);

        Assert.assertEquals("Имя не соответствует ожидаемому","Синнабон", cinnabon.getName());
    }

    @Test
    public void getPriceTest() {
        Bun cinnabon = new Bun("Синнабон", 2.99F);

        Assert.assertEquals("Цена не соответствует ожидаемой", 2.99F, cinnabon.getPrice(), 0.001F);
    }


}
