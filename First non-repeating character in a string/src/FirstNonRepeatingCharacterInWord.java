import java.util.Scanner;

public class FirstNonRepeatingCharacterInWord {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;

        for(char i: str.toCharArray()){

            if(str.indexOf(i) == str.lastIndexOf(i)){
            System.out.println("First non-repeating character is" + " " + i);
            flag = false;
            break;

            }

        }

        if(flag){
            System.out.println("There is no repeating string");
        }

    }
}
