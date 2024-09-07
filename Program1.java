package MCA;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll no: ");
        int rollno = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter full name: ");
        String FullName = scanner.nextLine();

        System.out.print("Enter address: ");
        String Address = scanner.nextLine();

        System.out.print("Enter stream: ");
        String stream = scanner.nextLine();

        int[] marks = new int[5];
        System.out.println("Enter marks in 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percentage = (totalMarks / 500.0) * 100;

        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollno);
        System.out.println("Full Name: " + FullName);
        System.out.println("Address: " + Address);
        System.out.println("Stream: " + stream);
        System.out.print("Marks: ");
        
        for (int j = 0; j < 5; j++) { // Changed the variable name to j
            System.out.print("Subject " + (j + 1) + ": " + marks[j] + " ");
        }
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
    }
}
