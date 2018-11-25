package algorithms.book;

import java.util.Arrays;
import java.util.Hashtable;

public class CI90 {


    public static boolean hasUniqueCharacters(String text){

        Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();

        for(char c:text.toCharArray()){
            if(table.containsKey(c)){
                return false;
            }
            table.put(c, 1);
        }
        return true;

    }

    public static boolean isPermutation(String text, String text2){
        Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
        for(char c:text.toCharArray()){
            if(table.containsKey(c)){
                table.put(c, table.get(c)+1);
            }
            else{
                table.put(c, 1);
            }
        }

        for(char c:text2.toCharArray()){
            if(table.get(c) == null){
                return false;
            }else{
                if(table.get(c) > 1){
                    table.put(c, table.get(c)-1);
                }
                else{
                    table.remove(c);
                }
            }
        }
        return table.isEmpty();

    }


    public static boolean hasUniqueCharactersNoDS(String text){
        for(int i=0; i<text.length(); i++){ //1
            char element = text.charAt(i); //a
            for(int j=i; j<text.length()-1; j++){ //0
                if(element == text.charAt(j+1)){ //b
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean isUniqueNoSpace(String text){
        char[] sorted = text.toCharArray();
        Arrays.sort(sorted);
        text = new String(sorted);

        for(int i=0; i<text.length()-1; i++){
            if(text.charAt(i) == text.charAt(i+1)){
                return false;
            }
        }
        return true;

    }

    static void appendSpaces(char[] text, int position){ //2
        char[] toAppend = new char[]{'%', '2', '0'};
        for(int i=text.length-1; i>(position+2); --i){ //5 - > 4
            text[i] = text[i-2];
        }

        for(int i=0; i<toAppend.length; ++i){
            text[position+i]=toAppend[i];
        }
    }


    public static String urlLify(String text){
        char[] textArray = text.toCharArray();
        for(int i=0; i<textArray.length; ++i){
            if(textArray[i] == ' '){
                appendSpaces(textArray, i);
            }
        }
        return new String(textArray);
    }
    public static String urlLify2(String text){
        text = text.trim();
        text= text.replaceAll("\\s", "%20");
        return text;
    }

    public static void urlLifyProblem(){
        String text = "Mr Jhon Smith    ";
        System.out.println(text);
        System.out.println(urlLify(text));

        System.out.println(urlLify2("Mr Jhon Smith    "));
    }



    public static void main(String[] args){

        String text ="abcd";
        String text2 = text+'a';

        System.out.println(hasUniqueCharacters(text));
        System.out.println(hasUniqueCharacters(text2));

        System.out.println(hasUniqueCharactersNoDS(text));
        System.out.println(hasUniqueCharactersNoDS(text2));

        System.out.println(isUniqueNoSpace(text));
        System.out.println(isUniqueNoSpace(text2));

        System.out.println("Is permutation "+isPermutation("aba", "baa"));
        System.out.println("Is permutation "+isPermutation("aba", "bab"));

        urlLifyProblem();
    }
}
