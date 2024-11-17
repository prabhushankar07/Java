import java.util.*;
class anagrams{
    public static void main(String args[]){
        String s1 = "geeks";
        String s2 = "kseeg"; 
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        boolean result=Arrays.equals(s1Array, s2Array);
        System.out.println(result);
    }
}