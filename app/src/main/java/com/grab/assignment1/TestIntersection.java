package com.grab.assignment1;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * Created by khoa.hong on 5/14/17.
 */

public class TestIntersection {
    private static final int TEST_LIST_SIZE = 20000;
    private static final int COMMON_WORD_LIST_SIZE = TEST_LIST_SIZE / 10;

    @Test
    public void testGetCommonWordsWithoutOptimizedStructure() {
        ArrayList<String> commonWordList = Utils.generateRandomArrayListString(COMMON_WORD_LIST_SIZE);
        ArrayList<String> list1 = Utils.generateRandomStringListWithCommonWords(TEST_LIST_SIZE, commonWordList);
        ArrayList<String> list2 = Utils.generateRandomStringListWithCommonWords(TEST_LIST_SIZE, commonWordList);
        ArrayList<String> commonWordsResultWithoutOptimizedStructure = Utils.getCommonWordsWithoutOptimizedStructure(list1, list2);
        Collections.sort(commonWordList);
        Collections.sort(commonWordsResultWithoutOptimizedStructure);
        assertEquals(commonWordList, commonWordsResultWithoutOptimizedStructure);
    }

    @Test
    public void testGetCommonWordsWithOptimizedStructure() {
        ArrayList<String> commonWordList = Utils.generateRandomArrayListString(COMMON_WORD_LIST_SIZE);
        ArrayList<String> list1 = Utils.generateRandomStringListWithCommonWords(TEST_LIST_SIZE, commonWordList);
        ArrayList<String> list2 = Utils.generateRandomStringListWithCommonWords(TEST_LIST_SIZE, commonWordList);
        ArrayList<String> commonWordsWithOptimizedStructure = Utils.getCommonWordsWithOptimizedStructure(list1, list2);
        Collections.sort(commonWordList);
        Collections.sort(commonWordsWithOptimizedStructure);
        assertEquals(commonWordList, commonWordsWithOptimizedStructure);
    }
}
