import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void shouldGetSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void shouldGetFood() throws Exception {
        ArrayList<String> eatList = new ArrayList<>();
        eatList.add("Мясо");
        Mockito.when(feline.eatMeat()).thenReturn(eatList);
        Cat cat = new Cat(feline);
        List<String> result = cat.getFood();
        assertNotNull(result);
        assertEquals(eatList, result);
    }
}
