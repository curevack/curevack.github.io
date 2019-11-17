import java.util.*;
import java.io.*;

/*Teacher comment:  Good job*/
public class myStudent {
	ArrayList<student>students;
	
public myStudent(String filename) {
		readData(filename);
}

public void readData (String fileName) {
	try {
		File fileN = new File(fileName);
		
		students = new ArrayList<student>();
		Scanner fileReader = new Scanner(fileN);
		while (fileReader.hasNextLine()) {
			students.add(new student(fileReader.nextLine()));
		}
		System.out.println("File loaded successfully");
	}
	catch (FileNotFoundException e) {
		System.out.println("File could not be found, please try again.");
		students = new ArrayList<student>();
	}
}
public String studentList (String gender) {
	String studentM= "";
	for (student student : genderCheck(students, gender)) {
		studentM+=", "+ student.giveName();
	}
	return studentM.substring(2);
}
public double avgAge(String gender) {
	double tAge=0;
	student[] lAge= genderCheck(students, gender);
	for (student student : lAge) {
		tAge+=student.giveAge();
	}
	return tAge/lAge.length;
}
public int numberOf(String gender) {
	return genderCheck(students, gender).length;
}
public String Age(int lAge) {
	String ageMatch = "";
	for (student student: students) {
		if (student.giveAge()>= lAge) {
			ageMatch+= ", "+ student.giveName();
		}
	}
	return ageMatch.substring(2);
}
public student[] genderCheck (ArrayList<student> students, String gender) {
	int matches= 0;
	for (student student : students) {
		if (student.GenderMatch(gender)) {
			matches++;
		}
	}
	student[] matched = new student[matches];
	int x=0;
	for (student student : students) {
		if (student.GenderMatch(gender)) matched[x++] =student;
	}
	return matched;
} 
}
class student {
	private int ID;
	private String Name;
	private String Gender;
	private double Age;
	
	public student (int ID,String Name,String Gender,int Age) {
		this.ID=ID;
		this.Name=Name;
		this.Gender=Gender;
		this.Age=Age;
	}
	public student (String something) {
		Scanner that = new Scanner(something);
		this.ID = that.nextInt();
		this.Name= that.next();
		this.Gender= that.next();
		this.Age= that.nextDouble();
	}
	public String returnGender () {
		return this.Gender;
	}
	public boolean GenderMatch (String gender) {
		return this.Gender.equalsIgnoreCase(gender);
	}
	public String giveName() {
		return Name;
	}
	public double giveAge() {
		return Age;
	}
	}

