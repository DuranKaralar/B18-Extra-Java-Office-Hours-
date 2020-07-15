package day9_CodingBat;

import java.util.Map;

public class CodingBatTasks {

    public Map<String, String> topping3(Map<String, String> map) {

        if(map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        if(map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;

    }

    public Map<String, String> mapAB2(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){

            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }

        }

        return map;

    }

    public Map<String, String> mapAB3(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")) return map;

        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }

        if(map.containsKey("b")){
            map.put("a", map.get("b"));
        }

        return map;
    }
    
    public Map<String, String> mapAB4(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){

            if(map.get("a").length() > map.get("b").length()){
                map.put("c", map.get("a"));
            } else if (map.get("b").length() > map.get("a").length()){
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }

        }

        return map;

    }


}
