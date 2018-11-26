package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class ResizableArray {


    public static void arrayList() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("world");
        list.add("abd");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }


    public static String mergeWords(String[] words) {
        /*
        Naive
        String result = "";
        for(String item:words){
            result += item;
        }
        return result;
         */

        StringBuilder stringBuilder = new StringBuilder();
        for (String item : words) {
            stringBuilder.append(item);
        }

        return stringBuilder.toString();
    }

    public static void stringBuilder() {
        String[] words = new String[]{"hi", "hello", "world"};
        System.out.println(mergeWords(words));
    }

    public static void main(String[] args) {
        arrayList();

        stringBuilder();


    }
}
