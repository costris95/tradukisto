package pl.allegro.finance.tradukisto;


//import static net.java.quickcheck.generator.PrimitiveGenerators.integers;
import static net.java.quickcheck.generator.PrimitiveGeneratorsIterables.someIntegers;
//import net.java.quickcheck.Generator;
//import net.java.quickcheck.characteristic.Classification;
//import net.java.quickcheck.collection.Pair;
//import net.java.quickcheck.generator.iterable.Iterables;
import static org.junit.Assert.*;
import static pl.allegro.finance.tradukisto.ValueConverters.BRAZILIAN_PORTUGUESE_INTEGER;

import org.junit.Test;


/**
 * The Class ConferenceFormsTest.
 */

public class ValueConvertersQuickcheckTest {

    @Test
    public void convertNumbersBrazilianRandom() {

        for (Integer anyNumber : someIntegers(0, 10000000)) {
            String words = BRAZILIAN_PORTUGUESE_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.isEmpty());
        }
    }

}