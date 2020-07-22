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
    





}
