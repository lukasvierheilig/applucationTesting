import org.example.TestHelper;
import org.example.TestHelper2;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HelperTest {

   TestHelper2 mockTestHelper2 = mock(TestHelper2.class);
   TestHelper testHelper = new TestHelper(mockTestHelper2);

   private static String person = "Ana";

    @Test
    public void shouldGreetAna(){
        when(mockTestHelper2.getValue()).thenReturn("Servus");

        assertEquals("Servus Ana", testHelper.greet(person));

    }
}
