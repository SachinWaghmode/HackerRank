/* find out smallest missing integer in an array of 1-N elements.

*/

public class task1 {

	public static void main(String[] args) {
		
		System.out.println(getSmallInt());
		// TODO Auto-generated method stub
		
	}
	public static int getSmallInt(){
		int[] A = {-1,-3};
		int n = A.length;
		for(int i=0; i<n; i++){
			while( A[i]!= i+1){
				if((A[i] < 0 && A[i] > n+1) || (A[i] == A[A[i]])){
					break;
					
				}
				else
				{
					int temp = A[i];
	    			A[i] = A[temp - 1];
	    			A[temp - 1] = temp;
				}
			}	
		}

		for (int i = 0; i < n; i++){
    		if (A[i] != i + 1){
    			//System.out.println(i+1);
    			return i + 1;
    		}
    	}	
		//System.out.println(n+1);
    	return n + 1;
	}

}
