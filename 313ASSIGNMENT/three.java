package assignment;

import java.util.Arrays;

public class questionthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//JAVA PROGRAM TO FING THE MEAN, MEDIAN AND STANDARD DEVIATION
		
		 int[] array = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

	        
	        double mean = calculateMean(array);
	        System.out.println("Mean: " + mean);

	        double median = calculateMedian(array);
	        System.out.println("Median: " + median);

	     
	        double stdDeviation = calculateStandardDeviation(array, mean);
	        System.out.println("Standard Deviation: " + stdDeviation);
	    }

	    // Method to calculate the mean
	    public static double calculateMean(int[] array) {
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        return (double) sum / array.length;
	    }

	    // Method to calculate the median
	    public static double calculateMedian(int[] array) {
	        Arrays.sort(array); // Sort the array
	        int n = array.length;
	        if (n % 2 == 0) {
	      
	            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
	        } else {
	           
	            return array[n / 2];
	        }
	    }

	    // Method to calculate the standard deviation
	    public static double calculateStandardDeviation(int[] array, double mean) {
	        double sumSquaredDiff = 0;
	        for (int num : array) {
	            sumSquaredDiff += Math.pow(num - mean, 2);
	        }
	        return Math.sqrt(sumSquaredDiff / array.length);

	}

}
