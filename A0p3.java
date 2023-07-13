import java.util.Scanner;

public class A0p3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("How many students do you want to input? ");
		int num = input.nextInt();
		System.out.println();
		String Student;
		int age;
		int Age[] = new int [num]; // Enter any input array size for testing
		String Name[]  =  new String [num]; // Names of Strings

		for (int i = 0; i < num; i++) {
			System.out.println("Enter information for student " + (i+1) + ":");

			//Ask for Name
			System.out.print("Name: ");
			Student = input.next(); //Getting name
			Name[i] = Student; // Store name using a placeholder

			//Ask for age
			System.out.print("Age: ");
			age = input.nextInt();
			Age[i] = age;

			System.out.println();
		}
		System.out.println("The students you entered are:");
		for (int k = 0; k < num; k++) {
			System.out.println(""+Name[k] + " is " + Age[k] + " years old."); //Use array to get user input through for-loop

		}
	}


}
 
	

	
