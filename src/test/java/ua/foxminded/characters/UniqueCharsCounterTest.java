package ua.foxminded.characters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueCharsCounterTest {

    private UniqueCharsCounter uniqueCharsCounter;

    @BeforeEach
    public void setUp(){
        uniqueCharsCounter = new UniqueCharsCounter();
    }

    @Test
    public void givenStringWithOneRepeatedCharacter() {
        Map<Character, Long> expected = new LinkedHashMap<>();
        expected.put('a', 7L);

        Map<Character, Long> actual = uniqueCharsCounter.countCharacters("aaaaaaa");

        assertEquals(expected, actual);
    }

    @Test
    public void givenStringWithoutCharacters() {
        Map<Character, Long> expected = new LinkedHashMap<>();
        expected.put( '!',1L);
        expected.put( '@',1L);
        expected.put( '#',1L);
        expected.put( '$',1L);
        expected.put( '%',1L);
        expected.put( '^',1L);
        expected.put( '&',1L);
        expected.put( '*',1L);
        expected.put( '(',1L);
        expected.put( ')',1L);
        expected.put( '_',1L);
        expected.put( '+',1L);
        expected.put( '-',1L);
        expected.put( '=',1L);

        Map<Character, Long> actual = uniqueCharsCounter.countCharacters("!@#$%^&*()_+-=");

        assertEquals(expected, actual);
    }

    @Test
    public void givenStringWithoutSymbols() {
        Map<Character, Long> expected = new LinkedHashMap<>();
        expected.put( 'k',1L);
        expected.put( 'e',3L);
        expected.put( 'p',2L);
        expected.put( ' ',2L);
        expected.put( 'i',2L);
        expected.put( 't',1L);
        expected.put( 's',1L);
        expected.put( 'm',1L);
        expected.put( 'l',1L);

        Map<Character, Long> actual = uniqueCharsCounter.countCharacters("keep it simple");

        assertEquals(expected, actual);
    }

    @Test
    public void givenStringWithSymbols() {
        Map<Character, Long> expected = new LinkedHashMap<>();
        expected.put( 'h',1L);
        expected.put( 'e',1L);
        expected.put( 'l',3L);
        expected.put( 'o',2L);
        expected.put( ' ',1L);
        expected.put( 'w',1L);
        expected.put( 'r',1L);
        expected.put( 'd',1L);
        expected.put( '!',1L);

        Map<Character, Long> actual = uniqueCharsCounter.countCharacters("hello world!");

        assertEquals(expected, actual);
    }

    @Test
    public void givenStringWithUpperCaseChars() {
        Map<Character, Long> expected = new LinkedHashMap<>();
        expected.put( 'L',1L);
        expected.put( 'o',3L);
        expected.put( 'n',3L);
        expected.put( 'd',1L);
        expected.put( ' ',6L);
        expected.put( 'i',4L);
        expected.put( 's',1L);
        expected.put( 't',4L);
        expected.put( 'h',1L);
        expected.put( 'e',2L);
        expected.put( 'c',1L);
        expected.put( 'a',4L);
        expected.put( 'p',1L);
        expected.put( 'l',1L);
        expected.put( 'f',1L);
        expected.put( 'G',1L);
        expected.put( 'r',2L);
        expected.put( 'B',1L);
        expected.put( '!',1L);

        Map<Character, Long> actual = uniqueCharsCounter.countCharacters("London is the capital of Great Britain!");

        assertEquals(expected, actual);
    }

}
