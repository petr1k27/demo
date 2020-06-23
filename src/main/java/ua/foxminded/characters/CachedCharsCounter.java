package ua.foxminded.characters;

import java.util.HashMap;
import java.util.Map;

public class CachedCharsCounter extends CharsCounterDecorator {

    private Map<String, Map<Character, Long>> cache;

    public CachedCharsCounter(CharsCounter charsCounter) {
        super(charsCounter);
        cache = new HashMap<>();
    }

    @Override
    public Map<Character, Long> countCharacters(String text) {
        return cache.computeIfAbsent(text, value -> super.countCharacters(text));
    }
}
