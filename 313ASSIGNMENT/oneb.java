package assignment;

public class questiononeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//USING A NESTED LOOP FOR THE NIGERIAN FLAG
		   int rows = 6; 
	        int columns = 9;

	        for (int i = 0; i < rows; i++) { 
	            for (int j = 0; j < columns; j++) { 
	                if (j < 3) { 
	                    System.out.print("* ");
	                } else if (j < 6) { 
	                    System.out.print("= ");
	                } else { 
	                    System.out.print("* ");
	                }
	            }
	            System.out.println(); 
	        }

	}

}
