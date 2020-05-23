package day4_StringAndLoops;

public class RepeatFrontClass {

    public String repeatFront(String str, int n) {

        String word = "";

        for(int i=0; i < n; i++) {

            word += str.substring(0, n - i);

        }

        return word;

    }

}
