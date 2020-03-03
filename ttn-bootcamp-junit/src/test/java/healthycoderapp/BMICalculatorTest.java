package healthycoderapp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.function.Executable;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private String environment = "dev";


    @BeforeAll
    static void beforeAll(){
        /// for demo only
        System.out.println("before all test cases");
    }

    @AfterAll
    static void afterAll(){
        // for demo only
        System.out.println("after all test cases");
    }

    @Nested
    @DisplayName("class for diet recommendation tests")
    class DietRecommendationTests {
        @Test
        void should_ReturnTrue_When_DietRecommended() {
            // given
            double height = 1.72;
            double weight = 89.0;

            // when
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            // then
            assertTrue(recommended);
        }

//    ===================== PARAMETRISED TEST ==========================
//    @ParameterizedTest
//    @ValueSource(doubles = {89.0, 95.0, 110.0})
//    // we need to tell that we are passing double type values.
//    void should_ReturnTrue_When_DietRecommended(Double coderWeight){
//        // given
//        double weight = coderWeight;
//        double height = 1.82;
//
//        // when
//        boolean recommended = BMICalculator.isDietRecommended(weight, height);
//
//        /// then
//        assertTrue(recommended);
//    }

//    ====================== TEST WITH MULTIPLE PARAMETERS ========================
//    @ParameterizedTest(name = "weight={0}, height={1}")
//    @CsvSource(value = {"89.0, 1.72", "95.0, 1.75", "110.0, 1.78"})
//    // u need to use the same name value here always.
//    void should_ReturnTrue_When_DietRecommended(Double coderWeight, Double coderHeight){
//        // given
//        double weight = coderWeight;
//        double height = coderHeight;
//
//        // when
//        boolean recommended = BMICalculator.isDietRecommended(weight, height);
//
//        /// then
//        assertTrue(recommended);
//    }

//    ========================= TAKE TEST INPUT FROM CSV FILE ===========================
//    @ParameterizedTest(name = "weight={0}, height={1}")
//    @CsvFileSource(resources = "/sampleTest.csv", numLinesToSkip = 1)
//    void should_ReturnTrue_When_DietRecommended(Double coderWeight, Double coderHeight){
//        // given
//        double weight = coderWeight;
//        double height = coderHeight;
//
//        // when
//        boolean recommended = BMICalculator.isDietRecommended(weight, height);
//
//        /// then
//        assertTrue(recommended);
//}


        @Test
        @DisplayName("TEST CASE WHEN DIET IS NOT REQUIRED ")
        void should_ReturnFalse_When_DietNotRecommended() {
            // given
            double height = 1.92;
            double weight = 50.0;

            // when
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            /// then
            assertFalse(recommended);
        }

        @Test
        void should_ThrowArithmeticException_When_HeightZero() {
            // given
            double height = 0.0;
            double weight = 50.0;

            // when
            Executable executable = () -> BMICalculator.isDietRecommended(weight, height);

            /// then
            assertThrows(ArithmeticException.class, executable);
        }
    }

//    -------------------------------------------------------------------------------------------------

    @Nested
    class TestForGetCoderWithWorstBMI {

        @Test
        void should_ReturnCoderWithWorstBMI_When_ListNotEmpty() {

            // given
            List<Coder> coders = new ArrayList<>();
            coders.add(new Coder(1.80, 60));
            coders.add(new Coder(1.82, 98));
            coders.add(new Coder(1.82, 64));

            // when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

            // then
            assertAll(
                    () -> assertEquals(1.82, coderWorstBMI.getHeight()),
                    () -> assertEquals(98, coderWorstBMI.getWeight())
            );
        }

        @Test
        void should_ReturnNullCoderWithWorstBMI_When_ListEmpty() {

            // given
            List<Coder> coders = new ArrayList<>();

            // when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

            // then
            assertNull(coderWorstBMI);
        }

        @Test
        @Disabled
        // ========== kind of performance test ===========
        void should_ReturnCoderWithWorstBMIIn1MS_When_CoderListHas10000Elements(){

//        assumeTrue(this.environment.equals("prod"));

            // given
            List<Coder> coders = new ArrayList<>();
            for(int i=0; i<10000; i++){
                coders.add(new Coder(1.0 + i, 10.0 + i));
            }

            // when
            Executable executable = () -> BMICalculator.findCoderWithWorstBMI(coders);

            // then
            assertTimeout(Duration.ofMillis(80), executable);
        }
    }

//    ----------------------------------------------------------------------------------------------

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void should_CorrectBMIScoreArray_When_ListNotEmpty(){

        // given
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80, 60.0));
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 64.7));
        double expected[] = {18.52, 29.59, 19.53};

        // when
        double[] bmiScores = BMICalculator.getBMIScores(coders);

        // then
        // fails because it looks if both array objects are the same objects in memory
        // assertEquals(expected, bmiScores);
        assertArrayEquals(expected, bmiScores);
    }

}