package codeWars;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaTest {
    @Test
    public final void test_all() {
        Assert.assertEquals( "Nope!" , 4, String.valueOf(Java.doubleInteger(2))); // Test cases here!
    }
}
