package assignment;

public class questiononea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USING A SINGLE LOOP FOR THE NIGERIA FLAG
		
		 int rows = 6; 
	        int columns = 9; 

	        for (int i = 0; i < rows * columns; i++) {
	            if ((i % columns) < 3) { 
	                System.out.print("* ");
	            } else if ((i % columns) < 6) { 
	                System.out.print("= ");
	            } else { 
	                System.out.print("* ");
	            }

	            
	            if ((i + 1) % columns == 0) {
	                System.out.println();
	            }
	        }

	}

}
