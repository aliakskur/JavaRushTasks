package com.javarush.task.task08.task0813;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {


        Set<String> setStrings = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            setStrings.add("Лыфвыфвфы" + i);
        }



        return setStrings;
    }

    public static void main(String[] args) {

        createSet();
    }
}
