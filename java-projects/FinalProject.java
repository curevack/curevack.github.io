
/* Kerim Curevac
 * curevackerim129@gmail.com
 * CS210- Fall Quarter
 * 12/07/17
 */
import java.util.*;
import java.io.*;

public class FinalProject {

	public static void main(String[] args) {
		String fileName = "students.txt";
		int[] x = { 8, 72, 33, 99 };
		int[] y = { 17, 22, 99, -222 };
		int[] a = { 31, 2, 18, -33, 872 };
		myToolBox wrench = new myToolBox();
		wrench.stringVowelCheck(); //input a string
		wrench.checkPrime(72); //checks the number 72
		int[] z = wrench.mergeArrays(x, y, a); //inputs x, y, a
		System.out.println(Arrays.toString(z)); //outputs the merged z array
		System.out.println(wrench.digitSum(3333339)); //outputs the results of tested number 3333339
		wrench.fileCheck(fileName); //checks file fileName
		wrench.waitForAcceptableValue("Please say 1.", "1"); //takes the two strings, question and accepted input
		System.out.println(wrench.question("What is your name?")); //uses the string given What is your name?, and takes the next user input
		Scanner output = wrench.scannerForFiles(); //makes output equal to the evaluation of scanner for files method
		System.out.println(output.nextLine()); //prints scanner output next line
		wrench.arrayReverse(x); //reverse array x
		wrench.sentinelAdditionCalc(); //does addition
	}
}
