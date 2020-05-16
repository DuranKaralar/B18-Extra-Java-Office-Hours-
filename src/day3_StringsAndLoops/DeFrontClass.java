package day3_StringsAndLoops;

public class DeFrontClass {
    
    public String deFront(String str) {

        String word = str.substring(2);

        if(str.charAt(1) == 'b') {
            word = "b" + word;
        }

        if(str.charAt(0) == 'a'){
            word = "a" + word;
        }

        return word;
    }

}
