package sorting;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated methoint  stub
int a[]= {45,56,66,78,87,98,99};
int key=61;
int min=0;int max=a.length-1;
int avg=(max+min)/2;
		
		 if(key==a[avg])
		    {
			System.out.println("present");
	    }
		 else if(key<a[avg])
		 {
			 max=avg-1;
			avg=(min+max)/2;
					System.out.println("key present");
		 }

		 else if(key>a[avg])
		 {
			 max=avg+1;
			avg=(min+max)/2;
					System.out.println("key max present");
		 }
		 else
		 {
			 System.out.println("key not present");
		 }

	}

}
