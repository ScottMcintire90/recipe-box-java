import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class RecipeTest {

  // @Rule
  // public DatabaseRule database = new DatabaseRule();

  @Test
  public void Recipe_recipeInstantiatesCorrectky_true() {
    Recipe newRecipe = new Recipe(5, "Todd's Tacos", "Beef, tortillas, cheese, beans, salsa, sourcream", "Put all the ingredients together");
    assertEquals(true, newRecipe instanceof Recipe);
  }

  @Test
  public void getRating_returnsRating_int() {
    Recipe newRecipe = new Recipe(5, "Todd's Tacos", "Beef, tortillas, cheese, beans, salsa, sourcream", "Put all the ingredients together");
    assertEquals(5, newRecipe.getRating());
  }

  @Test
  public void getDate_returnsDate_Date() {
    Recipe newRecipe = new Recipe(5, "Todd's Tacos", "Beef, tortillas, cheese, beans, salsa, sourcream", "Put all the ingredients together");
    java.util.Date currentDate = new java.util.Date();
    assertEquals(currentDate, newRecipe.getDate());
  }

  @Test
  public void Recipe_returnsTrueIfNamesAreEqual_true() {
    Recipe firstRecipe = new Recipe(5, "Todd's Tacos", "Beef, tortillas, cheese, beans, salsa, sourcream", "Put all the ingredients together");
    Recipe secondRecipe = new Recipe(5, "Todd's Tacos", "Beef, tortillas, cheese, beans, salsa, sourcream", "Put all the ingredients together");
    assertTrue(firstRecipe.equals(secondRecipe));
  }

}
