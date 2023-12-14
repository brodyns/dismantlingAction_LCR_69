import java.util.HashMap;
import java.util.LinkedHashMap;


public class Main {
    public static void main(String[] args) {
        System.out.println((new Solution()).dismantlingAction("abbccdeff"));
    }
}

class Solution {
    public char dismantlingAction(String arr) {
        HashMap<Character, Boolean> set = new LinkedHashMap<>();
        for(char c : arr.toCharArray()){
            set.put(c, !set.containsKey(c));
        }
        for(char c: set.keySet()){
            if(set.get(c)) return c;
        }
        return ' ';
    }
}
