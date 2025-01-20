package assignment;

public class questiontwob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//USING A NESTED LOOP FOR THE FLAG

		int rows = 6; 
        int stars = 4; 
        int equals = 7; 

        for (int i = 1; i <= rows; i++) {
            if (i <= 3) { 
                for (int j = 1; j <= stars; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <= equals; j++) {
                    System.out.print("= ");
                }
            } else { 
                for (int j = 1; j <= (stars + equals); j++) {
                    System.out.print("= ");
                }
            }
            System.out.println(); 
        }
	}

}
