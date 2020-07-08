package day8_Collections;

import java.util.Map;

public class CodingBatMaps {

    public Map<String, String> mapBully(Map<String, String> map) {

        if(!map.containsKey("a")) return map;

        String a = map.get("a");

        if(!a.isEmpty()){

            map.put("b", a);
            map.put("a","");

        }

        return map;

    }

}
