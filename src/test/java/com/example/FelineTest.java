package com.example;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FelineTest {

    @Test
    public void shouldEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> result = feline.eatMeat();
        assertNotNull(result);
        assertEquals(3, result.size());
        assertThat(result, hasItems("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void shouldGetFamily()  {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}
