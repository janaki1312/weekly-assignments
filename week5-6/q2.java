import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is Positive Even");
                else
                    System.out.println(num + " is Positive Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        // compare first and last
        if (arr[0] == arr[4])
            System.out.println("Equal");
        else if (arr[0] > arr[4])
            System.out.println("First is Greater");
        else
            System.out.println("Last is Greater");

        sc.close();
    }
}