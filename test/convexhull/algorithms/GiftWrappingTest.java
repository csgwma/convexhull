package convexhull.algorithms;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Heikki Haapala
 */
public class GiftWrappingTest {

    /**
     *
     */
    public GiftWrappingTest() {
    }

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of useAlgorithm method, of class GiftWrapping.
     */
    @Test
    public void testUseAlgorithm() {
        Algorithm algorithm = new GiftWrapping();
        String result;
        // test with 2 points
        if ((result = Helper.testAlgorithm(algorithm, "testmaterial/test2", "testmaterial/result2")) != null) {
            fail(result);
        }
        // test with 3 points
        if (!((result = Helper.testAlgorithm(algorithm, "testmaterial/test3", "testmaterial/result3")) == null ||
                (result = Helper.testAlgorithm(algorithm, "testmaterial/test3", "testmaterial/test3")) == null)) {
            fail(result);
        }
        // test with 4 collinear points
        if ((result = Helper.testAlgorithmCollinearPoints4(algorithm)) != null) {
            fail(result);
        }
        // test with 100 collinear points
        if ((result = Helper.testAlgorithmCollinearPoints100(algorithm)) != null) {
            fail(result);
        }
        // test with 10000 collinear points
        if ((result = Helper.testAlgorithmCollinearPoints10000(algorithm)) != null) {
            fail(result);
        }
        // test with 100 points
        if ((result = Helper.testAlgorithm(algorithm, "testmaterial/test100", "testmaterial/result100")) != null) {
            fail(result);
        }
        // test with 10000 points
        if ((result = Helper.testAlgorithm(algorithm, "testmaterial/test10000", "testmaterial/result10000")) != null) {
            fail(result);
        }
        // test with a ready hull of points
        if ((result = Helper.testAlgorithm(algorithm, "testmaterial/result100", "testmaterial/result100")) != null) {
            fail(result);
        }
        // test with points in a circle
        if ((result = Helper.testAlgorithm(algorithm, "testmaterial/circle10000", "testmaterial/circle10000")) != null) {
            fail(result);
        }
        // test with points in a circle
        // disabled for being too heavy
//        if ((result = Helper.testAlgorithm(algorithm, "testmaterial/circle100000", "testmaterial/circle100000")) != null) {
//            fail(result);
//        }
    }
}
