import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int index = 0;
        double sum = 0;

        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10)
                break;

            arr[index++] = num;
        }

        for (int i = 0; i < index; i++) {
            sum += arr[i];
            System.out.println(arr[i]);
        }

        System.out.println("Total = " + sum);
        sc.close();
    }
}