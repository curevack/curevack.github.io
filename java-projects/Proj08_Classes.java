import java.util.*;
import java.io.*;

/*Teacher comment:  Good job*/
public class Proj08_Classes {

	public static void main(String[] args) {
		Scanner ans = new Scanner (System.in);
		System.out.println("Enter the file name: ");
		String filename = ans.nextLine();
		myStudent steve = new myStudent (filename);
		System.out.println("Enter specified gender: ");
		String gender = ans.nextLine();
		System.out.println("Students that are "+gender+" are "+steve.studentList(gender));
		System.out.printf("Their average age is %3.5f\n", steve.avgAge(gender));
		System.out.println("There are " + steve.numberOf(gender)+ " students that are "+ gender);
		System.out.println("State the minimum age of students: ");
		int lAge= ans.nextInt();
		System.out.println("Students of at least "+lAge+ " years: "+ steve.Age(lAge));

	}

}
