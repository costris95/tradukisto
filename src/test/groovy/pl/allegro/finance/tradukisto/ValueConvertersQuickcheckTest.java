package pl.allegro.finance.tradukisto;

import static net.java.quickcheck.generator.PrimitiveGeneratorsIterables.someIntegers;
import static org.junit.Assert.*;
import static pl.allegro.finance.tradukisto.ValueConverters.BRAZILIAN_PORTUGUESE_INTEGER;
import static pl.allegro.finance.tradukisto.ValueConverters.ENGLISH_INTEGER;
import static pl.allegro.finance.tradukisto.ValueConverters.GERMAN_INTEGER;
import static pl.allegro.finance.tradukisto.ValueConverters.POLISH_INTEGER;
import static pl.allegro.finance.tradukisto.ValueConverters.RUSSIAN_INTEGER;
import static pl.allegro.finance.tradukisto.ValueConverters.CZECH_INTEGER;
import static pl.allegro.finance.tradukisto.ValueConverters.SPANISH_INTEGER;

import org.junit.Test;


/**
 * The Class ConferenceFormsTest.
 */

public class ValueConvertersQuickcheckTest {

    @Test
    public void convertNumbersBrazilianEmpty() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = BRAZILIAN_PORTUGUESE_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.isEmpty());
        }
    }

    @Test
    public void convertNumbersBrazilianContainsNumbers() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = BRAZILIAN_PORTUGUESE_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*\\d+.*"));
        }
    }

    @Test
    public void convertNumbersBrazilianContainsWeirdChars() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = BRAZILIAN_PORTUGUESE_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*[ρη].*"));
        }
    }

    @Test
    public void convertNumbersEnglishEmpty() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = ENGLISH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.isEmpty());
        }
    }

    @Test
    public void convertNumbersEnglishContainsNumbers() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = ENGLISH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*\\d+.*"));
        }
    }

    @Test
    public void convertNumbersEnglishContainsWeirdChars() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = ENGLISH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*[ρη].*"));
        }
    }

    @Test
    public void convertNumbersGermanEmpty() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = GERMAN_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.isEmpty());
        }
    }

    @Test
    public void convertNumbersGermanContainsNumbers() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = GERMAN_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*\\d+.*"));
        }
    }

    @Test
    public void convertNumbersGermanContainsWeirdChars() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = GERMAN_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*[ρη].*"));
        }
    }

    @Test
    public void convertNumbersPolishEmpty() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = POLISH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.isEmpty());
        }
    }

    @Test
    public void convertNumbersPolishContainsNumbers() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = POLISH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*\\d+.*"));
        }
    }

    @Test
    public void convertNumbersPolishContainsWeirdChars() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = POLISH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*[ρη].*"));
        }
    }

    @Test
    public void convertNumbersRussianEmpty() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = RUSSIAN_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.isEmpty());
        }
    }

    @Test
    public void convertNumbersRussianContainsNumbers() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = RUSSIAN_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*\\d+.*"));
        }
    }

    @Test
    public void convertNumbersRussianContainsWeirdChars() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = RUSSIAN_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*[ρη].*"));
        }
    }

    @Test
    public void convertNumbersCzechEmpty() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = CZECH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.isEmpty());
        }
    }

    @Test
    public void convertNumbersCzechContainsNumbers() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = CZECH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*\\d+.*"));
        }
    }

    @Test
    public void convertNumbersCzechContainsWeirdChars() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = CZECH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*[ρη].*"));
        }
    }

    @Test
    public void convertNumbersSpanishEmpty() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = SPANISH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.isEmpty());
        }
    }

    @Test
    public void convertNumbersSpanishContainsNumbers() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = SPANISH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*\\d+.*"));
        }
    }

    @Test
    public void convertNumbersSpanishContainsWeirdChars() {

        for (Integer anyNumber : someIntegers(0, 1000000000)) {
            String words = SPANISH_INTEGER.asWords(anyNumber);
            //System.out.println(words + "\n");
            assertFalse(words.matches(".*[ρη].*"));
        }
    }

}