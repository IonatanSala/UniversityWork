package Lab3;


import java.util.Arrays;
import java.util.Scanner;



public class HuffmanEncoding {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner
		System.out.print("Type in the string you want to use : ");
		
		
		String userString = scan.nextLine(); // Scan the users string
		
		String[] binaryArray = new String[userString.length()]; // this will be filled with the binary Strings
		
		int[] intArray = new int[256]; // array to store the int representation of the char
		
		for(int i = 0; i<userString.length(); i++) {
			
			String binaryNum = Integer.toBinaryString((int)userString.charAt(i)); // transform the char into the binary representation of that char
			
			intArray[(int)userString.charAt(i)] += (int)userString.charAt(i); // stores the int representation of the char in a array
			
			binaryArray[i] = binaryNum; // add the binary string to the binary array
			
			// just in case there is binary string with only 6 bits, it changes it to 7 bits
			if(binaryArray[i].length() == 6) binaryArray[i] = "0" + binaryArray[i]; 
		}
		
		// Prints out the binary representation of the string
		for(int i = 0; i<binaryArray.length; i++) {
			System.out.print(binaryArray[i]+" ");
			if((i+1) % 8 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("");
		
		// prints out how many times each character occurs
		for(int i = 0; i<intArray.length; i++) {
			if(intArray[i] != 0 ) {
				if((intArray[i]/i) == 1) {
					System.out.println("'" + (char)i + "' appeared " + (intArray[i]/i) + " time");
				} else {
					System.out.println("'" + (char)i + "' appeared " + (intArray[i]/i) + " times");
				}
				
			}
		}
		
		
		
		
		

	}
	
	

}
