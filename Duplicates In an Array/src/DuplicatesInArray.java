import java.util.Scanner;

public class DuplicatesInArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dup = new int[n];
        for(int i =0; i<dup.length; i++){
            dup[i] = sc.nextInt();
        }

        System.out.println("Duplicates are : ");
        for(int i =0; i<dup.length; i++){
            for(int j=i+1; j<dup.length; j++){
                if(dup[i] == dup[j])
                    System.out.println(dup[i]);
            }
        }

    }
}
