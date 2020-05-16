package day3_StringsAndLoops;

public class XyzThereClass {

    public boolean xyzThere(String str) {

        if(str.startsWith("xyz")) return true;

        for(int i=0; i < str.length(); i++) {

            String word = str.substring(i,i+4);
            // word.endsWith("xyz");
            if(!word.startsWith(".") && word.substring(1).equals("xyz")){
                return true;
            }

        }

        return false;
    }

}
