package homework9.binarySearchTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import homework9.Student;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BinarySearchTree<Integer, Student> bst = new BinarySearchTree<Integer, Student>();
		
		BufferedReader br = new BufferedReader(new FileReader("src/students.csv"));

		String row;
		while ((row = br.readLine()) != null) {
			String[] data = row.split(";");
			Student student = new Student(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], data[5], Integer.parseInt(data[6]));
		    bst.put(student.getId(), student);
		}
		System.out.println("Type 'quit' to exit the program!");
		
		while(true) {
			System.out.println("Enter the ID of the student you want to retrieve: ");
			Scanner reader = new Scanner(System.in);
			String input = reader.nextLine();
			if (input.equals("quit")) {
				break;
			}
			Student student = bst.get(Integer.parseInt(input));
			System.out.println();
			if(student != null) {
				System.out.println("Student ID: " + student.getId());
				System.out.println("Name and surname: " + student.getFullName());
				System.out.println("Data of birth: " + student.getDateOfBirth());
				System.out.println("University: " + student.getUniversity());
				System.out.println("Department code: " + student.getDepartmentCode());
				System.out.println("Department: " + student.getDepartmentName());
				System.out.println("Year of enrolment: " + student.getYearOfEnrolment());
				System.out.println("The student was retrieved from th BST in " + bst.getCount() + " steps.");	
			} else {
				System.out.println("The student with given ID does not exist.");
				System.out.println("The search was completed in " + bst.getCount() + " steps.");
			}
			System.out.println();
		}
	}
}
