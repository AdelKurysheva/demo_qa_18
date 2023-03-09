import org.junit.jupiter.api.*;

import static java.lang.System.out;

public class JUnitExp {
@BeforeAll
    static void beforeAll() {
    System.out.println("here is before all");}

    @BeforeEach
    void beforeEach() {
        System.out.println("here is before each");
    }

    @AfterEach
    void afterEach() {
      System.out.println("here is after each");
    }
    @Test
    void FirstTest() {
        System.out.println("here is first test");
    }

    @Test
    void SecondTest() {
        System.out.println("here is second test");
    }
}
