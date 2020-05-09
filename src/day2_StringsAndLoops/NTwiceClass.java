package day2_StringsAndLoops;

public class NTwiceClass {

    public static void main(String[] args) {
        System.out.println(nTwice("Hello",1));
        // substring(0,1) -> H
        // substring(4) -> o
        System.out.println(nTwice("Hello",2));
        // substring(0,2) -> He
        // substring(3) -> lo

        // front = substring(0,n)
        // back = substring(str.length()-n)
    }

    public static String nTwice(String str, int n) {

        String front = str.substring(0,n);
        String back = str.substring(str.length()-n);

        return front + back;

    }

}
