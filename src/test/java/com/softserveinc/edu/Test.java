package com.softserveinc.edu;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class TestEnvelope {
    @Test
    public void test() {
       Envelope firstEnvelope = new Envelope(10, 15);
       Envelope secondEnvelope = new Envelope(5, 5);
       double squareResult1 = firstEnvelope.squareCalculating();
       double squareResult2 = secondEnvelope.squareCalculating();
        Assert.assertTrue(squareResult2 < squareResult1, "The second envelope square is larger than the first");
    }
}