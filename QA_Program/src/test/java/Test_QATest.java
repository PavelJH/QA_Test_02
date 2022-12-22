import org.junit.Test;

import static org.junit.Assert.*;

public class Test_QATest {

    @Test
    public void testQaFromArrayNegativTest() {
        int[] actualArray = {1, 5, 7, 9, 1, 0, 11, -4, 5};
        int[] expectArray = {1, 7, 9, 1, 0, 6, 11, -4};
        assertNotEquals(expectArray, Test_QA.deleteNumber(actualArray, 5));
    }

    @Test
    public void testQaFromArrayTest() {
        int[] actualArray = {1, 2, 3, 3, 5};
        int[] expectedArray = {1, 2, 5};
        assertArrayEquals(expectedArray, Test_QA.deleteNumber(actualArray, 3));
    }

    @Test
    public void testQaFromArrayTest1() {
        int[] actualArray = {154, 123, 122, 111, 123};
        int[] expectedArray = {154, 122, 111};
        assertArrayEquals(expectedArray, Test_QA.deleteNumber(actualArray, 123));
    }

    @Test
    public void testQaFromArrayNegativTest1() {
        int[] actualArray = {154, 123, 122, 111, 123};
        int[] expectArray = {154, 123, 122, 111, 123};
        assertNotEquals(expectArray, Test_QA.deleteNumber(actualArray, 123));
    }

    @Test
    public void testQaFromArrayNegativTest2() {
        int[] actualArray = {-2, -2, -2};
        int[] expectArray = {-2};
        assertNotEquals(expectArray, Test_QA.deleteNumber(actualArray, -2));
    }

    @Test
    public void testQaFromArrayTest5() {
        int[] actualArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5, 0};
        assertArrayEquals(expectedArray, Test_QA.arraysCopyOf(actualArray, 6));
//        assertEquals(expectedArray.length, Test_QA.arraysCopyOf(actualArray, 3).length);
    }

    public void testQaFromArrayNegativTest6() {
        int[] actualArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5, 0};
        assertEquals(expectedArray.length, Test_QA.arraysCopyOf(actualArray, 3).length);
    }

    public void testQaFromArrayTest7() {
        int[] actualArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3};
        assertEquals(expectedArray.length, Test_QA.arraysCopyOf(actualArray, 3).length);
    }

    public void testQaFromArrayNegativTest8() {
        int[] actualArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5, 0, 8, -2};
        assertArrayEquals(expectedArray, Test_QA.arraysCopyOf(actualArray, 6));
    }

    public void testQaFromArrayNegativTest9() {
        int[] actualArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, -1, 0, -12};
        assertArrayEquals(expectedArray, Test_QA.arraysCopyOf(actualArray, 6));


    }
}