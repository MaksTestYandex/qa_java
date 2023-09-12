import com.example.Feline;
import com.example.Lion;
import com.example.Mammal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String gender;
    private final boolean expectedHasMane;

    public LionParametrizedTest(String gender, boolean expectedHasMane) {
        this.gender = gender;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void shouldHaveMane() throws Exception {
        Mammal mammal = new Feline();
        Lion lion = new Lion(gender, mammal);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
