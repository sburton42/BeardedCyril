package edu.byui.cs.beardedcyril;

import android.test.InstrumentationTestCase;

/**
 * Created by sburton on 6/10/15.
 */
public class BeardTest extends InstrumentationTestCase {
    public void testLength() {
        Beard b = new Beard();

        b.setLength(10.0);
        assertEquals(10.0, b.getLength());

        b.setLength(12.0);
        assertEquals(12.0, b.getLength());


    }

    public void testCreation() {
        Beard b = new Beard();

        assertEquals(-1.0, b.getLength());
    }
}
