package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CubePairs {

    public void Solution(){
        Map<Double, List<Integer>> map = new HashMap<Double, List<Integer>>();
        double sum = 0;
        for (int i = 1;i<1000;i++){
            for(int j=1;j<1000;j++){
                    sum =  Math.pow(i,3) + Math.pow(j,3);
                    if(map.containsKey(sum)){
                        List l = map.get(sum);
                        if(!l.contains(i) || !l.contains(j)){
                            l.add(i);
                            l.add(j);
                        }

                    }else{
                        List l = new ArrayList();
                        l.add(i);
                        l.add(j);
                        map.put(sum, l);
                }
            }

            map.forEach((k,v)->{
               if(v.size() > 2){
                   System.out.println(v);
               }
            });

        }
    }

    public static void main(String[] args) {
        CubePairs cp = new CubePairs();
        cp.Solution();
    }
}
