package reverse;

public class reverse {
	
	

	public static void main(String[] args) {
		
	        int [] array1 = {12, 10, 16, 22, 34};
	       int length=array1.length;
	  
	        int[] array2 = new int[length];
	        int k = length;
	 
	        for (int i = 0; i < length; i++) {
	            array2[k - 1] = array1[i];
	            k = k - 1;
	           
	        }
	        for (int j = 0; j < length; j++) {
	        	 System.out.println(array2[j]);
	        }
	    }
	}
	
