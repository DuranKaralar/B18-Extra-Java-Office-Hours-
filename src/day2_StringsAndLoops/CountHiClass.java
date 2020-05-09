package day2_StringsAndLoops;

public class CountHiClass {

    public static void main(String[] args) {

        String str = "java cs java pro";
//        System.out.println(str.replace("java","c#"));
//        System.out.println(str.replaceFirst("java","#c"));
        int count = 0;
        while(str.contains("java")){
            count++;
            str = str.replaceFirst("java","");
            System.out.println(str);
        }
        System.out.println(count);


    }


    public int countHi(String str) {
        int count = 0;
        for(int i=0; i < str.length()-1; i++) {

            String word = str.substring(i, i+2);

            if(word.equals("hi")) count++;

        }

        return count;

    }

}
