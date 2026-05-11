package org.example;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.List.of;

public class Main {
    public static void main(String[] args) {
        System.out.println("Duplicate character in String array List!");

        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Using Stream concept
        Set<Character> result = words.stream().
				flatMapToInt(String::chars).
				mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(x-> x, Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(result);

        // Iterate through each string in the list
        Map<Character, Integer> mapsData = new HashMap<>();

        for(String ss : words) {
            for( char ch : ss.toCharArray()){
                System.out.println(mapsData.get(ch)+"--->"+mapsData.getOrDefault(ch,0));
                mapsData.put(ch, mapsData.getOrDefault(ch, 0)+1);
            }
        }

        mapsData.forEach((character,count)->{
            if(count > 1 ) {
                System.out.println(character + " : " + count);
            }
            });
    }
}
