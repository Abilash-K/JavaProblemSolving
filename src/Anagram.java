import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    static boolean isAnagramSorting(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        return Arrays.equals(charA, charB);
    }

    static boolean isAnagramHashMap(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        HashMap<Character,Integer> stringHashMapA= new HashMap<>();
        HashMap<Character,Integer> stringHashMapB= new HashMap<>();

        for(int i=0;i<a.length();i++){
            stringHashMapA.put(a.charAt(i), stringHashMapA.getOrDefault(a.charAt(i), 0) + 1);
            stringHashMapB.put(b.charAt(i), stringHashMapB.getOrDefault(b.charAt(i), 0) + 1);
        }

        return stringHashMapA.equals(stringHashMapB);
    }

    public static void main(String[] args) {
    String A = "Cat";
    String B = "Tac";

    System.out.println(Anagram.isAnagramSorting(A,B));
    System.out.println(Anagram.isAnagramHashMap(A,B));
    }
}