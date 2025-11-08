import java.util.Scanner;
public class MarksGrade { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int sub1, sub2, sub3, sub4, sub5, total;
        //double average;

        System.out.println("Enter marks of 5 subjects (out of 100): ");
        System.out.print(" Marks in Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print(" Marks in Subject 2 : ");
         int sub2 = sc.nextInt();
        System.out.print(" Marks in Subject 3: ");
        int sub3 = sc.nextInt();
        System.out.print(" Marks in Subject 4: ");
         int sub4 = sc.nextInt();
        System.out.print(" Marks in Subject 5: ");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
       double average = total / 5;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + average + "%");
        if (average > 90) {
            System.out.println("Grade: Ex");
        } else if (average > 80) {
            System.out.println("Grade: A");
        } else if (average > 60) {
            System.out.println("Grade: B");
        } else if (average >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}


