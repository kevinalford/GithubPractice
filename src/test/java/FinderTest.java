import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {
    int[] intArray = new int[]{1,2,3,4,5,6};
    int[] emptyArray = new int[0];
    int[] nullArray;

    @Test
    void findMax1() {
        assertEquals(6, Finder.findMax(intArray));
    }

    @Test
    void findMax2() {
        assertNull(Finder.findMax(emptyArray));
    }

    @Test
    void findMax3() {
        assertNull(Finder.findMax(nullArray));
    }

    @Test
    void findMin1() {
        assertEquals(1, Finder.findMin(intArray));
    }

    @Test
    void findMin2() {
        assertNull(Finder.findMin(emptyArray));
    }

    @Test
    void findMin3() {
        assertNull(Finder.findMin(nullArray));
    }


}