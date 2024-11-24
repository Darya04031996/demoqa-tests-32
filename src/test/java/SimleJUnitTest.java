import org.junit.jupiter.api.*;

public class SimleJUnitTest {
    int result;
    @BeforeAll
   static void beforeall() {
        System.out.println("###    beforeAll()\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###    beforeEach()");
        result = getResult();

    }

    @AfterEach
    void AfterEach() {
        System.out.println("###    AfterEach()\n");
        result = 0;
    }
    @AfterAll
    static void afterall() {
        System.out.println("###    afterall()\n");
    }
        @Test
        void firstTest () {
            System.out.println("###    firstTest()");
            Assertions.assertTrue(result > 2);
        }

        @Test
        void secondTest () {
            System.out.println("###    secondTest()");
            Assertions.assertTrue(result > 2);
        }
        @Test
        void thirdTest () {
            System.out.println("###    thirdTest()");
            Assertions.assertTrue(result > 2);
        }
        private int getResult() {
            return 3;
        }
    }
