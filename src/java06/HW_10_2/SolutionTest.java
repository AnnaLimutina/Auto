package java06.HW_10_2;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Kata.position('a'));
        assertEquals("Position of alphabet: 26", Kata.position('z'));
        assertEquals("Position of alphabet: 5", Kata.position('e'));
    }
}
