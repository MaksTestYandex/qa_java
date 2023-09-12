import com.example.Lion;
import com.example.Mammal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Mammal mammal;

    @Test
    public void shouldGetKittens() throws Exception {
        Mockito.when(mammal.getKids()).thenReturn(1);
        Lion lion = new Lion("Самец", mammal);
        int result = lion.getKittens();
        assertEquals(1, result);
    }

    @Test
    public void shouldGetFood() throws Exception {
        ArrayList<String> eatList = new ArrayList<>();
        eatList.add("Животные");
        eatList.add("Птицы");
        eatList.add("Рыба");
        Mockito.when(mammal.getFood("Хищник")).thenReturn(eatList);
        Lion lion = new Lion("Самец", mammal);
        List<String> result = lion.getFood();
        assertEquals(eatList, result);
    }
}