package com.learning.strings;

import java.util.Arrays;
import java.util.Collections;

public class ReverseVowels {
    public static void main(String[] args) {
        String word = "icecream";
        String vowels = "aeiouAEIOU";
        char[] wordArr = word.toCharArray();

        int start =0;
        int end = wordArr.length - 1;

        while (start<end) {
            while (start<end && vowels.indexOf(wordArr[start]) == -1) {
                start++;
            }
            while (start<end && vowels.indexOf(wordArr[end]) == -1) {
                end--;
            }

            char temp = wordArr[start];
            wordArr[start] = wordArr[end];
            wordArr[end] = temp;

            start++;
            end--;
        }

    }
}
