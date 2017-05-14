package com.grab.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/**
 * Created by khoa.hong on 5/13/17.
 */

public class Utils {
    public static ArrayList<String> generateRandomArrayListString(int arrayListSize) {
        ArrayList<String> arrayRandom = new ArrayList<>(arrayListSize);
        for (int i = 0; i < arrayListSize; i++) {
            arrayRandom.add(UUID.randomUUID().toString());
        }
        return arrayRandom;
    }

    public static ArrayList<String> generateRandomStringListWithCommonWords(int arrayListSize, ArrayList<String> commondWords) {
        ArrayList<String> randomArrayListString = Utils.generateRandomArrayListString(arrayListSize);
        randomArrayListString.addAll(commondWords);
        Collections.shuffle(randomArrayListString);
        return randomArrayListString;
    }

    public static ArrayList<String> getCommonWordsWithoutOptimizedStructure(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> commonStrings = new ArrayList<>();
        String currentWord;
        for (int i = 0; i < list1.size(); i++) {
            currentWord = list1.get(i);
            if (list2.contains(currentWord))
                commonStrings.add(currentWord);
        }
        return commonStrings;
    }

    public static ArrayList<String> getCommonWordsWithOptimizedStructure(ArrayList<String> list1, ArrayList<String> list2) {
        Set<String> hashSet1 = new HashSet<>(list1);
        Set<String> hashSet2 = new HashSet<>(list2);
        for (Iterator<String> it = hashSet1.iterator(); it.hasNext(); ) {
            if (!hashSet2.contains(it.next())) it.remove();
        }

        return new ArrayList<>(hashSet1);
    }
}
