package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String gender;
    private final Boolean expectedHasMane;

    public LionParametrizedTest(String gender, Boolean expectedHasMane) {
        this.gender = gender;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void shouldHaveMane() throws Exception {
        Mammal mammal = new Feline();
        Lion lion = new Lion(gender, mammal);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
