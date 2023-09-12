package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String gender;
    private final Boolean expectedHasMane;
    private final Exception expectedException;

    public LionParametrizedTest(String gender, Boolean expectedHasMane, Exception expectedException) {
        this.gender = gender;
        this.expectedHasMane = expectedHasMane;
        this.expectedException = expectedException;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true, null},
                {"Самка", false, null},
                {"Произвольное значение", null, new Exception("Используйте допустимые значения пола животного - самец или самка")},
        };
    }

    @Test
    public void shouldHaveMane() {
        try {
            Mammal mammal = new Feline();
            Lion lion = new Lion(gender, mammal);
            assertEquals(expectedHasMane, lion.doesHaveMane());
        } catch (Exception e) {
            assertEquals(expectedException.getMessage(), e.getMessage());
        }
    }
}
