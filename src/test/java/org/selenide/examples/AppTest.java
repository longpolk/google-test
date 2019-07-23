package org.selenide.examples;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void userCanSearchKeywordWithGoogle()
    {
        open("https://www.google.com");

        assertTrue( true );
    }
}
