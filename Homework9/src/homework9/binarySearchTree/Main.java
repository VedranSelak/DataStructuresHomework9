package homework9.binarySearchTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import homework9.Student;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BinarySearchTree<Long, Student> bst = new BinarySearchTree<Long, Student>();
		
		BufferedReader br = new BufferedReader(new FileReader("src/students.csv"));
		int i = 0;
		String row;
		while ((row = br.readLine()) != null) {
			System.out.println(row);
		    //bst.put(key, value);
		    i++;
		}
		System.out.println(i);
//		br.close();
		
//		long start = System.currentTimeMillis();
		
		//sorting the array using heap sort
//		HeapSort.sort(ipAddresses);
//		
//		System.out.println(System.currentTimeMillis() - start);
//		
//		//storing the sorted file to the new file
//		FileWriter writer = new FileWriter("src/new.csv");
//		for (i=0; i<ipAddresses.length; i++) {
//			writer.append(ipAddresses[i].toString());
//			writer.append("\n");
//		}
//		writer.flush();
//		writer.close();
	}
}
