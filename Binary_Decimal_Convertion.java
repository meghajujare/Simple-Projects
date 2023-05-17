import java.util.Scanner;

public class Binary_Decimal_Convertion {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int choice, num;
        System.out.println("Enter 1 for binary to decimal convertion");
        System.out.println("Enter 2 for decimal to binary convertion");
        choice = in.nextInt();
        if (choice == 1) {
            num = Binary_to_Decimal(in);
            System.out.println("The decimal number is: " + num);
        } else if (choice == 2) {
            num = Decimal_to_Binary(in);
            System.out.println("The decimal number is: " + num);

        } else {
            System.out.println("Invalid Choice");
        }
        in.close();
    }

    static int Binary_to_Decimal(Scanner in) {
        int n;
        System.out.println("Enter a Binary number");
        n = in.nextInt();
        int pow = 0, dec = 0, lastDigit;
        while (n > 0) {
            lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        return dec;
    }

    static int Decimal_to_Binary(Scanner in) {
        int n;
        System.out.println("Enter a Decimal number");
        n = in.nextInt();
        int pow = 0, BinNum = 0, rem;
        while (n > 0) {
            rem = n % 2;
            BinNum = BinNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        return BinNum;
    }

}
