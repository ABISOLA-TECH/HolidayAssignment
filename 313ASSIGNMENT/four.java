package assignment;
import java.util.Scanner;

public class questionfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ASSIGNING ELEMENTS TO AN ARRAY OF LENGTH 10
		
		
		
		 int[] array = new int[10];
	        
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("Enter the value for index " + i + ": ");
	            array[i] = scanner.nextInt();
	        }
	        
	        
	        
	        //4B, FOR EACH LOOP TO PRINT THE INPUT
	        System.out.println("You entered the following values:");
	        for (int value : array) {
	            System.out.print(value + " ");
	        }

	}

}
