package assignment;
import java.util.Scanner;


public class questionfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ASSIGNING ELEMENTS TO A TWO-DIMENSIONAL ARRAY OF SIZE 10 BY 10

		
		 int[][] array = new int[10][10];
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter values for a 10x10 array:");
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print("Enter the value for index [" + i + "][" + j + "]: ");
	                array[i][j] = scanner.nextInt(); 	            }
	        }

	        
	        //5B, PRINTING THE INPUT USING A FOR EACH LOOP
	        System.out.println("\nThe elements in the 10x10 array are:");
	        for (int[] row : array) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	}

}
