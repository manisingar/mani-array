
public class Evenoradd {

	public static void main(String[] args) {
		// FIND ADD AND EVEN NUMBER IN ARRAY
		 int a[]= {54,32,56,78,45,89};
	     for(int i=0;i<a.length;i++) 
	     {  
	    	 if(a[i]%2==0)
	       {	 
	    	 System.out.println(a[i]);
	        }else if (a[i]%2!=0)
	        {
	        	System.out.println("even");
	        }
	     }
	}

}
