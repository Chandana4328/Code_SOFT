import java.util.Scanner;

public class Student_GRADE_CALCULATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
		        Scanner scanner = new Scanner(System.in);

		        // Input number of subjects
		        System.out.print("Enter the number of subjects: ");
		        int num_Subjects = scanner.nextInt();

		        int[] marks = new int[num_Subjects];
		        int total_Marks = 0;

		        // Input marks for each subject
		        for (int i = 0; i < num_Subjects; i++) {
		            System.out.print("Enter marks for subject " + (i + 1) + ": ");
		            marks[i] = scanner.nextInt();
		            total_Marks += marks[i];
		        }

		        // Calculate average percentage
		        double ave_Percentage = (double) total_Marks / num_Subjects;

		        // Calculate grade
		        char grade;
		        if (ave_Percentage >= 90) {
		            grade = 'A';
		        } else if (ave_Percentage >= 80) {
		            grade = 'B';
		        } else if (ave_Percentage >= 70) {
		            grade = 'C';
		        } else if (ave_Percentage >= 60) {
		            grade = 'D';
		        } else {
		            grade = 'F';
		        }

		        // Display results
		        System.out.println("Total Marks: " + total_Marks);
		        System.out.println("Average Percentage: " + ave_Percentage + "%");
		        System.out.println("Grade: " + grade);

		        scanner.close();
		    }
		


	}


