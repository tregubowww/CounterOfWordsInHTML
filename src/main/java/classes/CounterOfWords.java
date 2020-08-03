package classes;

import interfaces.Counter;

import java.util.LinkedHashMap;
import java.util.Map;

public class CounterOfWords implements Counter {
    //подсчитывет количество нахождений в тексте каждого  слова
    //Разделителями слов считает следующие символы: {' ', ',', '.', '!', '?','"', ';', ':', '[', ']', '(', ')', '\n', '\r', '\t'}
    @Override
    public Map<String, Integer> countWords(String text) {
        String[] arrayWords = text.split("[,.!?)(\t\n\r \";:\\[\\]]+");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String str : arrayWords
        ) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else map.put(str, 1);
        }
        return map;
    }
}
