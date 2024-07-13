import org.example.MathUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    public void initBeforeEach(){
        mathUtils = new MathUtils();
    }

    @BeforeAll
    public static void initBeforeAll(){
        System.out.println("This runs Before Anything");
    }

    @AfterAll
    public static void initAfterAll(){
        System.out.println("This runs After Everything");
    }

    @AfterEach
    public void initAfterEach(){
        System.out.println("Clean up");
    }

    @Test
    @DisplayName("Addition Method Test")
    public void testAddTwoNum(){
        int actualValue =  mathUtils.addTwoNum(2,3);
        Assertions.assertEquals(5,actualValue,"The Test for Addition method of MathUtils Class");
    }

    @Test
    @DisplayName("Circle Area method Test")
    public void testAreaOfCircle(){
        Assertions.assertEquals(Math.PI*100, mathUtils.areaOfCircle(10), "Test for Calculating Area of circle");
    }

    @Test
    @DisplayName("Division of Two numbers test")
    public void testDivideTwoNums(){
        Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.divideTwoNums(5,0), "Test for dividing tow numbers to throw Arithmetic exception");
    }

    @Test
    @Disabled
    @DisplayName("Negative Scenario Addition of Two Numbers")
    public void testAddTwoNumNegatives(){
        Assertions.assertNotEquals(6, mathUtils.addTwoNum(2, 3), "Asserting Negative Case");
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    public void testOsEnvironments(){
        Assertions.assertEquals(5, mathUtils.addTwoNum(3,3), "Assertion of Environment specific TestCases");
    }


    /*
    *
    * @EnabledOnJre()
    * @Enabledif
    * @EnabledIfSystemProperty()
    * @EnabledIfEnvironmentVariable()
    *
    * */
}
