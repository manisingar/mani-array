package sorting;

public class bubblesort {

	public static void main(String[] args) {
		//REVERSE NUMBER IN ARRAY(right)
		int a[]= {22,4,67,89,11,56,-2,-34};
		
		
		for (int j=0;j<a.length-1;j++)
		{
		for(int i=0;i<a.length-1;i++)
		{   if(a[i]>a[i+1])
		    {
			int temp1=a[i];
		    a[i]=a[i+1];
		   a[i+1]=temp1;
		    }
	    }
		}
	
		for(int k=0;k<a.length-1;k++)
		{
			System.out.println(a[k]+" ");
		}

	}

}
