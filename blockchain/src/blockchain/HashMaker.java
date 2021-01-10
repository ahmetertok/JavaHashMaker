package blockchain;

import java.util.Scanner;

public class HashMaker {

	public static void main(String[] args) {
		
				
				Scanner scn = new Scanner(System.in);   //input stream
				System.out.print("Enter a string: ");  
				String str = scn.nextLine();            //string reading   
				System.out.println("You have entered: " + str);
				System.out.println("Your string's HashCode: " + str.hashCode());  
				
				
			}

		}
		/*
		 * .hashCode() encryption method of java. We don't need to import anything
		 * 
		 * OUTPUT:
		 *Enter a string: test
		 *You have entered: test
		 *Your string's HashCode: 3556498
		 */


