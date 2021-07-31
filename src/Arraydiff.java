import java.util.Arrays;
public class Arraydiff{

	  public static int[] arrayDiff(int[] a, int[] b) {
	    // Your code here
	   
	    int count = 0;
	    
	    if(b.length == 0 || a.length == 0) 
	    	return a;
	    
	    Arrays.sort(b);
	    int[] res = Arrays.stream(b).distinct().toArray();

	    int[] c = new int[a.length];
	    for(int i = 0; i < a.length; i++){
	      if(Arrays.binarySearch(res,a[i]) < 0){
	        System.out.print(i);
	      c[count] = a[i];
	      count++; 
	      }
	    } 
	   // System.out.println(count);
	    int[] x = new int[count];
	    for(int k = 0; k < x.length; k++){
	      x[k] = c[k];
	    }
	   // System.out.print(x[0]);
	    return x; 
	    }
}
	  