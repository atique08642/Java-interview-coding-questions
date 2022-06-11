import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicatesUsingHashMap {

    static void removeDuplicate(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        //Print Each Key
        map.forEach((k, v) -> System.out.print(k + " "));

    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        removeDuplicate(arr,n);

    }
}
