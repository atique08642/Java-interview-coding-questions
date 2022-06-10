import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharLinkedHashMap {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = FirstNonRepeatChar(s);
        System.out.println("First Non repeating character is" + " " + ch);
    }

    public static Character FirstNonRepeatChar(String str){
        HashMap<Character,Integer> charhashtable = new LinkedHashMap<Character,Integer>();

        for(int i=0; i<str.length();i++){
            Character ch = str.charAt(i);
            if (charhashtable.containsKey(ch)){
                charhashtable.put(ch, charhashtable.get(ch) + 1);
            }else
                charhashtable.put(ch,1);
        }
        for(Map.Entry<Character,Integer> entry: charhashtable.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
            }
                return null;
    }
}