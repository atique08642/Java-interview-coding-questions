import java.util.Scanner;

public class PositiveOrNegativeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >=0 ) {
            if (num == 0)
                System.out.println("Number is zero");
            else
                System.out.println("Number is positive");
        }
        else
            System.out.println("number is negative");

    }

}

