package Unit_tests;

import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientsUnitTest {
    private Ingredient ham = new Ingredient(IngredientType.FILLING, "Ham", 3.5f);
    private Ingredient sauce = new Ingredient(IngredientType.SAUCE, "Ketchup", 3.3f);


    @Test
    public void testGetPrice() {
        assertEquals(3.5f, ham.getPrice(), 0.01);
        assertEquals(3.3f, sauce.getPrice(), 0.01);
    }

    @Test
    public void testGetName() {
        assertEquals("Ham", ham.getName());
        assertEquals("Ketchup", sauce.getName());
    }

    @Test
    public void testGetType() {
        assertEquals(IngredientType.FILLING, ham.getType());
        assertEquals(IngredientType.SAUCE, sauce.getType());
    }
}
