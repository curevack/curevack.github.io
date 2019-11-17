/* Kerim Curevac
 * curevackerim129@gmail.com
 * CS210- Fall Quarter
 * 12/07/17
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/* In CS210, I have learned the core concepts within Java programming given within the first 8 chapters of the text book.
 * From creating simple println statements that just gave an output of their own content, to making projects that are capable of deciphering or encrypting messages, or a tool box of useful tools to me!
 * My biggest challenges in the class was just becoming more efficient and neater with my code, even now my code is still fairly difficult to follow unless I am guiding through it.
 * I plan to just space better, and put more time to figuring out more efficient means of reaching the output that I seek.
 */
public class myToolBox {
	/* --Reasoning for why I chose the methods I did--
	 * stringVowelCheck- For possible future use, a test to be included with complex programs as a decipher or a password check
	 * 		ex. inputs: Kerim											ggg
	 * 			ouput: "Does Kerim contain any vowels? true"			"Does ggg contain any vowels? false"
	 * 			
	 * checkPrime- Can be used to evaluate possible bugs involving the lack of factoring due to prime numbers, and can be used to find all values to a given limit
	 * 		ex. inputs: 0							17
	 * 			output: "0 is not a prime number"	"17 is a prime number"
	 * 
	 * mergeArray- Merging data structures, considering its recent presence at least in the class, will definitely be useful in the future with more complex forms of code and data in take
	 * 		ex. inputs: int [] x = {0, 3, 4};>											= {1, 1, 1};
	 * 					int [] y = {0, 1, 1};> these three will be put as there names	= {2, 2, 2};
	 * 					int [] a = {2, 2, 2};>											= {3, 3, 3};
	 * 					> Like this < merge (x, y, z)
	 * 			output:	[0, 3, 4, 0, 1, 1, 2, 2, 2]										[1, 1, 1, 2, 2, 2, 3, 3, 3]
	 * 
	 * digitSum- Simply for the purpose of efficiency if certain values are needed or sought for in the means of a large value added, can be used to reduce data structures, and increase space
	 * 		ex. inputs: 123							222333
	 * 			output: 6							15
	 * 
	 * fileCheck- Verifying a files existence
	 * 		ex. inputs: text.txt (file exist in folder)			hbkhbaskhb
	 * 			output:	"File exists."							"File does not exist, please try again." 
	 * 
	 * waitForAcceptableValue- A means to prevent code failure on the user end, only allows acceptable values passed by the coder/ aka me
	 * 		ex. inputs: "Say yes.", yes								"Say no.", no
	 * 			output:  <Will be dependent on user>				<User says "yes" in this case>
	 * 					   -assuming user says yes-					Output will reprint the statement, "Say no." until it is 'no'
	 * 			<they pass through the while loop, no output>
	 * 
	 * question- Efficiency, and line reduction. Asks questions and takes responses for use in other methods or to be saved, done through a scanner
	 * 		ex. inputs: "What is 9+10?"
	 * 			output: A scanner with the user's answer.
	 * 
	 * scannerForFiles- Takes the contents of a file and saves it in a scanner to be used in whatever means need be
	 * 		ex. inputs: students.txt									inputs: ajbfkbkab
	 * 			output: <If File is read>										<If File is not read>
	 * 			Information will be read into a scanner and returned.	exception caught, and restarts into the file loop
	 * 																	"Enter input filename: "
	 * 
	 * arrayReverse- Reverses an array, a means to adjust content in data or indexed values
	 * 		ex. inputs: int [] x = {1, 2, 3, 4, 5, 6};			int [] x = {1, 3, 5, 7, 9};
	 * 			output:	6										9
	 * 					5										7
	 * 					4										5
	 * 					3										3
	 * 					2										1
	 * 					1
	 * 
	 * sentinelCalculation- A calculator for basic addition that uses a sentinel and allows the user to decide when to quit
	 * 		ex. inputs:	5					22
	 * 					4					13
	 * 					5					19
	 * 			output: "The sum is 14"		"The sum is 54"	
	*/
//the isAllVowels method is used by the stringVowelCheck method primarily to check a string for any vowels, and will return a statement saying true if it does, false if not.
	private boolean isAllVowels(String string) { //takes in a string from the user
		if(string.length()==0) {
			return true;
		}
		for (int i=0; i<=1; i++) { //evaluates characters for vowels, not case sensitive
			char c=string.charAt(i);
			if (c=='a' || c=='e' || c=='i' || c=='o' 
			|| c=='u' || c=='A' || c=='E' || c=='I'
			|| c=='O'||c=='U') {
				return true; //if it finds a vowel, 
			}
		}
		//if none are evaluated it returns false
		return false;
	}
	//just takes a string from user input, and evaluates it through the isAllVowels method
	public void stringVowelCheck() { //just uses the method isAllVowels to evaluate user input
		String n;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a string:");
		n=input.nextLine();
		boolean ans= isAllVowels(n);
		System.out.println("Does "+n+" contain any vowels? "+ ans); //gives answer if statement had vowels or not

	}
	//checkPrime takes a number and checks if it is a prime number and returns whether it is a prime # or not one
	public void checkPrime(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;

		if (n == 0 || n == 1) { //checks 0 and 1 in case user chose them
			System.out.println(n + " is not a prime number");

		} else {

			for (i = 2; i <= m; i++) { //follows a 2 factor toward the value of n/2

				if (n % i == 0) { //checks if n can be factored by a multiple of 2

					System.out.println(n + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) { //if none of the checks above pass, then n is prime
				System.out.println(n + " is a prime number");
			}
		}
	}
	//takes 3 arrays, and merges there contents into a single array that is returned as array z
	public int[] mergeArrays(int[] x, int[] y,int[]a) { //can be adjusted for more, but for simplicity for now will be default 3 arrays
		int xLength= x.length; //takes the length of x
		int yLength= y.length; //takes the length of y
		int aLength= a.length; //takes the length of a
		int [] b= new int [xLength+yLength]; //makes the length of b x+y
		System.arraycopy(x, 0, b, 0, xLength); //copies the values of x into b
		System.arraycopy(y, 0, b, xLength, yLength); //copies the values of y into b
		int bLength=b.length; //makes the new length of b
		int [] z= new int [bLength+aLength]; // creates a new array z, with the length of b+a
		System.arraycopy(b, 0, z, 0, bLength); //copies b's contents into z
		System.arraycopy(a, 0, z, bLength, aLength); //copies a's conents into z
		return z; //returns z
}
	//adds all the numbers given as num, adding them up and returning a sum
	public int digitSum (int num) { //takes variable num, and adds the individual numerals within num to give an answer (sum)
		int sum=0;
		while (num!=0) { //mathematical evaluations to achieve each numeral one by one
			int num2= num%10;
			sum+=num2;
			num= num/10;
		}
		return sum; //sum being returned once num has become 0
	}
	//checks a file name given by the user if it exists or not
public void fileCheck (String fileName) {
	try { //takes the string fileName and makes a file with the name, a scanner is used just so an exception can be achieved if there is one through not finding the file
		File fileN = new File(fileName);
		Scanner check = new Scanner (fileN);
		System.out.println("File exists.");
	}
	catch (FileNotFoundException e) { //exception thrown if file is not found
		System.out.println("File does not exist, please try again.");
	}
}
	//simple test for acceptable values, takes a question, and the acceptable answers, and checks a users inputs if they match with the acceptable answers to a later question
public static char waitForAcceptableValue(String whatToAsk, String answers) {

    Scanner s = new Scanner(System.in);
    
    while (true){ //keeps evaluating a users response to the answers index, and checking if they match or not, otherwise keeps going through the while loop
        System.out.print(whatToAsk);
        String userTyped = s.next();

        if (userTyped.length() == 1) { 
            
            if (answers.indexOf(userTyped.charAt(0)) >= 0) {
                return userTyped.charAt(0);
            }
        }
    }
}
	//Asks a user question provided and saves the response from the user in the scanner
public static String question(String whatToAsk) { //when the method is used, takes the string given and poses it as the question and then takes the user response into a new scanner
    System.out.println(whatToAsk);

    return new Scanner(System.in).nextLine();
}
	//Meant to read a file with a scanner, and take its contents
public static Scanner scannerForFiles() {
    while (true) { //keeps evaluating until file is found and does not equal null, and then reads the file and returns it
        Scanner input = null;
        String fileName = question("Enter input filename:");

        try {
            File file = new File(fileName);
            input = new Scanner(file);
        }
        catch (FileNotFoundException e) {
        }

        if (input != null) return input;
    }
}
	//takes an array and reverses the contents
public void arrayReverse(int []x) {
	int xLength = x.length; //takes the length of the array given to it
    int[] array = new int [xLength]; //makes a new array equal to the length
    System.arraycopy(x, 0, array, 0, xLength);//copies x's contents into new array
    for (int i=0;i<array.length/2;i++) //begins to take the index values of array x, and starts evaluating and reversing them
    {
        int tmp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = tmp;
    }
    //prints the values from new array
    for (int i : array)
        System.out.println(i);
}
	//An addition calculator that has a sentinel system to allow the user to quit when done
public void sentinelAdditionCalc () {
	System.out.println("I will be calculating a sum for whatever values you give me.");
	Scanner num = new Scanner(System.in); //records the users given number
	int x = 1; //just sets a value for x
	int sum = 0; //Initializes sum to be changed later
	while (x != 0) { //until the user decides to stop by stating 0, loop will continue and adding values to sum
		System.out.print("Enter a number (0 to quit): ");
		x = num.nextInt(); //takes the next user input
		sum += x;	
	}
	System.out.println("The sum is " + sum); //prints the sum once out of the while loop
}
}