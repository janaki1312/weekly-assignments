import java.util.Scanner;

class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years: ");
            int years = sc.nextInt();

            if (salary < 0 || years < 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }

            double bonus = (years > 5) ? salary * 0.05 : 0;
            totalBonus += bonus;

            System.out.println("Bonus: " + bonus);
        }

        System.out.println("Total Bonus = " + totalBonus);
        sc.close();
    }
}