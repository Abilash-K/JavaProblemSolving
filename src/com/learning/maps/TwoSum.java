package com.learning.maps;

import java.util.*;


public class TwoSum {
    public static void main(String[] args) {
        int target = 9;
        int[] intArray = {2,4,6,7,8};

        //Create New Hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<intArray.length;i++) {
            if (map.containsKey(target-intArray[i])){
                System.out.println("The Index of 2 -- " + map.get(target-intArray[i]));
                System.out.println("The Index of 7 -- " + i);
            }
            map.put(intArray[i],i);

        }
    }
}
