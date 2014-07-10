package main.java;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_cases = in.nextInt();
        Set<String> elements = new HashSet<String>();
        for (char a = 'a'; a <= 'z'; a++) {
            elements.add("" + a);
        }
        for (int i = 0; i < num_cases; i++) {
            String gem = in.next();
            for (Iterator<String> ele = elements.iterator(); ele.hasNext();) {
                if (!gem.contains(ele.next())) {
                    ele.remove();
                }
            }
        }
        System.out.println(elements.size());
    }
}