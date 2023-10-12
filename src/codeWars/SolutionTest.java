package codeWars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", Kata.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", Kata.chromosomeCheck("XX"));
    }
}
