import java.util.*;
public class Array_2
{
	public static void main(String[] args) {
	    
	    answer();
	}
	    static void answer(){
	    int[] arr = {1, 3, 6, 7, 7, 7, 13, 15, 20};
	    int target = 7;
	    int start = 0;
	    int len = arr.length-1;
	    int end = len;
	    ArrayList<Integer> ans = new ArrayList<>();
	    ans.add(-1);
	    ans.add(-1);
	    
	    while(start < end){
	        int mid = (start + end)/2;
	        if(target == arr[mid]){
	            ans.set(0, mid);
		    end = mid;

	        }
	        else if(arr[mid] > target){
	            end = mid-1;
	        }
	        else if(arr[mid] < target){
	            start = mid +1;
	        }
	    }
	    start=0;
	    end = len;
	    
	    while(start < end){
	        int mid = (start + end)/2;
	        if(target == arr[mid]){
	            ans.set(1, mid);
	            start = mid +1;
	        }
	        else if(arr[mid] > target){
	            end = mid;
	        }
	        else if(arr[mid] < target){
	            start = mid +1;
	        }
	    }

        System.out.println(ans);
	}
}