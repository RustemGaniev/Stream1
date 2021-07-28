package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newintList = new ArrayList<>();
        for (Integer num : intList) {
            if (num >= 0 && num % 2 == 0) {
                newintList.add(num);
            }
        }
        Collections.sort(newintList);
        for (Integer l : newintList) {
            System.out.println(l);
        }


    }
}
