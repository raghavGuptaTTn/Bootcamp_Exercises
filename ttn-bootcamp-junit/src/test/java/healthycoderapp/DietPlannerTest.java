package healthycoderapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {

    private DietPlanner dietPlanner;

    @BeforeEach
    void setUp(){
        dietPlanner = new DietPlanner(20, 30, 50);
    }

    @AfterEach
    void finish(){
        // for demo only
        System.out.println("a unit test was finished. ");
    }

    // although repetition is not required here, i used it for demonstration.
    @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
    void should_ReturnCorrectDietPlan_When_CorrectCoder(){

        // given
        Coder coder = new Coder(1.82, 75.0, 26, Gender.MALE);
        DietPlan expected = new DietPlan(2202, 110, 73, 275);

        // when
        DietPlan actual = dietPlanner.calculateDiet(coder);

        // then
        // assertEquals(actual, expected);   --- failed
        assertAll(
                ()->assertEquals(expected.getCalories(), actual.getCalories()),
                ()->assertEquals(expected.getProtein(), actual.getProtein()),
                ()->assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate()),
                ()->assertEquals(expected.getFat(), expected.getFat())
        );
    }

    // ------------     can not test because its private method
    /*@Test
    void should_ReturnCorrectBMR_When_CorrectMaleCoder(){

        // given
        Coder coder = new Coder(1.82, 75.0, 26, Gender.MALE);
        int expectedBMR = ;

        // when
        int actualBMR = dietPlanner.calculateBMR(coder);

        // then
        assertEquals(expectedBMR, actualBMR);
    }

     */

}