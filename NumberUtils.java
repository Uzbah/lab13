package lab11;

public class NumberUtils {
	  public int findMax(int[] numbers) {
	        if (numbers == null || numbers.length == 0) {
	            throw new IllegalArgumentException("Array must not be empty or null");
	        }

	        int max = numbers[0];
	        for (int num : numbers) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }

	    public int findMin(int[] numbers) {
	        if (numbers == null || numbers.length == 0) {
	            throw new IllegalArgumentException("Array must not be empty or null");
	        }

	        int min = numbers[0];
	        for (int num : numbers) {
	            if (num < min) {
	                min = num;
	            }
	        }
	        return min;
	    }
	

}
