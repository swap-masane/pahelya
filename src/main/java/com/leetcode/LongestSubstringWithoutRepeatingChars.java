package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubString(String s){
        if(s==null || s.length() ==0)
            return 0;
        int lenOfLongestString = 0;
        int left = 0, right = 0, n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        while(right < n){
            // check if character already exists and jump left
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)), left);
            }
            // add k, v as character and its position ( position starts from 1 )
            map.put(s.charAt(right), right +1);

            lenOfLongestString = Math.max(lenOfLongestString, right -left +1);
            right ++;
        }

        return lenOfLongestString;
    }
}
