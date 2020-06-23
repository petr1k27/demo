package ua.foxminded.characters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class CachedCharsCounterTest {

    private CachedCharsCounter cachedCharsCounter;
    @Mock
    private UniqueCharsCounter uniqueCharsCounter;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cachedCharsCounter = new CachedCharsCounter(uniqueCharsCounter);
    }

    @Test
    public void givenTextComesTwoTimes_thenSecondTimeReturnedFromCache() {
        Map<Character, Long> actual = new LinkedHashMap<>();
        actual.put('a', 1L);
        actual.put('b', 1L);
        actual.put('c', 1L);
        actual.put('d', 1L);

        when(uniqueCharsCounter.countCharacters("abcd")).thenReturn(actual);

        assertEquals(cachedCharsCounter.countCharacters("abcd"), actual);
        assertEquals(cachedCharsCounter.countCharacters("abcd"), actual);

        verify(uniqueCharsCounter, times(1)).countCharacters("abcd");
    }
}