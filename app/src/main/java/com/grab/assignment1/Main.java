package com.grab.assignment1;

import java.util.ArrayList;

/**
 * Created by khoa.hong on 5/13/17.
 */

public class Main {
    private static final int TEST_LIST_SIZE = 20000;
    private static final int COMMON_WORD_LIST_SIZE = TEST_LIST_SIZE / 10;

    public static void main(String args[]) {
        ArrayList<String> commonWordList = Utils.generateRandomArrayListString(COMMON_WORD_LIST_SIZE);
        ArrayList<String> list1 = Utils.generateRandomStringListWithCommonWords(TEST_LIST_SIZE, commonWordList);
        ArrayList<String> list2 = Utils.generateRandomStringListWithCommonWords(TEST_LIST_SIZE, commonWordList);

        long startTime1 = System.nanoTime();
        ArrayList<String> commonWordsResultWithoutOptimizedStructure = Utils.getCommonWordsWithoutOptimizedStructure(list1, list2);
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);

        long startTime2 = System.nanoTime();
        ArrayList<String> commonWordsResultWithOptimizedStructure = Utils.getCommonWordsWithOptimizedStructure(list1, list2);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        System.out.println("Execution time of getCommonWordsWithoutOptimizedStructure function is: " + duration1);
        System.out.println("Execution time of getCommonWordsWithOptimizedStructure function is: " + duration2);
    }
}
