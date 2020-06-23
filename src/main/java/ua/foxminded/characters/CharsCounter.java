package ua.foxminded.characters;

import java.util.Map;

interface CharsCounter {

    Map<Character, Long> countCharacters(String text);

}
