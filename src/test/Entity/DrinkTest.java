package Entity;

import hu.unideb.inf.entity.Drink;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class DrinkTest {
    @Mock
    private Drink underTest1; //, underTest2;

    @BeforeAll //@BeforeClass
    public static void setUpClass() {
    }

    @AfterAll //@AfterClass
    public static void tearDownClass() {
    }


    @BeforeEach //@Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        underTest1 = new Drink("TestDrink1", 10,200,300);
        // ...
    }

    @AfterEach //@After
    public void tearDown() {
        // ...
    }

    @Test
    void testGetIdShouldReturnIdWhenCalled(){
        int expected = 4;
        Assertions.assertEquals(expected, underTest1.getId());

        underTest1.setId(5);
        expected = 5;
        Assertions.assertEquals(expected, underTest1.getId());
    }

    /*@Test
    public void testValami(){
        // ..
    }*/
    // TODO
}
