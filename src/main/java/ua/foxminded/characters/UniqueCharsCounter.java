package ua.foxminded.characters;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueCharsCounter implements CharsCounter {

    @Override
    public Map<Character, Long> countCharacters(String text) {
        return text.chars()
                .mapToObj(c -> ((char) c))
                .collect(
                        Collectors.groupingBy(
                                Character::charValue,
                                LinkedHashMap::new,
                                Collectors.counting()
                        )
                );
    }
}
