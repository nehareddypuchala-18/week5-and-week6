import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        if (number < 0) {
            number = -number;
        }

       
        int temp = number;
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

       
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        if (temp == 0) {
            digits[index++] = 0;
        } else {
            while (temp != 0) {
                digits[index++] = temp % 10;
                temp = temp / 10;
            }
        }

       
        int[] freq = new int[10];

       
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

       
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}