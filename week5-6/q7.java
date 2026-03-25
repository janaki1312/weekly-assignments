import java.util.Scanner;

class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = new int[10];
        int i = 0;

        while (num != 0 && i < 10) {
            digits[i++] = num % 10;
            num /= 10;
        }

        int largest = 0, second = 0;

        for (int j = 0; j < i; j++) {
            if (digits[j] > largest) {
                second = largest;
                largest = digits[j];
            } else if (digits[j] > second && digits[j] != largest) {
                second = digits[j];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);

        sc.close();
    }
}