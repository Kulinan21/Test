import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    public void chekSound() {
        //GIVEN
        Cat cat = new Cat("TestCat1", 6);
        String expectedResult = cat.Voice;
        //WHEN
        String actualResult = cat.makeSound();
        //THEN
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void chekName() {
        //GIVEN
        Cat cat = new Cat("TestCat2", 7);
        String expectedResult = "Marco";
        //WHEN
        String actualResult = cat.name;
        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void chekWeight() {
        //GIVEN
        Cat cat = new Cat("TestCat3", 4);
        int expectedResult = 4;
        //WHEN
        int actualResult = cat.weight;
        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void chekMousePerDay() {
        //GIVEN
        int acceptedMouse = 2;
        Cat cat = new Cat("TestCat4", 12, 13);
        int expectedResult = acceptedMouse;
        //WHEN
        int actualResult = cat.MousePerDay;
        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void chekEat() {
        //GIVEN
        String eat = "Миші";
        Cat cat = new Cat("TestCat5", 9);
        String expectedResult = eat;
        //WHEN
        String actualResult = cat.eat();
        //THEN
        Assertions.assertEquals(expectedResult, actualResult);

    }
}