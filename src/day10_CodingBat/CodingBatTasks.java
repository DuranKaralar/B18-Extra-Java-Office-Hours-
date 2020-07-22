package day10_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class CodingBatTasks {


    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for(String each: strings) {

            String key = each.substring(0,1);

            if(!map.containsKey(key)){
                map.put(key, "");
            }

            map.put(key, map.get(key) + each);

        }

        return map;

    }


    public String wordAppend(String[] strings) {

        String result = "";
        Map<String, Boolean> map = new HashMap<>();

        for(String each: strings) {

            if(map.containsKey(each)) {

                result += each;
                map.remove(each);

            } else {
                map.put(each, true);
            }

        }

        return result;


    }


    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for(String each : strings) {

            if(!map.containsKey(each)) {
                map.put(each, false);
            } else {
                map.put(each, true);
            }

        }

        return map;
    }


    // allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"])
    // → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]

    // each : cy
    // map: {a , 6 }


    // String temp = strings[2] // cx
    // strings[2] = strings[3]
    // strings[3] = temp

    public String[] allSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for(int i =0; i < strings.length; i++) {

            String each = strings[i];

            if(!map.containsKey(each.substring(0,1))){
                map.put(each.substring(0,1), i);
            } else {
                String temp = strings[map.get(each.substring(0,1))];
                strings[map.get(each.substring(0,1))] = strings[i];
                strings[i] = temp;
                map.remove(each.substring(0,1));
            }

        }

        return strings;
    }






}
