package Unit_tests;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class BurgerUnitTest {

    @Mock
    private Bun bun;
    @Mock
    private Ingredient ingredient_sauce;

    @Mock
    private Ingredient dinosaur;

    @Mock
    private Ingredient cutlet;

    @Test
    public void getPriceTest()
    {
        Burger burger = new Burger();

        when(bun.getPrice()).thenReturn(200F);
        when(ingredient_sauce.getPrice()).thenReturn(300F);

        burger.setBuns(bun);
        burger.addIngredient(ingredient_sauce);
        burger.addIngredient(ingredient_sauce);

        System.out.println(burger.getPrice());
    }

    @Test
    public void moveIngredientTest()
    {
        Burger burger = new Burger();

        burger.setBuns(bun);

        burger.addIngredient(ingredient_sauce);
        burger.addIngredient(cutlet);
        burger.addIngredient(dinosaur);

        burger.moveIngredient(1, 2);

        Assert.assertEquals(ingredient_sauce, burger.ingredients.get(0));
        Assert.assertEquals(dinosaur, burger.ingredients.get(1));
        Assert.assertEquals(cutlet, burger.ingredients.get(2));

    }

    @Test
    public void removeIngredientTest()
    {
        Burger burger = new Burger();

        burger.setBuns(bun);

        burger.addIngredient(ingredient_sauce);
        burger.addIngredient(cutlet);
        burger.addIngredient(dinosaur);

        burger.removeIngredient(1);

        Assert.assertEquals(ingredient_sauce, burger.ingredients.get(0));
        Assert.assertEquals(dinosaur, burger.ingredients.get(1));

    }

    @Test
    public void addIngredientTest()
    {
        Burger burger = new Burger();

        burger.setBuns(bun);

        burger.addIngredient(ingredient_sauce);
        burger.addIngredient(cutlet);
        burger.addIngredient(dinosaur);


        Assert.assertEquals(ingredient_sauce, burger.ingredients.get(0));
        Assert.assertEquals(cutlet, burger.ingredients.get(1));
        Assert.assertEquals(dinosaur, burger.ingredients.get(2));

    }

    @Test
    public void getReceiptTest()
    {
        Burger burger = new Burger();

        when(bun.getName()).thenReturn("red bun");
        when(bun.getPrice()).thenReturn(100f);
        when(ingredient_sauce.getType()).thenReturn(IngredientType.SAUCE);
        when(ingredient_sauce.getName()).thenReturn("hot sauce");
        when(ingredient_sauce.getPrice()).thenReturn(100F);
        when(cutlet.getType()).thenReturn(IngredientType.FILLING);
        when(cutlet.getName()).thenReturn("cutlet");
        when(cutlet.getPrice()).thenReturn(100F);
        when(dinosaur.getType()).thenReturn(IngredientType.FILLING);
        when(dinosaur.getName()).thenReturn("dinosaur");
        when(cutlet.getPrice()).thenReturn(200F);


        burger.setBuns(bun);
        burger.addIngredient(ingredient_sauce);
        burger.addIngredient(cutlet);
        burger.addIngredient(dinosaur);

        String expectedResult = "(==== red bun ====)\n" +
                "= sauce hot sauce =\n" +
                "= filling cutlet =\n" +
                "= filling dinosaur =\n" +
                "(==== red bun ====)\n" +
                "\n" +
                "Price: 500.000000\n";

        Assert.assertEquals(expectedResult, burger.getReceipt());
    }

}
