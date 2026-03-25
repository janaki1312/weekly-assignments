import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean isSmallest = (n1 < n2 && n1 < n3);

        System.out.println("Is the first number the smallest? " + isSmallest);
        sc.close();
    }
}