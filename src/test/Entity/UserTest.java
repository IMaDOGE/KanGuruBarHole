package Entity;

import hu.unideb.inf.entity.User;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

public class UserTest {
    @Mock
    private User underTest1, underTest2;

    @BeforeAll //@BeforeClass
    public static void setUpClass() {
    }

    @AfterAll //@AfterClass
    public static void tearDownClass() {
    }


    @BeforeEach //@Before
    public void setUp() {
        // ...
    }

    @AfterEach //@After
    public void tearDown() {
        // ...
    }

    @Test
    public void testValami(){
        // ..
    }
    // TODO
}
