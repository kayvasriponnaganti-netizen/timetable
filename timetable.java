import java.util.Scanner;

public class Timetable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SMART STUDY PLANNER =====");

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
        }

        System.out.print("Enter number of study days: ");
        int days = sc.nextInt();

        System.out.println("\n===== YOUR STUDY TIMETABLE =====");

        for (int day = 1; day <= days; day++) {

            System.out.println("\nDay " + day);

            for (int i = 0; i < n; i++) {

                if (i % 2 == 0) {
                    System.out.println("Morning   : " + subjects[i]);
                } else {
                    System.out.println("Evening   : " + subjects[i]);
                }
            }
        }

        System.out.println("\nGood luck with your preparation!");

        sc.close();
    }
}
