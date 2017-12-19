package pl.allegro.finance.tradukisto;

import static org.junit.Assert.assertEquals;
import static pl.allegro.finance.tradukisto.ValueConverters.BRAZILIAN_PORTUGUESE_INTEGER;

import org.junit.Test;


/**
 * The Class ConferenceFormsTest.
 */

public class ValueConvertersTest {

    @Test
    public void convertNumbersBrazilian2() {
        String expected = "mil duzentos e trinta e quatro";

        assertEquals(BRAZILIAN_PORTUGUESE_INTEGER.asWords(1_234), expected);
    }

}