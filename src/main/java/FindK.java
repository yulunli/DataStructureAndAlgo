package main.java;

/**
 Find the kth largest item of an array.
 */

import java.util.*;

public class FindK {
    public static Integer findK(Integer[] array, int k) {
        if (array.length < k) {
            return null;
        }
        int int_cache = array[0];
        List<Integer> aA = new ArrayList<Integer>();
        List<Integer> aB = new ArrayList<Integer>();
        for (int i=1; i < array.length; i++) {
            if (array[i] >= int_cache) {
                aA.add(array[i]);
            } else {
                aB.add(array[i]);
            }
        }
        if (aA.size() == k-1) {
            return int_cache;
        } else if (aA.size() > k-1) {
            return findK(aA.toArray(new Integer[aA.size()]), k);
        } else {
            aB.add(int_cache);
            return findK(aB.toArray(new Integer[aB.size()]), k-aA.size());
        }
    }

    public static void main(String[] args) {
        Integer[] test = {1, 1, 2, 2, 3, 3};
        int k = 4;
        int i = FindK.findK(test, k);
        System.out.println(i);
    }
}