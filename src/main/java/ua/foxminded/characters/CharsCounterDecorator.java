package ua.foxminded.characters;

import java.util.Map;

public class CharsCounterDecorator implements CharsCounter {

    protected CharsCounter charsCounter;

    public CharsCounterDecorator(CharsCounter characters) {
        this.charsCounter = characters;
    }

    @Override
    public Map<Character, Long> countCharacters(String text) {
        return charsCounter.countCharacters(text);
    }
}
