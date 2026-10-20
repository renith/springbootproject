
package com.example.JavaExamples.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverseByWord {

    public static void main(String[] args) {
        String s = "I'm in an interview now ----";

        System.out.println("Reversed By char");

        String reversedByChar = IntStream.range(0, s.length())
                .mapToObj(i -> String.valueOf(s.charAt(s.length() - 1 - i)))
                .collect(Collectors.joining(""));


        System.out.print(reversedByChar);

        System.out.println();
        System.out.println("Reversed by word");

        String[] words = s.split(" ");
        String reverseByWord = IntStream.range(0, words.length)
                .mapToObj(i -> words[words.length - 1 - i])
                .collect(Collectors.joining(" "));


        System.out.print(reverseByWord);
        System.out.println();
        System.out.println("find duplicate in word");

        String sstr = "I can code well";
        String[] split1 = sstr.split(" ");
        List<String> split1List = Arrays.stream(split1).toList();

        List<String> duplicateWord = split1List.stream()
                .filter(word -> word.chars().distinct().count() < word.length())
                .toList();
        System.out.println(duplicateWord);

//find the longest string in a list using streams
        System.out.println("find the longest string in a list using streams");
        List<String> listwords = Arrays.asList("Java", "Python", "JavaScript", "C++");
        Optional<String> max = listwords.stream().max(Comparator.comparing(String::length));
        System.out.println(max);


        System.out.println(" concatenate all strings in a list with a delimiter using");
        List<String> list = Arrays.asList("I", "Love", "Java");
        String concat = list.stream().collect(Collectors.joining());

        System.out.println(concat);

        System.out.println("count the number of vowels in a string");
        String str = "Hello World";
        long count = str.chars().filter(x -> "aeiou".indexOf(x) != -1).count();
        System.out.println();
        System.out.println(count);

        System.out.println("print the number of vowels in a string");
        String str1 = "Hello World";
        str1.chars().filter(x -> "aeiou".indexOf(x) != -1).forEach(x -> System.out.println((char)x));

        System.out.println("Remove null values from a list using filter");

        List<String> wordsList = Arrays.asList("Java", null, "Stream", null, "API");
        List<String> removedNull = wordsList.stream().filter(Objects::nonNull).toList();

        System.out.println(removedNull);

        System.out.println("Find all strings that are palindromes in a list");
        List<String> wordsLists = Arrays.asList("radar", "level", "world", "java");
        List<String> palindrome = wordsLists.stream().filter(word -> word.equals(new StringBuffer(word).reverse().toString()))
                .toList();


        System.out.println(palindrome);

        System.out.println("Reverse each string in a list::");
        List<String> reverseListString = Arrays.asList("Java", "Stream", "API");
        List<String> reveseListResult = reverseListString.stream().map(x -> new StringBuffer(x).reverse().toString()).toList();

        System.out.println(reveseListResult);

        System.out.println("group a list of words into anagram groups");
        List<String> wordList = Arrays.asList(
                "eat", "tea", "tan", "ate", "nat", "bat"
        );

        Collection<List<String>> anagram = wordList.stream()
                        .collect(Collectors.groupingBy(word -> {

                            char[] c1 = word.toCharArray();
                            Arrays.sort(c1);
                            return new String(c1);
                        })).values();

        System.out.println(anagram);


        //remove the word along with number
        System.out.println("remove the word along with number");
        String s2 = "I23 had c75 ver3y beautiful morning";
        String[] split2 = s2.split(" ");
        List<String> list2 = Arrays.stream(split2).toList();
        List<String> listsWord1 =list2.stream().filter(word -> !word.matches(".*\\d.*")).toList();
        System.out.println(listsWord1);

        //remove the word along with number and count the max word
        System.out.println("remove the word along with number and print the max word");
        Optional<String> maxWord = list2.stream().filter(word -> !word.matches(".*\\d.*"))
                        .max(Comparator.comparing(String::length));
        System.out.println(maxWord);

    }

}
